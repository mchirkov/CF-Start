package com.cognizant.hr.repositories;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.cognizant.hr.domain.Department;
import com.cognizant.hr.domain.Employee;

public interface EmployeeRepository extends PagingAndSortingRepository<Employee, Integer> {
	
	List<Employee> findByDepartment(Department department);

}
