package com.esc20.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.mail.MessagingException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.esc20.model.BeaUsers;
import com.esc20.model.BhrEmpDemo;
import com.esc20.nonDBModels.AppLeaveRequest;
import com.esc20.nonDBModels.Code;
import com.esc20.nonDBModels.District;
import com.esc20.nonDBModels.LeaveEmployeeData;
import com.esc20.nonDBModels.LeaveInfo;
import com.esc20.nonDBModels.LeaveParameters;
import com.esc20.nonDBModels.LeaveRequestModel;
import com.esc20.nonDBModels.LeaveUnitsConversion;
import com.esc20.nonDBModels.Options;
import com.esc20.service.IndexService;
import com.esc20.service.LeaveRequestService;
import com.esc20.service.ReferenceService;
import com.esc20.util.DateUtil;
import com.esc20.util.StringUtil;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

@Controller
@RequestMapping("/leaveRequest")
public class LeaveRequestController extends BaseLeaveRequestController {

	@Autowired
	private IndexService indexService;
	
	@Autowired
	private LeaveRequestService service;

	@Autowired
	private ReferenceService referenceService;
	
	private final String module= "Leave Request List View";
	
	@RequestMapping("leaveRequest")
	public ModelAndView leaveRequest(HttpServletRequest req, String SearchType, String SearchStart, String SearchEnd,
			String freq,Boolean isAdd) throws ParseException {
		HttpSession session = req.getSession();
		BeaUsers user = (BeaUsers) session.getAttribute("user");
		BhrEmpDemo userDetail = this.indexService.getUserDetail(user.getEmpNbr());
        Options options = this.indexService.getOptions();
        String district = (String)session.getAttribute("districtId");
        District districtInfo = this.indexService.getDistrict(district);
        userDetail.setEmpNbr(user.getEmpNbr());
        userDetail.setDob(DateUtil.formatDate(userDetail.getDob(), "yyyyMMdd", "MM-dd-yyyy"));
        List<Code> gens = referenceService.getGenerations();
		 	for(Code gen: gens) {
		    	if(userDetail.getNameGen() != null && gen.getCode().trim().equals(userDetail.getNameGen().toString().trim())) {
		    		userDetail.setGenDescription(gen.getDescription());
		    	}
		    }
		

        String phone = districtInfo.getPhone();
        districtInfo.setPhone(StringUtil.left(phone, 3)+"-"+StringUtil.mid(phone, 4, 3)+"-"+StringUtil.right(phone, 4));

		 session.setAttribute("userDetail", userDetail);
         session.setAttribute("companyId", district);
         session.setAttribute("options", options);
         session.setAttribute("district", districtInfo);
		
		ModelAndView mav = new ModelAndView();
		SimpleDateFormat sdf1 = new SimpleDateFormat("MM-dd-yyyy HH:mm:ss");
		mav.setViewName("/leaveRequest/leaveRequest");
		AppLeaveRequest request = new AppLeaveRequest();
		BhrEmpDemo demo = ((BhrEmpDemo) session.getAttribute("userDetail"));
		LeaveParameters params = this.service.getLeaveParameters();
		List<Code> availableFreqs = this.service.getAvailableFrequencies(demo.getEmpNbr());
		LeaveEmployeeData supervisorData = this.service.getFirstLineSupervisor(demo.getEmpNbr(), params.isUsePMIS());
		String supervisorEmpNbr = supervisorData==null?null:supervisorData.getEmployeeNumber();
		if (supervisorEmpNbr == null) {
			supervisorEmpNbr = "";
			mav.addObject("haveSupervisor", false);
		}else {
			mav.addObject("haveSupervisor", true);
		}
		if(isAdd == null) {
			isAdd = false;
		}
		if(isAdd) {
			mav.addObject("addRow", true);
		}
		else {
			mav.addObject("addRow", false);
		}
		request.setLvTyp(SearchType);
		if (SearchStart != null && !("").equals(SearchStart)) {
			request.setDatetimeFrom(sdf1.parse(SearchStart + " 00:00:00"));
		}
		if (SearchEnd != null && !("").equals(SearchEnd)) {
			request.setDatetimeTo(sdf1.parse(SearchEnd + " 23:59:59"));
		}
		List<Code> leaveStatus = this.referenceService.getLeaveStatus();
		//List<Code> gens = referenceService.getGenerations();
		if (freq == null || ("").equals(freq)) {
			if (availableFreqs.size() > 0) {
				freq = availableFreqs.get(0).getCode();
				List<AppLeaveRequest> requests = this.service.getLeaveRequests(request, demo.getEmpNbr(), freq);
				List<LeaveRequestModel> requestModels = new ArrayList<LeaveRequestModel>();
				LeaveRequestModel model;
				AppLeaveRequest temp;
				for (int i = 0; i < requests.size(); i++) {
					temp = requests.get(i);
					temp.setFirstName(demo.getNameF());
					temp.setLastName(demo.getNameL());
					model = new LeaveRequestModel(temp);
					requestModels.add(model);
				}
				Code empty = new Code();
				List<Code> absRsns =  new ArrayList<Code>();
				//Add a blank for absRsns for default shown
				empty = new Code();
				empty.setDescription(" ");
				absRsns.add(empty);
				absRsns.addAll(this.service.getAbsRsns(demo.getEmpNbr(), freq, ""));
				List<Code> leaveTypes = new ArrayList<Code>();
				List<Code> leaveTypesforSearch = new ArrayList<Code>();
				empty = new Code();
				empty.setDescription("ALL");
				leaveTypesforSearch.add(empty);
				//Add a blank for leave Types for default shown
				empty = new Code();
				empty.setDescription(" ");
				leaveTypes.add(empty);
				leaveTypes.addAll(this.service.getLeaveTypes(demo.getEmpNbr(), freq, ""));
				leaveTypesforSearch.addAll(this.service.getLeaveTypes(demo.getEmpNbr(), freq, ""));
				List<LeaveInfo> leaveInfo = this.service.getLeaveInfo(demo.getEmpNbr(), freq, true);
				JSONArray json = new JSONArray();

				for (int i = 0; i < requestModels.size(); i++) {
					json.add(requestModels.get(i).toJSON(leaveStatus, leaveTypes,null,gens));
				}
				
				List<String[]> map = this.service.mapReasonsAndLeaveTypes();
				JSONArray mapJson = new JSONArray();
				JSONObject tempMap;
				for (int i = 0; i < map.size(); i++) {
					tempMap = new JSONObject();
					tempMap.put("absRsn", map.get(i)[0]);
					for(int j=0;j<absRsns.size();j++) {
						if(absRsns.get(j).getCode().equals(map.get(i)[0])) {
							tempMap.put("absRsnDescrption", absRsns.get(j).getDescription());
						}
					}
					tempMap.put("leaveType", map.get(i)[1]);
					mapJson.add(tempMap);
				}
				mav.addObject("selectedFreq", freq);
				mav.addObject("absRsns", absRsns);
				mav.addObject("leaveTypes", leaveTypes);
				mav.addObject("leaveTypesAbsrsnsMap", mapJson);
				mav.addObject("leaveTypesforSearch", leaveTypesforSearch);
				mav.addObject("leaveInfo", leaveInfo);
				mav.addObject("leaves", json);
			}
		} else {
			List<AppLeaveRequest> requests = this.service.getLeaveRequests(request, demo.getEmpNbr(), freq);
			List<LeaveRequestModel> requestModels = new ArrayList<LeaveRequestModel>();
			LeaveRequestModel model;
			AppLeaveRequest temp;
			for (int i = 0; i < requests.size(); i++) {
				temp = requests.get(i);
				temp.setFirstName(demo.getNameF());
				temp.setLastName(demo.getNameL());
				model = new LeaveRequestModel(temp);
				requestModels.add(model);
			}
			Code empty = new Code();
			List<Code> absRsns =  new ArrayList<Code>();
			//Add a blank for absRsns for default shown
			empty = new Code();
			empty.setDescription(" ");
			absRsns.add(empty);
			absRsns.addAll(this.service.getAbsRsns(demo.getEmpNbr(), freq, ""));
			List<Code> leaveTypes = new ArrayList<Code>();
			List<Code> leaveTypesforSearch = new ArrayList<Code>();
			empty = new Code();
			empty.setDescription("ALL");
			leaveTypesforSearch.add(empty);
			//Add a blank for leave Types for default shown
			empty = new Code();
			empty.setDescription(" ");
			leaveTypes.add(empty);
			leaveTypes.addAll(this.service.getLeaveTypes(demo.getEmpNbr(), freq, ""));
			leaveTypesforSearch.addAll(this.service.getLeaveTypes(demo.getEmpNbr(), freq, ""));
			List<LeaveInfo> leaveInfo = this.service.getLeaveInfo(demo.getEmpNbr(), freq, true);
			JSONArray json = new JSONArray();
			for (int i = 0; i < requestModels.size(); i++) {
				json.add(requestModels.get(i).toJSON(leaveStatus, leaveTypes,null,gens));
			}
			List<String[]> map = this.service.mapReasonsAndLeaveTypes();
			JSONArray mapJson = new JSONArray();
			JSONObject tempMap;
			for (int i = 0; i < map.size(); i++) {
				tempMap = new JSONObject();
				tempMap.put("absRsn", map.get(i)[0]);
				for(int j=0;j<absRsns.size();j++) {
					if(absRsns.get(j).getCode().equals(map.get(i)[0])) {
						tempMap.put("absRsnDescrption", absRsns.get(j).getDescription());
					}
				}
				tempMap.put("leaveType", map.get(i)[1]);
				mapJson.add(tempMap);
			}
			mav.addObject("selectedFreq", freq);
			mav.addObject("leaves", json);
			mav.addObject("absRsns", absRsns);
			mav.addObject("leaveTypes", leaveTypes);
			mav.addObject("leaveTypesAbsrsnsMap", mapJson);
			mav.addObject("leaveTypesforSearch", leaveTypesforSearch);
			mav.addObject("leaveInfo", leaveInfo);

		}
		mav.addObject("SearchType", SearchType);
		mav.addObject("SearchStart", SearchStart);
		mav.addObject("SearchEnd", SearchEnd);
		mav.addObject("params", params);
		mav.addObject("availableFreqs", availableFreqs);
		mav.addObject("supervisorEmpNbr", supervisorEmpNbr);
		return mav;
	}
	
