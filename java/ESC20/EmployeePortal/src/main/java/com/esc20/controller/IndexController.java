package com.esc20.controller;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.esc20.model.BhrEmpDemo;
import com.esc20.nonDBModels.Options;
import com.esc20.service.IndexService;

import net.sf.json.JSONObject;

@Controller
@RequestMapping("/")
public class IndexController {
	@Autowired
	private IndexService indexService;
    
    @RequestMapping(value="login", method=RequestMethod.GET)
    public ModelAndView getIndexPage(HttpServletRequest req, String Id,HttpServletResponse response){
    	ModelAndView mav = new ModelAndView();
        mav.setViewName("login");
		Boolean isUserLoginFailure = (Boolean) req.getSession().getAttribute("isUserLoginFailure");
		if(isUserLoginFailure!=null && isUserLoginFailure) {
			req.getSession().removeAttribute("isUserLoginFailure");
			mav.addObject("isUserLoginFailure", "true");
		}
        return mav;
    }
    
    @RequestMapping("markTimeout")
    @ResponseBody
    public JSONObject markTimeout(HttpServletRequest req, String Id,HttpServletResponse response){
    	HttpSession session = req.getSession();
    	JSONObject result=new JSONObject();
        session.setAttribute("isTimeOut", true);
        result.put("isSuccess", "true");
        return result;
    }
    
    @RequestMapping("home")
    public ModelAndView getHome(HttpServletRequest req,HttpServletResponse response){
        HttpSession session = req.getSession();
        Options options = this.indexService.getOptions();
		session.setAttribute("options", options);
		
        BhrEmpDemo userDetail = (BhrEmpDemo)session.getAttribute("userDetail");
        ModelAndView mav = new ModelAndView();
        mav.setViewName("home");
        mav.addObject("userDetail", userDetail);
        return mav;
    }

    @RequestMapping(value = "changeLanguage", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Boolean> changeLanguage(HttpServletRequest req, String language) throws IOException{
    	Map<String, Boolean> res = new HashMap<>();
    	req.getSession().setAttribute("language",language);
		String path = req.getSession().getServletContext().getRealPath("/") +"/static/js/lang/text-"+language+".json";
		File file = new File(path);
		String input = FileUtils.readFileToString(file, "UTF-8");
		JSONObject jsonObject = JSONObject.fromObject(input);
		req.getSession().setAttribute("languageJSON", jsonObject);
		res.put("success", true);
	    return res;
    }
}