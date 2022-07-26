package com.example.demo.rest;

import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RestControllerExample {


	String l="Hi Luisa";
	int i=96;
	String l2="we are pleased to inform u that u are recently joined our company";
	String l3="Hi Akash you are also selcted for GOOGLE";
	int i2=90;
	String l4="offred salary is 15lpa";

	public static void abc() throws IOException {
		throw new IOException("sorry 4o4 error");   
		
	}
	public static void abc1() {
		throw new ArithmeticException("sorry ............. error....................");   
		
	}

}
