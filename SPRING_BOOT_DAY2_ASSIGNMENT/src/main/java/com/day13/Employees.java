package com.day13;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Employees {

	@RequestMapping("/empl")
	public Employee registerEmp() {
		
		Employee emp = new Employee(1, "Shiva", "Banglore", 50000);
		return emp;
		
	}
	
	@RequestMapping("/hello")
	public String str() {
		
		return "Welcome to my first Application";
	}
	
	@RequestMapping("/list")
	public List<Employee> registerEmpList() {
		
		Employee em1=new Employee(1,"Shiva","Delhi",50000);
		Employee em2=new Employee(2,"Manish","Dwarka",60000);
		Employee em3=new Employee(3,"Ajit","Uttrakhand",70000);
		Employee em4=new Employee(4,"Newton","USA",80000);
		Employee em5=new Employee(5,"Virus","Ladakh",90000);
		
		List<Employee> Emplist=new ArrayList<>();
		
		Emplist.add(em1);
		Emplist.add(em2);
		Emplist.add(em3);
		Emplist.add(em4);
		Emplist.add(em5);
		
		return Emplist;
		
		
	}
}
