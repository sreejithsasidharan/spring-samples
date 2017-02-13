package com;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.springframework.web.WebApplicationInitializer;

public class AppInitializer implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext arg0) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println(" ");
		System.out.println(" AppInitializer - onStartup");
		System.out.println(" ");
	}
	
}
