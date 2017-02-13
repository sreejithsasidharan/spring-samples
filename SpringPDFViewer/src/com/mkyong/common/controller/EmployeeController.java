package com.mkyong.common.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mkyong.common.bean.Employee;
 
 
@Controller
public class EmployeeController {
 
    Employee employee = new Employee();
 
    @RequestMapping(value = "/employee/{name}", method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody Employee getEmployeeInJSON(@PathVariable String name) {
    	System.out.println();
    	System.out.println("111111111111111111111111111111111111111111");
   	 employee.setName(name);
   	 employee.setEmail("employee1@genuitec.com");
 
   	 return employee;
 
    }
 
    @RequestMapping(value = "/employees/{name}", method = RequestMethod.GET)
    public Employee getEmployeeInXML(@PathVariable String name) {
    	
    	System.out.println();
    	System.out.println("2222222222222222222222");
    	
   	 employee.setName(name);
   	 employee.setEmail("employee1@genuitec.com");
 
   	 return employee;
 
    }
 
}