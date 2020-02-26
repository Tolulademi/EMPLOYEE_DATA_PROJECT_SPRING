package com.employee.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class EmployeeController {
	
	//@RequestMapping(value="/add", method = Reuest.GET)
	
	
	//So how do we get request?
	
	// this means for any get request come to this function
	@GetMapping("/")
	@ResponseBody
	public String addEmployee() {
		
		return "Request Successful";
		
	}
	
	
}
