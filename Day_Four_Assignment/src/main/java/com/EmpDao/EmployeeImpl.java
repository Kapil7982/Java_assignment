package com.EmpDao;

import javax.persistence.EntityManager;

import com.Entity.Employee;
import com.Exception.EmployeeException;
import com.Utility.EmployeeUitility;

public class EmployeeImpl implements EmployeeDao{

	@Override
	public Employee registerEmployee(Employee employee) throws EmployeeException {
		// TODO Auto-generated method stub
		Employee emp = null;
		
		EntityManager em = EmployeeUitility.providEntityManager();
		
		em.getTransaction().begin();
		
		em.persist(employee);
		emp = em.find(Employee.class, employee.getEmpid());
		
		em.getTransaction().commit();
		
		
		return emp;
	}

	@Override
	public Employee getEmployeeById(int empId) throws EmployeeException {
		// TODO Auto-generated method stub
		EntityManager em = EmployeeUitility.providEntityManager();
		
		return em.find(Employee.class, empId);
	}

	@Override
	public Employee deleteEmployeeById(int empId) throws EmployeeException {
		// TODO Auto-generated method stub
		Employee emp = null;
		
		EntityManager em = EmployeeUitility.providEntityManager();
		emp = em.find(Employee.class, empId);
		
		em.getTransaction().begin();
		
		em.remove(emp);
		
		em.getTransaction().commit();
		
		return emp;
	}

	@Override
	public Employee updateEmployee(Employee employee) throws EmployeeException {
		// TODO Auto-generated method stub
		
		
		EntityManager em = EmployeeUitility.providEntityManager();
		
		Employee emp = em.find(Employee.class, employee.getEmpid());
		
		em.getTransaction().begin();
		
		em.merge(employee);
		
		em.getTransaction().commit();
		
		
		
		return emp;
	}

}
