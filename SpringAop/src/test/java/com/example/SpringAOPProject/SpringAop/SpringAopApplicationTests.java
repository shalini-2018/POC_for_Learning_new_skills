package com.example.SpringAOPProject.SpringAop;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.example.Controller.EmployeeController;
import com.example.SpringAOPProject.Service.EmployeeService;
import com.example.springAOP.Model.Employee;
//Test cases of employee controllers

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class SpringAopApplicationTests {

	@Mock
	EmployeeService employeeServiceMock;
	
	@InjectMocks
	EmployeeController controller;
	
	@Test
	public void test_addEmployees() throws Exception {

		Employee emp = new Employee();
		

		Mockito.when(employeeServiceMock.createEmployee(Mockito.anyString(), Mockito.anyString())).thenReturn(emp);
	
		assertEquals(emp, employeeServiceMock.createEmployee("shalini", "1"));

	}

}
