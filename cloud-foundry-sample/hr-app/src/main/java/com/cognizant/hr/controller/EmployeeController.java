package com.cognizant.hr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.hr.domain.Employee;
import com.cognizant.hr.repositories.EmployeeRepository;

@RestController
public class EmployeeController {
	@Autowired
    EmployeeRepository employeeRepository;
	
	@RequestMapping(value = "/employees", method = RequestMethod.GET)
	public Iterable<Employee> listAll() {
		return employeeRepository.findAll();
	}

	@RequestMapping(value = "/employees", method = RequestMethod.POST)
	public ResponseEntity<Employee> updateDepartment(@RequestBody Employee employee) {
		employeeRepository.save(employee);
		return new ResponseEntity<Employee>(employee, HttpStatus.CREATED);
	}
}
