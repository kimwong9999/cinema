package com.qa.cinema.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/cinema")
public class WebController 
{
	@GetMapping("")
	public String homePage()
	{
		return "cinema.html";
	}
}
