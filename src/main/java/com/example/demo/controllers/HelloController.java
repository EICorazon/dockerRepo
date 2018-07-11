package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class HelloController {

	
	@GetMapping("/hello")
	public String sendToHellohtmlPage() {
		return "Hello";
	}
	
	@GetMapping("/returnName")
	public String displayName(Model model,@RequestParam("name") String name) {
		model.addAttribute("message","Hello "+name);
		return "Hello";
	}
}
