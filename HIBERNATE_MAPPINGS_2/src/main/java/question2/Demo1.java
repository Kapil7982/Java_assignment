package question2;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class Demo1 {

	public static void main(String[] args) {
		
		EntityManager em= Persistence.createEntityManagerFactory("employeeUnit").createEntityManager();
		
		Student s1=new Student();
		
		s1.setName("Salman");
		s1.setMobile("58974625");
		s1.setEmail("salman@gmail.com");
		
		Student s2=new Student();
		
		s2.setName("Joy");
		s2.setMobile("867236767");
		s2.setEmail("joy@gmail.com");
		
		
		Course c1 = new Course();
		c1.setCourseName("Spring");
		c1.setDuration("2 month");
		c1.setFee(3200);
		
		c1.getStudent().add(s1);
		c1.getStudent().add(s2);
		
		Course c2 = new Course();
		c2.setCourseName("Hibernate");
		c2.setDuration("2 month");
		c2.setFee(3200);
		
		c2.getStudent().add(s1);
		c2.getStudent().add(s2);
		
		s1.getCourse().add(c1);
		s1.getCourse().add(c2);
		
		s2.getCourse().add(c1);
		s2.getCourse().add(c2);
		
		em.getTransaction().begin();
		
		em.persist(s1);
		em.persist(s2);
		
		em.getTransaction().commit();
		
		
		em.close();
		
	}
	
}
