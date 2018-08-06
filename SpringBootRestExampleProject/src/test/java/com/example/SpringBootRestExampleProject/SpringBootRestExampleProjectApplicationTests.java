package com.example.SpringBootRestExampleProject;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.example.EmployeeServiceImpl.ValidateEmployeeImple;
@RunWith(MockitoJUnitRunner.class)

@SpringBootTest(webEnvironment= SpringBootTest.WebEnvironment.RANDOM_PORT)

public class SpringBootRestExampleProjectApplicationTests {

	@Autowired
	private MockMvc mvc;

	@Mock

	ValidateEmployeeImple valEmp;

	
	@Test
	public void checkEmployeeExistsTest() throws Exception {

	String message  = "valid Employee";
	
	Mockito.when(valEmp.validateEmployee(Mockito.anyString(), Mockito.anyString())).thenReturn(message);
	RequestBuilder requestBuilder = MockMvcRequestBuilders.get("/username/password");
	     assertEquals(message, valEmp.validateEmployee("sddh", "sjsdhsjd"));

	}

}
