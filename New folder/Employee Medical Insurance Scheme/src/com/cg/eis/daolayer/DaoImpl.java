package com.cg.eis.daolayer;

import java.util.HashMap;
import java.util.Map;

import com.cg.eis.bean.Employee;

public class DaoImpl implements DaoInterface {
	
	Map<String, Employee> userlist=new HashMap<String, Employee>();
	@Override
	public String generateEmployeeId(String EmployeeId, Employee employee){
		try{
			System.out.println("generagted eid "+ EmployeeId);
			userlist.put(EmployeeId, employee);
		}
		catch(Exception e)
		{
			throw e;
		}	
		return EmployeeId;
	}
	@Override
	public void assignScheme(String EmployeeId, Employee employe, int EmployeeSalary){
		try{
			if(EmployeeSalary>5000 && EmployeeSalary<20000)
			{
				employe.setDesignation("SystemAccociate");
				employe.setInsuranceScheme("Scheme C");
			}
			else if(EmployeeSalary>=20000 && EmployeeSalary<40000)
			{
				employe.setDesignation("Programmer");
				employe.setInsuranceScheme("scheme B");
			}
			else if(EmployeeSalary>=40000)
			{
				employe.setDesignation("Manager");
				employe.setInsuranceScheme("scheme A");
			}
			else if(EmployeeSalary<5000)
			{
				employe.setDesignation("clerk");
				employe.setInsuranceScheme("no scheme");
			}			
		}
		catch (Exception e)
		{
			throw e;
		}
	}
	@Override
	public Employee displayDetails(String EmployeeId ) {
		try{
		Employee employee=new Employee();
		employee=userlist.get(EmployeeId);
		return employee;
	}
		catch(Exception e)
		{
			throw e;
		}
	}
	@Override
	public HashMap<String, Employee> displayAll(){
		try{
			return(HashMap<String, Employee>) userlist;	
		}
		catch(Exception e)
		{
			throw e;
			}
		
		
	}
	@Override
	public void assignScheme(String EmployeeId) {
		// TODO Auto-generated method stub
		
	}
	

}
