package com.question1;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 EntityManager em = Persistence.createEntityManagerFactory("collageUnit").createEntityManager();
				
		    Collage c = new Collage();
			c.setCollageName("IIT");
			c.setCollageAddress("Banglore");
			
			Collage c1 = new Collage();
			c1.setCollageName("IIM");
			c1.setCollageAddress("Ahemdabad");
			
			
			Student s1 = new Student();
			s1.setStudentName("Jai");
			s1.setMobileNumber("9987554456");
			s1.setEmail("jai@gmail.com");
			s1.setCollage(c);
			
			
			Student s2 = new Student();
			s2.setStudentName("Joy");
			s2.setMobileNumber("546768345");
			s2.setEmail("joy@gmail.com");
			s2.setCollage(c);
			
			Student s3 = new Student();
			s3.setStudentName("Mohit");
			s3.setMobileNumber("99567587344");
			s3.setEmail("mohit@gmail.com");
			s3.setCollage(c);
			
			Student s4 = new Student();
			s4.setStudentName("Tarun");
			s4.setMobileNumber("99875343465");
			s4.setEmail("tarun@gmail.com");
			s4.setCollage(c);
			
			
			Student s5 = new Student();
			s5.setStudentName("Gautum");
			s5.setMobileNumber("99875432445");
			s5.setEmail("gautum@gmail.com");
			s5.setCollage(c1);
			
			Student s6 = new Student();
			s6.setStudentName("Anjali");
			s6.setMobileNumber("9987534444");
			s6.setEmail("anjali@gmail.com");
			s6.setCollage(c1);
			
			Student s7 = new Student();
			s7.setStudentName("Majnubhai");
			s7.setMobileNumber("9999999999999");
			s7.setEmail("Majnubhai@gmail.com");
			s7.setCollage(c1);
			
			
			
			Student s8 = new Student();
			s8.setStudentName("Udaybhai");
			s8.setEmail("udaybhai@gmail.com");
			s8.setMobileNumber("998766756768");
			s8.setCollage(c1);
			
			
			c.getStudents().add(s1);
			c.getStudents().add(s2);
			c.getStudents().add(s3);
			c.getStudents().add(s4);
			c.getStudents().add(s5);
			c.getStudents().add(s6);
			c.getStudents().add(s7);
			c.getStudents().add(s8);
			
			
			em.getTransaction().begin();
			
			em.persist(c);
			em.persist(c1);
			
			em.getTransaction().commit();
			
			
			
			
			Collage collage = em.find(Collage.class, 1);
			
			List<Student> studentList = collage.getStudents();
			
			studentList.forEach(s -> {
				System.out.println("Student Name: "+ s.getStudentName());
				System.out.println("Student Mobile: "+ s.getMobileNumber());
				System.out.println("Student Email: "+ s.getEmail());
				System.out.println("Student Roll: "+ s.getStudentRoll());
				System.out.println("====================================================");
			});
			
//			Student student = em.find(Student.class, 1);
			
			
			

				em.close();
	}

}
