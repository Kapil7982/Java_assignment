package com.Usecase;

import com.EmpDao.EmployeeDao;
import com.EmpDao.EmployeeImpl;
import com.Exception.EmployeeException;

public class DeleteEmployee {

	public static void main(String[] args) {
		
		 EmployeeDao  empd = new EmployeeImpl();
		 
		 try {
			 
			System.out.println(empd.deleteEmployeeById(3));
			
		} catch (EmployeeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		
	}
	
	 
}
