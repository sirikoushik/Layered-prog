package com.cg.eis.service;

import java.util.HashMap;
import java.util.Random;

import com.cg.eis.bean.Employee;
import com.cg.eis.daolayer.DaoImpl;
import com.cg.eis.daolayer.DaoInterface;

public class ServiceImpl implements ServiceInterface {
	DaoInterface dao= new DaoImpl();
	
	@Override
	public String generateEmployeeId(Employee employee)	{
		String EmployeeId=null;
		try{
		Random rand=new Random();
		int num=rand.nextInt(100)+10;
		EmployeeId = String.valueOf(num);
		dao.generateEmployeeId(EmployeeId, employee);
	}
		catch(Exception e)
		{
		throw e;	
	}
		return EmployeeId;
	}
	
	@Override
	public void assignScheme(String EmployeeId) {
		try{
			dao.assignScheme(EmployeeId);
		}
		catch(Exception e)
		{
			throw e;
		}		
	}
	@Override
	public Employee displayDetails(String EmployeeId) {
		Employee result=null;
		try{
			result=dao.displayDetails(EmployeeId);
		}
		catch(Exception e)
		{
			throw e;
		}
		return result;
		
	}
	public HashMap<String, Employee> displayAll(HashMap<String, Employee> userlist){
		try{
			dao.displayAll();
		}
		catch(Exception e)
		{
			throw e;
		}
		return userlist;
	}

	@Override
	public HashMap<String, Employee> displayAll() {
		// TODO Auto-generated method stub
		return null;
	}
}
	



