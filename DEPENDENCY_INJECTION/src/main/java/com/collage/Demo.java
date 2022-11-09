package com.collage;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

	public static void main(String[] args) {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Collage  c = ac.getBean(Collage.class, "c");
		
		System.out.println("Collage address :- " +c.getCollage_address());
		System.out.println("Collage name :- " +c.getCollage_name());
		System.out.println("Student details :- " +c.getStudent());
	}
}
