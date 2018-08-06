package com.example.EmployeeServiceImpl;

import org.springframework.stereotype.Service;

import com.example.EmployeeService.EmployeeService;

@Service
public class ValidateEmployeeImple implements EmployeeService  {

	@Override
	public String validateEmployee(String username, String password) {
		
		if(username.equalsIgnoreCase("Shalini")&& password.equalsIgnoreCase("abc123"))
			return "Existing Employee";
			else
			return "Invalid Employee";
	} 

}
