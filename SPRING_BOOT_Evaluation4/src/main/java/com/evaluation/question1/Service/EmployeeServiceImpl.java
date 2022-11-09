package com.evaluation.question1.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.evaluation.question1.exception.EmployeeException;
import com.evaluation.question1.model.Employee;
import com.evaluation.question1.model.EmployeeDTO;
import com.evaluation.question1.repo.EmployeeDao;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeDao empdao;
	
	@Override
	public Employee registerEmployee(Employee emp) throws EmployeeException {
		
		 return empdao.save(emp);
	}

	@Override
	public Employee getEmployeeById(Integer empId) throws EmployeeException {
		
		if(empdao.findById(empId).get()!=null)
		    return empdao.findById(empId).get();
			else
				throw new EmployeeException("Not avaialable");
	}

	@Override
	public List<Employee> getAllEmployeeDetails() throws EmployeeException {
		
		List<Employee> li= empdao.findAll();
		if(li.size()>0)
			return li;
		else
			throw new EmployeeException("Not Found");
	}

	@Override
	public Employee deleteEmployeeById(Integer empId) throws EmployeeException {
	
		if(empdao.findById(empId).isPresent()) {
			Employee em=empdao.findById(empId).get();
			empdao.delete(em);
			
			return em;
		}
		else
			throw new EmployeeException("Not Avaialable");
	}

	@Override
	public Employee loginEmployee(String email, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> getEmployeeDetailsByAddress(String address) throws EmployeeException {

		List<Employee> li=empdao.findByAddress(address);
		if(li.size()>0)
			return li;
		else
			throw new EmployeeException("Not Found");
	}

	@Override
	public Employee updateEmployee(Employee emp) throws EmployeeException {
		
		if(empdao.findById(emp.getEmpId()).get()!=null)
			
			
		    return empdao.save(emp);
			else
				throw new EmployeeException("Not avaialable");
		
		
	}

	@Override
	public String[] getNameAndAddressOfEmplyeeById(Integer empId) throws EmployeeException {
		
		String[] sr=empdao.getNameAndAddressOfEmplyeeById(empId);
		
		
		if(sr == null) {
		throw new EmployeeException("Not found");
		}
		else
		return sr;
	}

	@Override
	public List<EmployeeDTO> getNameAddressSalaryOfAllEmployee() throws EmployeeException {


       List<EmployeeDTO> li =empdao.getNameAddressSalaryOfAllEmployee();
		
		if(li.size()>0)
			return li;
		else
			throw new EmployeeException("Not avaialable");
	}

}
