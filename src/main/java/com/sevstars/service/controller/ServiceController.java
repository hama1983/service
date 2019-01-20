package com.sevstars.service.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * Hello world!
 * 
 */
@RestController
@RequestMapping("serviceController")
public class ServiceController {
	
	@RequestMapping(value="hello")
	public String hello() {
		
		return "hello world";
	}
}
