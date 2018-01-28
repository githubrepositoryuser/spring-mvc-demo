package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

	
	@ResponseBody
	@RequestMapping(value="/home")
	public String message() {
		System.out.println("Inside  HelloController->message");
		return "HelloController";
	}
	
	@RequestMapping(value="/")
	public String home() {
		System.out.println("Inside  HelloController->home");
		return "HelloController";
	}
}
