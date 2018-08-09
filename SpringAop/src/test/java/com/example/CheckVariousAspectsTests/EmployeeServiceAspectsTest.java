package com.example.CheckVariousAspectsTests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import org.springframework.test.context.junit4.SpringRunner;
@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration("/applicationContext_annotation_based_aop.xml") 

public class EmployeeServiceAspectsTest {
	@Test
	public void testLogName() {
	 
	}

}
