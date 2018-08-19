package com.venky.controller;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.MatrixVariable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.venky.entity.Employee;

@Controller
public class HomeController {

	@Autowired
	SessionFactory sessionFactory;

	@RequestMapping("/")
	@Transactional
	public String trangchu(ModelMap model) {

		Session session = sessionFactory.getCurrentSession();
		String query = "from Employee";
		List<Employee> lsEmployees = (List<Employee>) session.createQuery(query).list();

		for (Employee employee : lsEmployees) {
			System.out.println("id: " + employee.getIdEmployee() + "\t" + "name: " + employee.getName());
		}
		
		

		return "home";
	}

	@RequestMapping(path = "/description/{id}/{password}", method = RequestMethod.GET)
	public String description(@PathVariable String id, @PathVariable String password, @MatrixVariable String day,
			@MatrixVariable String night, ModelMap model) {

		model.addAttribute("id", id);
		model.addAttribute("password", password);
		model.addAttribute("day", day);
		model.addAttribute("night", night);
		return "description";
	}

	@RequestMapping(path = "/description2", method = RequestMethod.GET)
	public String descriptionWithParam(@RequestParam("id") String id, @RequestParam("password") String password,
			ModelMap model) {

		model.addAttribute("id", id);
		model.addAttribute("password", password);

		return "description";
	}
}
