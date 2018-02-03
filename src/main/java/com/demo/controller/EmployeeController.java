package com.demo.controller;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.framework.EmployeeMediator;
import com.demo.framework.MediatorBean;
import com.demo.model.Employee;
import com.demo.service.EmployeeService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiParam;

@RestController
@RequestMapping("v1")
@Api(value = "EmployeeController")
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	@Autowired
	private MediatorBean mediatorBean;
	@RequestMapping(value = "/employees")
	public  List<Employee> employees() {
		System.out.println("Inside  EmployeeController->employees");
		return employeeService.getAllEmployee();
	}
	
	@RequestMapping(value = "/new/types/{type}/employee", method ={RequestMethod.POST}, consumes = {"application/json", "application/xml"}
	)
	public @ResponseBody Employee createEmployee(@RequestBody Employee argEmployeeContext, @ApiParam(name = "type", value ="Employee Type", required = true)@PathVariable String type,
			@RequestHeader HttpHeaders argHeaders) {
		System.out.println("Inside  EmployeeController->employee");
		//Assemble all incoming headers
		Map<String, String> headersToSend = new HashMap<>();
		
		for(String headerName : argHeaders.keySet()) {
			headersToSend.put(headerName, argHeaders.getFirst(headerName));
		}
		
		// Add Type
		headersToSend.put("Type", type);
		
		System.out.println("Headers Value: "+headersToSend);
		
		System.out.println("Body Value: "+argEmployeeContext);
		
		// Get Camel proxy
		EmployeeMediator mediatorProxy = mediatorBean.getMediatorProxy();
		
		//Invoke camel mediation
		Employee response = mediatorProxy.createEmployeeDecision(argEmployeeContext, headersToSend);
		
		//Employee employee = new Employee();
		return argEmployeeContext;
	}

}
