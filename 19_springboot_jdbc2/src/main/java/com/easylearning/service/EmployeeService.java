package com.easylearning.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

import com.easylearning.entity.Employee;

public interface EmployeeService {

	public List<Employee> getAllEmployees();

	public Employee getEmployee(int id);

	public Employee addEmployee(Employee emp);

	public Employee updateEmployee(Employee emp);

	public Employee deleteEmployee(int id);

}