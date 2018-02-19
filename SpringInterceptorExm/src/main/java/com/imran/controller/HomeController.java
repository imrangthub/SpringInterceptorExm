package com.imran.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/")
	public String test() {
		System.out.println("From Home controller");
		return "index";
	}
	

}
