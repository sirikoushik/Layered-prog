package com.cg.eis.service;

import java.util.HashMap;

import com.cg.eis.bean.Employee;

public interface ServiceInterface {

	public String generateEmployeeId(Employee employee);

	public void assignScheme(String employeeId);

	public Employee displayDetails(String employeeId);

	public HashMap<String, Employee> displayAll();

	


	

}
