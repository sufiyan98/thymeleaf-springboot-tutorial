package com.java.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWorldController {

	
	@GetMapping("/hello")
	public String helllo(Model model) {
		model.addAttribute("message", "Hello World");
		return "helloworld";
	}
	
	@GetMapping("/style")
	public String style() {
		return "add-css-and-js-demo";
	}
	
	@GetMapping("/bootstrap")
	public String bootstrap() {
		return "add-bootstrap";
	}
}
