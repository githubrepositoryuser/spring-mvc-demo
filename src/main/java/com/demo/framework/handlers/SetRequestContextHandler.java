package com.demo.framework.handlers;

import java.util.Map;

import org.apache.camel.Properties;
import org.springframework.stereotype.Component;

import com.demo.model.Employee;

@Component("SetRequestContextHandler")
public class SetRequestContextHandler {

	
	public void setReqContextInExchange(Employee argRequestContext, @Properties Map<String, Object> argExchangeProps) {
		
		System.out.println("Inside --> SetRequestContextHandler-->setReqContextInExchange()");
		
	}
}
