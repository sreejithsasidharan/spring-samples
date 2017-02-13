package com.sample.maven.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sample.maven.dao.CommonDAO;

@Controller
public class HomeController {

//	@Autowired
//	CommonDAO commonDAO = null;

	@Autowired
	CustomerService customerService = null;
//	@Autowired
//	AOPCommonUtil AOPCommonUtil = null;
	
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String home(ModelMap model, HttpServletRequest request ) {
		model.addAttribute("message", "Hello Spring 4 MVC Framework!");	
		System.out.println(" AOP action in Home - 2222");
		
		getClientIpAddr(request);		
		
		customerService.checkAuth();
		
		return "home";
	}

	 @RequestMapping(value = "/welcome", method = RequestMethod.GET)
	    public String contact(Model model) {
	        model.addAttribute("message", "This is the contact page");
	        return "welcome";
	    }


public static String getClientIpAddr(HttpServletRequest request) {
	
	String ip = request.getHeader("X-Forwarded-For");
	
	System.out.println( " X-Forwarded-For " +request.getHeader("X-Forwarded-For"));	
	System.out.println( " Proxy-Client-IP " +request.getHeader("Proxy-Client-IP"));
	System.out.println( " WL-Proxy-Client-IP " +request.getHeader("WL-Proxy-Client-IP"));
	System.out.println( " HTTP_CLIENT_IP " +request.getHeader("HTTP_CLIENT_IP"));
	System.out.println( " HTTP_X_FORWARDED_FOR " +request.getHeader("HTTP_X_FORWARDED_FOR"));
	System.out.println( " getRemoteAddr " +request.getRemoteAddr());
	
	
    if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
        ip = request.getHeader("Proxy-Client-IP");
    }
    if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
        ip = request.getHeader("WL-Proxy-Client-IP");
    }
    if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
        ip = request.getHeader("HTTP_CLIENT_IP");
    }
    if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
        ip = request.getHeader("HTTP_X_FORWARDED_FOR");
    }
    if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
        ip = request.getRemoteAddr();
    }
    return ip;
}

}