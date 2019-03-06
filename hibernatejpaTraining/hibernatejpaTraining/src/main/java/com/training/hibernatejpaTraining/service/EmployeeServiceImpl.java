package com.training.hibernatejpaTraining.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.hibernatejpaTraining.model.Employees;
import com.training.hibernatejpaTraining.repository.IEmployeeRepository;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

	@Autowired
	private IEmployeeRepository emp;

	@Override
	public List<Employees> findAllEmployee() {
		return emp.findAll();
	}

	@Override
	public List<Employees> addManyEmployee(List<Employees> employees) {
		return emp.save(employees);
	}

	@Override
	public List<Employees> findByEmployeeName(String name) {
		return emp.findByEmployeeName(name);
	}	
}