	@RequestMapping("leaveRequestByFreqency")
	public ModelAndView leaveRequestByFrequency(HttpServletRequest req, String freq) throws ParseException {
		return this.leaveRequest(req, null, null, null, freq,false);
	}
	
	@RequestMapping("submitLeaveRequest")
	public ModelAndView submitLeaveRequest(HttpServletRequest req, String leaveId, String leaveType,
			String absenseReason, String LeaveStartDate, String startTimeValue, String LeaveEndDate,
			String endTimeValue, String lvUnitsDaily, String lvUnitsUsed, String Remarks, String freq,Boolean isAdd)
			throws ParseException, MessagingException {
		HttpSession session = req.getSession();
		ModelAndView mav = new ModelAndView();
		if(leaveType==null||absenseReason==null||LeaveStartDate==null||startTimeValue==null||
				LeaveEndDate==null||endTimeValue==null||lvUnitsDaily==null||lvUnitsUsed==null||freq==null) {
			mav.setViewName("visitFailed");
			mav.addObject("module", module);
			mav.addObject("action", "Create or update leave information from leave request list view");
			mav.addObject("errorMsg", "Not all mandotary fields provided.");
			return mav;
		}
		
		
		BhrEmpDemo demo = ((BhrEmpDemo) session.getAttribute("userDetail"));
		this.saveLeaveRequest(leaveId, leaveType, absenseReason, LeaveStartDate, startTimeValue, LeaveEndDate,
				endTimeValue, lvUnitsDaily, lvUnitsUsed, Remarks, freq, demo);
		
		
		return this.leaveRequest(req, null, null, null, null,isAdd);
	}
	
