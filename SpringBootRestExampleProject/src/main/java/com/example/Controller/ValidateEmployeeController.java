package com.example.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.EmployeeServiceImpl.ValidateEmployeeImple;

@RestController

public class ValidateEmployeeController {

	@Autowired
	ValidateEmployeeImple valEmp;

	@GetMapping(value = "api/{username}/{password}")

	public String checkEmployeeExists(@PathVariable("username") String username,
			@PathVariable("password") String password) {

		return valEmp.validateEmployee(username, password);
	}

}
