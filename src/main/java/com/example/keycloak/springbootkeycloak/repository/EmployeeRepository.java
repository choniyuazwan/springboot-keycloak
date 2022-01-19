package com.example.keycloak.springbootkeycloak.repository;

import com.example.keycloak.springbootkeycloak.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
