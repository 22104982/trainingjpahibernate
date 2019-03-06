package com.training.hibernatejpaTraining.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.training.hibernatejpaTraining.model.*;

import com.training.hibernatejpaTraining.service.IEmployeeService;

@RestController
@RequestMapping("company")
public class EmployeeController {
	
	@Autowired
	private IEmployeeService empService;
	
	@GetMapping("employee/all")
	private List<Employees> findAllEmployee(){
		return empService.findAllEmployee();
	}
	
	@PostMapping("employee/add")
	private List<Employees> addManyEmployee(@RequestBody List<Employees> employee){
			return empService.addManyEmployee(employee);
	}
	
	@GetMapping("employee/name/{employeeName}")
	private List<Employees> findByEmployeeName(@PathVariable("employeeName") String employeeName){
		return empService.findByEmployeeName(employeeName);
	}
	
}
