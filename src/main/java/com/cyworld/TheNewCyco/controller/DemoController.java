package com.cyworld.TheNewCyco.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DemoController {

	@RequestMapping("/hello")
	public String helloworld() {
		return "hello";
	}
}
