package com.ey.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ey.configuration.Configuration;
import com.ey.model.LimitConfiguraion;

@RestController
public class LimitsConfigurationController {
	
	@Autowired
	Configuration configuration;
	
	@GetMapping("/limits")
	public LimitConfiguraion retriveLimitConfiguration() {
		return new LimitConfiguraion(this.configuration.getMaximum(), this.configuration.getMinimum());
		
	}

}
