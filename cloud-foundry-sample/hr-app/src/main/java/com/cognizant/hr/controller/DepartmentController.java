package com.cognizant.hr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.hr.domain.Department;
import com.cognizant.hr.repositories.DepartmentRepository;

@RestController
public class DepartmentController {
	@Autowired
	DepartmentRepository departmentRepository;

	@RequestMapping(value = "/departments", method = RequestMethod.GET)
	public Iterable<Department> listAll() {
		return departmentRepository.findAll();
	}

	@RequestMapping(value = "/departments", method = RequestMethod.POST)
	public ResponseEntity<Department> updateDepartment(@RequestBody Department department) {
		departmentRepository.save(department);
		return new ResponseEntity<Department>(department, HttpStatus.CREATED);
	}
}
