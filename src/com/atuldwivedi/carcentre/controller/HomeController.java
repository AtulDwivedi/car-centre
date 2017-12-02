package com.atuldwivedi.carcentre.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {

	@RequestMapping("/")
	public String homePage() {
		return "index";
	}
}
