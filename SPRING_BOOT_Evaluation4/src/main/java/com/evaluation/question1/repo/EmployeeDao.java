package com.evaluation.question1.repo;

import java.util.List;

import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.cdi.JpaRepositoryExtension;
import org.springframework.stereotype.Repository;

import com.evaluation.question1.exception.EmployeeException;
import com.evaluation.question1.model.Employee;
import com.evaluation.question1.model.EmployeeDTO;

@Repository
public interface EmployeeDao extends JpaRepository<Employee, Integer>{

public List<Employee> findByAddress(String address) throws EmployeeException;
	

	@Query("select new com.evaluation.question1.model.EmployeeDTO(s.empName, s.salary,s.address) from Employee s")
	public List<EmployeeDTO> getNameAddressSalaryOfAllEmployee() throws EmployeeException;
	

	@Query("select s.empName,s.address from Employee s where s.empId=?1")
	public String[] getNameAndAddressOfEmplyeeById(Integer empId)throws
	EmployeeException;
}