	@RequestMapping("deleteLeaveRequest")
	public ModelAndView deleteLeaveRequest(HttpServletRequest req, String id) throws ParseException {
		ModelAndView mav = new ModelAndView();
		if(id==null) {
			mav.setViewName("visitFailed");
			mav.addObject("module", module);
			mav.addObject("action", "Delete leave information from leave request list view");
			mav.addObject("errorMsg", "Not all mandotary fields provided.");
			return mav;
		}
		deleteLeaveRequest(id);
		return this.leaveRequest(req, null, null, null, null,false);
	}
	
	
	@RequestMapping(value = "getMinutesToHoursConversionRecs", method = RequestMethod.POST)
	@ResponseBody
	public List<LeaveUnitsConversion> getMinutesToHoursConversionRecs(HttpServletRequest req,String payFrequency, String leaveType) throws Exception{  
	    	List<LeaveUnitsConversion> minutesToHours = this.service.getMinutesToHoursConversionRecs(payFrequency, leaveType);
	        return minutesToHours;
	    }
	
	
	@RequestMapping(value = "getHoursToDaysConversionRecs", method = RequestMethod.POST)
	@ResponseBody
	public List<LeaveUnitsConversion> getHoursToDaysConversionRecs(HttpServletRequest req,String payFrequency, String leaveType) throws Exception{  
	    	List<LeaveUnitsConversion> minutesToHours = this.service.getHoursToDaysConversionRecs(payFrequency, leaveType);
	        return minutesToHours;
	    }
}
