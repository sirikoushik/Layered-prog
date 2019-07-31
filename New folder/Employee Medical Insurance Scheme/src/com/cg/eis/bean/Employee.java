package com.cg.eis.bean;

public class Employee {
	//id, name, salary, designation, insuranceScheme.
	private String EmployeeId;
	private String EmployeeName;
	private int EmployeeSalary;
	private String Designation;
	private String InsuranceScheme;
	public String getInsuranceScheme() {
		return InsuranceScheme;
	}
	public void setInsuranceScheme(String insuranceScheme) {
		InsuranceScheme = insuranceScheme;
	}
	public String getEmployeeId() {
		return EmployeeId;
	}
	public void setEmployeeId(String employeeId) {
		EmployeeId = employeeId;
	}
	public String getEmployeeName() {
		return EmployeeName;
	}
	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}
	public int getEmployeeSalary() {
		return EmployeeSalary;
	}
	public void setEmployeeSalary(int employeeSalary) {
		EmployeeSalary = employeeSalary;
	}
	public String getDesignation() {
		return Designation;
	}
	public void setDesignation(String designation) {
		Designation = designation;
	}
	
	

}
