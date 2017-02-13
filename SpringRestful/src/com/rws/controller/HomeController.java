package com.rws.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
public class HomeController {
	
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String getHome(ModelMap model, HttpServletRequest request, HttpServletResponse response, HttpSession session)
			throws Exception
	{
		System.out.println("========= home.html =========================");

		
		return "home";
		
	}

}
