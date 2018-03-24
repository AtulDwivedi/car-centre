package com.atuldwivedi.carcentre.controller.rest;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.atuldwivedi.carcentre.domain.Message;

@RestController
public class GreetController implements Serializable {
	
	private Map<String, Message> msgMap;
	
	@PostConstruct
	public void createData() {
		msgMap = new HashMap<String, Message>();
		msgMap.put("mor", new Message("Morning", "Good Morning!"));
		msgMap.put("noon", new Message("After Noon", "Good After Noon!"));
		msgMap.put("eve", new Message("Evening", "Good Evening!"));
	}

	@RequestMapping(value="/greet", method=RequestMethod.GET)
	public Message greetMe(/*@RequestParam("time") String theTime*/) {
		return msgMap.get("eve");
	}
}
