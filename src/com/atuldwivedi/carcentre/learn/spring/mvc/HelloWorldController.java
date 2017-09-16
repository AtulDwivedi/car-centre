package com.atuldwivedi.carcentre.learn.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {

	@RequestMapping("/")
	public String showHelloWorldPage() {
		return "hello-world";
	}
	
	@RequestMapping("/showHelloWorldForm")
	public String showHelloWorldForm() {
		return "hello-world-form";
	}
	
	@RequestMapping("/processHelloWorldForm")
	public String processHelloWorldForm(){
		return "process-hello-world-form";
	}
}
