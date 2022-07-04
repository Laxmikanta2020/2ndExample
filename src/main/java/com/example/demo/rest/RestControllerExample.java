package com.example.demo.rest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RestControllerExample {

	
	@GetMapping("/laxmi")
	public String Example( Model model) {
		
		String s="Hi laxmikanta you are lifesever";
		model.addAttribute("msg",s);
		return "laxmi";
	}
	@GetMapping("/laxmiKanta")
	public String ExampleModel( Model model) {
		
		String s="Hi laxmikantaWelcome to Our Company..";
		model.addAttribute("msg",s);
		return "laxmi";
	}
}
