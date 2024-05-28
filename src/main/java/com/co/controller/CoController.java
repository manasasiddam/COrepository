package com.co.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.co.binding.CoResponse;
import com.co.service.CoService;

@RestController
public class CoController {

	@Autowired
	private CoService coService;
	
	@GetMapping("/process")
	public CoResponse processTriggers() {
		 return coService.processPendingTriggers();
	}
}