package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeReposetory resp;

	@RequestMapping("showEmp")
	public ModelAndView displayEmpForm() {

		return new ModelAndView("AddEmployee", "command", new Employee());

	}

	@RequestMapping("emp")
	public String saveEmp(@ModelAttribute("emp") Employee emp) {
		resp.save(emp);
		return "Sucess";
	}

	@RequestMapping("showallemp")
	public ModelAndView saveEmp() {
		List<Employee> empList = resp.findAll();
		return new ModelAndView("EmployeeList", "list", empList);
	}

	@RequestMapping("edit")
	public ModelAndView editemp(int empId) {
		Employee emp = resp.findById(empId).get();
		return new ModelAndView("UpdateEmployee","emp", emp);
	}

	@RequestMapping("updateemp")
	public String updateemp(@ModelAttribute("emp") Employee emp) {
		resp.save(emp);
		return "Sucess";
	}
	
	@RequestMapping("delete")
	public String updateEmp(int empId) {
		return "Sucess";
	}
	

	}


