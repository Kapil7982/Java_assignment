package com.evaluation.question1.Service;

import java.util.List;

import com.evaluation.question1.exception.EmployeeException;
import com.evaluation.question1.model.Employee;
import com.evaluation.question1.model.EmployeeDTO;

public interface EmployeeService {

	
	public Employee registerEmployee(Employee emp)throws EmployeeException;
	
	public Employee getEmployeeById(Integer empId)throws EmployeeException;
	
	public List<Employee> getAllEmployeeDetails()throws EmployeeException;
	
	public Employee deleteEmployeeById(Integer empId)throws EmployeeException;
	 
	public Employee loginEmployee(String email, String password)throws EmployeeException;
	
	public List<Employee> getEmployeeDetailsByAddress(String address)throws EmployeeException;
	
	public Employee updateEmployee(Employee emp)throws EmployeeException;
	
	public String[] getNameAndAddressOfEmplyeeById(Integer empId)throws EmployeeException;
	
	public List<EmployeeDTO> getNameAddressSalaryOfAllEmployee()throws EmployeeException;
}
