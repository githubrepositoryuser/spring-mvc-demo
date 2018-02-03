package com.demo.emp123;

import org.springframework.stereotype.Component;
import org.apache.camel.Header;
import org.apache.camel.Exchange;
@Component
public class Emp123ItemsValidator {

	public void ValidateEmployee(@Header(value = "type") String type, Exchange exchange) {
		
		/**
		 * Basic Validation
		 */
		
		System.out.println("Inside --> Emp123ItemsValidator-->ValidateEmployee()");
		
	}
}
