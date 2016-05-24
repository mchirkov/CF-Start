package com.cognizant.hr.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.cognizant.hr.domain.Department;

public interface DepartmentRepository extends PagingAndSortingRepository<Department, Integer> {

}
