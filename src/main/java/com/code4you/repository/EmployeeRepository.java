package com.code4you.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.code4you.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
