package com.rws.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.rws.bean.Country;

@RestController
public class CountryController {

	private final Logger logger = LoggerFactory
			.getLogger(CountryController.class);

	@RequestMapping(value = "/countries", method = RequestMethod.GET)
	public @ResponseBody String getCountries() throws Exception {
		System.out.println("==================================");
		logger.info("getCountries() method invoked.");

		Map countriesMap = new HashMap ();
		
		Gson gson = new Gson();

		List<Country> listOfCountries = createCountryList();
		
		countriesMap.put("Country", listOfCountries);

		listOfCountries.forEach(Country -> System.out.println(Country
				.getCountryName()));

		String json = gson.toJson(countriesMap, Map.class);

		return json;
	}

	@RequestMapping(value = "/country/{id}", method = RequestMethod.GET)
	public @ResponseBody String getCountryById(@PathVariable int id) {
		
		System.out.println("==================================");
		logger.info("getCountryById() method invoked.");
		
		List<Country> listOfCountries = new ArrayList<Country>();
		listOfCountries = createCountryList();

		Gson gson = new Gson();
		String json = null;
		Map countryMap = new HashMap (1);
		for (Country country : listOfCountries) {
			if (country.getId() == id)
				
				countryMap.put("Country", country);
			
				 json = gson.toJson(countryMap, HashMap.class);

				return json;
		}

		return json;
	}

	// Utiliy method to create country list.
	public List<Country> createCountryList() {
		Country indiaCountry = new Country(1, "India");
		Country chinaCountry = new Country(4, "China");
		Country nepalCountry = new Country(3, "Nepal");
		Country bhutanCountry = new Country(2, "Bhutan");

		List<Country> listOfCountries = new ArrayList<Country>();
		listOfCountries.add(indiaCountry);
		listOfCountries.add(chinaCountry);
		listOfCountries.add(nepalCountry);
		listOfCountries.add(bhutanCountry);
		return listOfCountries;
	}
}
