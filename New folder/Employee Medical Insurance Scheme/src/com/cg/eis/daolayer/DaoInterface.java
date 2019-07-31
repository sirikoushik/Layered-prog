package com.cg.eis.daolayer;

import java.util.HashMap;

import com.cg.eis.bean.Employee;


public interface DaoInterface {
	String generateEmployeeId(String EmployeeId, Employee employee);

	public void assignScheme(String EmployeeId, Employee employe, int EmployeeSalary);

	public Employee displayDetails(String EmployeeId);

	public HashMap<String, Employee> displayAll();

	public void assignScheme(String EmployeeId);


}
