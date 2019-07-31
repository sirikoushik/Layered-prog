package com.cg.eis.pl;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.cg.eis.bean.Employee;
import com.cg.eis.service.ServiceImpl;
import com.cg.eis.service.ServiceInterface;

public class Start {
	
	 private static final int HashMap  = 0;
	static int choice;
	 
	 
	 public static void displayUnit() {
		 System.out.println("enter your choice");
		 System.out.println("1. create employee id to the employee");
		 System.out.println("2. view the assigned scheme for the employee");
		 System.out.println("3. Display details of the employee");
		 System.out.println("4. display all the employees in the office");
		 
	 }

public static void main(String[] args) {
	ServiceInterface service=new ServiceImpl();
	Scanner sc = new Scanner(System.in);
while(true) 
{
	displayUnit(); 
	System.out.println("enter your choice");
	 choice=sc.nextInt();
	 
	 switch(choice)
	 {	 
	 case 1:
	 try{
		 System.out.println("*****WELCOME*****");
		 Employee employee = new Employee();
		 System.out.println(" enter your employee name");		
		 employee.setEmployeeName(sc.next());
		 System.out.println("enter your salary");
		 employee.setEmployeeSalary(sc.nextInt());
		 String EmployeeId = service.generateEmployeeId(employee);
		 System.out.println("your generated employeeId is :" +EmployeeId);
		  }
	 catch(Exception e)
	 {
		 System.out.println(e);
	 }	
	 System.out.println("----------****************----------");
	 break;
	 
	 case 2: 
		 try{
			 System.out.println("to view the employee schemes for the employee proceed");
			 System.out.println("enter the Employee Id");
			 String EmployeeId=sc.next();
			 service.assignScheme(EmployeeId);			 			 
		     }
		 catch(Exception e)
		 {
			 System.out.println(e);
		 }
	 System.out.println("----------****************----------");	 
	 break;
	 
	 case 3:
		 try{
			 System.out.println("displaying all the details of the employee");
			 System.out.println("enter the Employee Id");
			 String EmployeeId=sc.next();
		  Employee employee=service.displayDetails(EmployeeId);
			 System.out.println(" name is "+employee.getEmployeeName() + ("Employee id is")+employee.getEmployeeId()+ ("employee designation is")+employee.getDesignation()+ ("employee Scheme is"+employee.getInsuranceScheme()));
		 }
		 catch(Exception e)
		 {
			 System.out.println(e);
		 }
		 System.out.println("----------****************----------");
		 break;
		 
	 case 4:
		 try{
			 System.out.println("display all the employees int the office");
			 Map <String,Employee> userlist = new HashMap<String,Employee>();
			
			 if(!userlist.isEmpty())
			 {
				 for(Map.Entry<String , Employee> entry : userlist.entrySet())
				 {
					 System.out.println(entry.getKey()+ "=" +entry.getValue());
					 
				 }
			 }
		 	}
		 catch(Exception e)
		 {
			 System.out.println(e);
		 }
		 break;
		 
	 case 5:
		 System.exit(0);
		 break;
		 
		 default:
			 System.out.println("choose only in between 1-5");			 
		}	 
	 	}	 		
     	}
		}
