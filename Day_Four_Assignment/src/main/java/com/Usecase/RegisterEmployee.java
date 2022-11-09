package com.Usecase;

import com.EmpDao.EmployeeDao;
import com.EmpDao.EmployeeImpl;
import com.Entity.Employee;
import com.Exception.EmployeeException;

public class RegisterEmployee {

	public static void main(String[] args) {
		
		EmployeeDao empd = new EmployeeImpl();
		
		Employee emp = new Employee();
		
		emp.setName("Roshan");
		emp.setAddress("Pune");
		emp.setSalary(45000);
		
		try {
			
			System.out.println(empd.registerEmployee(emp));
			
		} catch (EmployeeException e) {
			// TODO Auto-generated catch block
			e.getMessage();
		}
		
	}
}
