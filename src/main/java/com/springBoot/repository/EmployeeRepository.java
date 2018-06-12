package com.springBoot.repository;

import org.springframework.data.repository.CrudRepository;
import com.springBoot.entity.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeRepository extends CrudRepository<Employee, String> {
    Optional<Employee> findByEmail(String email);
    List<Employee> findByFirstNameAndLastName(String firstName, String lastName); 
}