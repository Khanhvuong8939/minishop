package com.venky.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.MatrixVariable;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.venky.entity.Employee;

@Controller
@RequestMapping("/chitiet")
public class Chitiet {
	
	@GetMapping
	public String chitiet() {
		
		return "chitiet";
	}
	
	@GetMapping("/{username}")
	public String getHienthi(@PathVariable String username, @MatrixVariable String hihi, ModelMap modelMap) {
		modelMap.addAttribute("hihi", hihi);
		modelMap.addAttribute("username", username);
		
		return "chitiet";
		
	}
	
	@PostMapping
	public String hienthi(@ModelAttribute Employee employee, ModelMap modelMap) {
		modelMap.addAttribute("employee", employee);
		return "chitiet";
	}

}
