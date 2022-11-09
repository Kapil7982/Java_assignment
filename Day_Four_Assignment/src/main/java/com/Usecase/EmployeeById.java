package com.Usecase;

import com.EmpDao.EmployeeDao;
import com.EmpDao.EmployeeImpl;
import com.Exception.EmployeeException;

public class EmployeeById {

	public static void main(String[] args) {
		
		EmployeeDao empd = new EmployeeImpl();
		
		try {
			
			System.out.println(empd.getEmployeeById(3));
			
		} catch (EmployeeException e) {
			// TODO Auto-generated catch block
			e= new EmployeeException("Wrong credential details not found!");
		}
	}
}
