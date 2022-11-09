package com.Usecase;

import com.EmpDao.EmployeeDao;
import com.EmpDao.EmployeeImpl;
import com.Entity.Employee;
import com.Exception.EmployeeException;

public class UpdateEmployee {

	public static void main(String[] args) {
		
		EmployeeDao empd = new EmployeeImpl();
		
		Employee  emp = new Employee(3 , "Roshan", "Thumbad", 40000);
		
		try {
			
			System.out.println(empd.updateEmployee(emp));
			
		} catch (EmployeeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
