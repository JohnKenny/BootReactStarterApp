package com.example.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.*;

@RestController
public class DemoRestController {

	@RequestMapping("/greeting")
	public Message greeting(@RequestParam(value="name", defaultValue="World") String name) {
		return new Message(name);
	}
	
}
