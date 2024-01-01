package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeReposetory extends JpaRepository<Employee, Integer> {

}
