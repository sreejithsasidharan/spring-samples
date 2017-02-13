package com.rws.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;

@RestController
public class HelloRestController {

	private final Logger logger = LoggerFactory
			.getLogger(HelloRestController.class);

	@RequestMapping(value = "/rw", method = RequestMethod.GET)
	public @ResponseBody String displayTemplateJSON() throws Exception {
		System.out.println("==================================");
		logger.info("displayTemplateJSON() method invoked.");

		//Map<String, Object> dataStructure = new HashMap<>();
		Map<String, Object> data = new HashMap<>();
		Gson gson = new Gson();

		// build a simple data structure
		//dataStructure.put("dataStructure", getStructure());
		logger.info("displayTemplateJSON(), building data structure.");

		// convert Map to JSON
		String json = gson.toJson(getStructure(), Map.class);
		logger.info("displayTemplateJSON(), converting data structure to JSON.");

		if (json != null) {
			logger.info("displayTemplateJSON(), returning data structure as JSON.");
			return json;
		}

		return "\"{ \"No data foundl.\"}\"";
	}

	private Map<String, Object> getStructure() {
		Map<String, Object> data = new HashMap<>();
		data.put("TestID", "100");
		data.put("TestType", "<h2>Listening</h2>");
		data.put("UserID", "1234");
		data.put("AffiliateID", "9999");
		
		List<String> requestTypes = new ArrayList<>();		
		
		requestTypes.add("RequestTypeOne");
		
		requestTypes.add("RequestTypeTwo");
		
		requestTypes.add("RequestTypeThree");
		
		
		data.put("RequestTypes", requestTypes);

		logger.info("displayTemplateJSON(), data structure is: {}", data);
		return data;
	}

	
	@RequestMapping(value = "/rwjson", method = RequestMethod.GET)
	public @ResponseBody String getTemplateJSON() throws Exception {
		System.out.println("=============rwjson=====================");
		logger.info("displayTemplateJSON() method invoked.");
		Gson gson = new Gson();
		
		Map<String, Object> data = new HashMap<>();
		data.put("Task", "Learn Spring Rest Web Services.");
		data.put("Company", "Example Inc.");
		List<String> requestTypes = new ArrayList<>();
		requestTypes.add("RequestTypeOne");
		requestTypes.add("RequestTypeTwo");
		requestTypes.add("RequestTypeThree");
		data.put("RequestTypes", requestTypes);
		
		String json= gson.toJson(data, Map.class);
		
		return json;
		
	}
}
