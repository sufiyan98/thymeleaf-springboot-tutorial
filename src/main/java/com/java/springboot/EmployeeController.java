package com.java.springboot;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeeController {
	
	@GetMapping("/iteration")
	public String bootstrap(Model model) {
		List<Employee> employees=new ArrayList<>();
		employees.add(new Employee("Mohammed","Sufiyan","sufi1@gmail.com"));
		employees.add(new Employee("Mohammed","Sufiyan","sufi2@gmail.com"));
		employees.add(new Employee("Mohammed","Sufiyan","sufi3@gmail.com"));
		employees.add(new Employee("Mohammed","Sufiyan","sufi4@gmail.com"));
		employees.add(new Employee("Mohammed","Sufiyan","sufi5@gmail.com"));
		model.addAttribute("employees",employees);
		return "iteration";
	}
	
}
