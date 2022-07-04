package com.example.demo.rest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RestControllerExample {


	String s="Hi laxmikanta you are lifesever";

	String ss="Hi laxmikanta";

	int a=100;
	int b=200;

	String laxmi="laxmikanta";
	double d=100000.99;

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
