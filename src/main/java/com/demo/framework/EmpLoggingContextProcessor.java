package com.demo.framework;

import org.apache.camel.Exchange;

import com.demo.model.Employee;

public class EmpLoggingContextProcessor {

	
	public void setupLoggingContext(Exchange exchange, Employee employee) {
		
		System.out.println("Inside --> EmpLoggingContextProcessor-->setupLoggingContext()");
	}
}
