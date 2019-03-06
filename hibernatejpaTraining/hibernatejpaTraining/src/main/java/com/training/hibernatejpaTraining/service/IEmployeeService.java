package com.training.hibernatejpaTraining.service;

import java.util.List;

import com.training.hibernatejpaTraining.model.*;

public interface IEmployeeService {

	List<Employees> findAllEmployee();
	List<Employees> addManyEmployee(List<Employees> employees);
	List<Employees> findByEmployeeName(String name);
	
}
