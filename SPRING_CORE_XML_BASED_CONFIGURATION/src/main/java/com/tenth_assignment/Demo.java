package com.tenth_assignment;

import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

		   private Map<Department, Employee> theMap;
		
			public void myInit()
			{
				System.out.println("inside myInit method");
			}
			public void cleanUp()
			{
			   System.out.println("inside cleanUp method");
			}
			public void showDetails()
			{
			  System.out.println("inside showDetails of Demo class");
			//print all the details of all the employees department-wise.
			  
			  for (Department name:theMap.keySet()) 
			  {
				    Department key = name;
				    Employee value = theMap.get(name);
				    System.out.println(key + " " + value);
				}
			}
			
			
			public void setTheMap(Map<Department, Employee> theMap) {
				this.theMap = theMap;
			}

	public static void main(String[] args) {
		
        ApplicationContext ac= new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Demo  demo = ac.getBean("dd", Demo.class);
		
		demo.showDetails();
		
		ClassPathXmlApplicationContext cac  =(ClassPathXmlApplicationContext) ac;
		
		cac.close();
	}

}
