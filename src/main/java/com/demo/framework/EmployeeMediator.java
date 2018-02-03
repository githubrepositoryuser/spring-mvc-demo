package com.demo.framework;

import com.demo.model.Employee;

import java.util.Map;

import org.apache.camel.Body;
import org.apache.camel.Headers;

/**
 * Employee mediator interface for camel based proxies
 * 
 * @author demo
 *
 */
public interface EmployeeMediator {
    /**
     * Mediator method to creare employee decisions
     * 
     * @param argEmployeeContext
     * 			EmployeeContext request body
     * @param headers
     * 			Camel headers
     * @return
     */
	public Employee createEmployeeDecision(@Body Employee argEmployeeContext, @Headers Map<String, String> headers);
}
