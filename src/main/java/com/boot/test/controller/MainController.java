package com.boot.test.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/main")
public class MainController {
	
	@RequestMapping(value = "name", method = RequestMethod.GET)
	String getName() {
		return "Ramandeep Singh";
	}

}
