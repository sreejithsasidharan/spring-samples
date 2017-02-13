package com.sample.maven.controller;

import java.sql.Connection;
import java.sql.SQLException;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sample.maven.dao.CommonDAO;

@Controller
public class HomeController {

	@Autowired
	CommonDAO commonDAO = null;

	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String home(ModelMap model) {
		Connection connection = null;
		model.addAttribute("message", "Hello Spring 4 MVC Framework!");
		try {
			
			connection = commonDAO.getDataSource().getConnection();
			
			System.out.println("");
			System.out.println("getSchema: " + connection.getSchema());
			System.out.println("getDatabaseProductName: " +connection.getMetaData().getDatabaseProductName());
			System.out.println("getDatabaseProductVersion: " +connection.getMetaData().getDatabaseProductVersion());
			System.out.println("");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return "home";
	}

	 @RequestMapping(value = "/contact", method = RequestMethod.GET)
	    public String contact(Model model) {
	        model.addAttribute("message", "This is the contact page");
	        return "contact";
	    }
}
