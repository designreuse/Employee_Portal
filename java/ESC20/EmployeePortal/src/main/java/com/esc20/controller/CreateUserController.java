package com.esc20.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.esc20.model.BeaEmail;
import com.esc20.model.BeaUsers;
import com.esc20.model.BhrEmpDemo;
import com.esc20.nonDBModels.SearchUser;
import com.esc20.security.CustomSHA256Encoder;
import com.esc20.service.IndexService;

@Controller
@RequestMapping("/createUser")
public class CreateUserController{
	
    @Autowired
    private IndexService indexService;

    @Autowired
    private CustomSHA256Encoder encoder;
	
    private final String module = "Create New User";
    
    @RequestMapping("searchUser")
    public ModelAndView searchUser(HttpServletRequest req){
    	ModelAndView mav = new ModelAndView();
        mav.setViewName("searchUser");
        return mav;
    }
    
    @RequestMapping("createNewUser")
    public ModelAndView createNewUser(HttpServletRequest req){
    	ModelAndView mav = new ModelAndView();
        mav.setViewName("createNewUser");
        return mav;
    }
    
    @RequestMapping("saveNewUser")
    public ModelAndView saveNewUser(HttpServletRequest req){
    	ModelAndView mav = new ModelAndView();
		if(req.getParameter("empNbr")==null||req.getParameter("username")==null||req.getParameter("hintQuestion")==null
				||req.getParameter("hintAnswer")==null||req.getParameter("password")==null) {
			mav.setViewName("visitFailedUnAuth");
			mav.addObject("module", module);
			mav.addObject("action", "Save Users");
			mav.addObject("errorMsg", "Not all mandotary fields provided.");
			return mav;
		}
    	BeaUsers newUser=new BeaUsers();
    	newUser.setEmpNbr(req.getParameter("empNbr"));
    	newUser.setUsrname(req.getParameter("username"));//username
    	newUser.setHint(req.getParameter("hintQuestion"));//hintQuestion
    	newUser.setHintAns(encoder.encode(req.getParameter("hintAnswer")));//  hintAnswer
    	//newUser.setUserEmail(req.getParameter("workEmail"));//workEmail
    	newUser.setUsrpswd(encoder.encode(req.getParameter("password")));
    	
    	newUser.setLkPswd('N');
    	newUser.setPswdCnt(0);
    	newUser.setLkFnl('N');
    	newUser.setTmpDts("");
    	newUser.setTmpCnt(0);
    	newUser.setHintCnt(0);
    	
    	BhrEmpDemo bed = this.indexService.getUserDetail(req.getParameter("empNbr"));
    	SearchUser searchUser=new SearchUser();
    	searchUser.setDateDay(bed.getDob().substring(6, 8));
    	searchUser.setDateMonth(bed.getDob().substring(4, 6));
    	searchUser.setDateYear(bed.getDob().substring(0, 4));
		searchUser.setEmpNumber(req.getParameter("empNbr"));
		searchUser.setUserEmail(bed.getEmail());
		searchUser.setNameF(bed.getNameF());
		searchUser.setNameL(bed.getNameL());
		searchUser.setHintQuestion(req.getParameter("hintQuestion"));
		searchUser.setZipCode(bed.getAddrZip());
    	BeaUsers user=indexService.getUserByUsername(req.getParameter("username"));
    	if(user!=null) {
    		mav.setViewName("createNewUser");
    	    mav.addObject("user", searchUser);
    	    mav.addObject("newUser", newUser);
    	    mav.addObject("isUserExist", "true");
    	}else {
    		this.indexService.updateEmailEmployee(newUser.getEmpNbr(),req.getParameter("workEmail"),req.getParameter("homeEmail"));
    		indexService.saveBeaUsers(newUser);
    		mav.setViewName("login");
    	    mav.addObject("user", user);
    	    mav.addObject("newUser", newUser);
    	    mav.addObject("isSuccess", "true");
    	}
    	
        return mav;
    }
	
    @RequestMapping(value="retrieveEmployee",method=RequestMethod.POST)
    public ModelAndView retrieveEmployee(HttpServletRequest req){
    	ModelAndView mav = new ModelAndView();
		if(req.getParameter("dateDay")==null||req.getParameter("dateMonth")==null||req.getParameter("dateYear")==null
				||req.getParameter("empNumber")==null||req.getParameter("zipCode")==null) {
			mav.setViewName("visitFailedUnAuth");
			mav.addObject("module", module);
			mav.addObject("action", "Retrieve employee information");
			mav.addObject("errorMsg", "Not all mandotary fields provided.");
			return mav;
		}
    	SearchUser searchUser=new SearchUser();
    	searchUser.setDateDay(req.getParameter("dateDay"));
    	searchUser.setDateMonth(req.getParameter("dateMonth"));
    	searchUser.setDateYear(req.getParameter("dateYear"));
    	searchUser.setEmpNumber(req.getParameter("empNumber"));
    	searchUser.setZipCode(req.getParameter("zipCode"));
    	
    	BeaUsers user = this.indexService.getUserByEmpNbr(searchUser.getEmpNumber());
    	
    	if(user !=null) {
    		mav.setViewName("searchUser");
        	mav.addObject("isExistUser", "true");
        	mav.addObject("newUser", searchUser);
    	}else {
    		BhrEmpDemo bed= this.indexService.retrieveEmployee(searchUser);
        	if(bed == null) {
        		mav.setViewName("searchUser");
            	mav.addObject("isSuccess", "false");
            	mav.addObject("newUser", searchUser);
        	}else {
        		BeaEmail emailRequest = this.indexService.getBeaEmail(bed);
        		searchUser.setNameF(bed.getNameF());
        		searchUser.setNameL(bed.getNameL());
        		mav.setViewName("createNewUser");
            	mav.addObject("user", searchUser);
            	mav.addObject("emailShowRequest", emailRequest);
        	}
    	}
    	
        return mav;
    }
    
}