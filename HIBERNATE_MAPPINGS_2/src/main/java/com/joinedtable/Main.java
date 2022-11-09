package com.joinedtable;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class Main {

	public static void main(String[] args) {
		
		EntityManager em= Persistence.createEntityManagerFactory("employeeUnit").createEntityManager();
		
		
		  Employee e=new Employee();
		
	      e.setName("Salman");
	      e.setHomeAddress(new Address("Juhi_Beach","Mumbai","599464"));
	      e.setOfficeAddress(new Address("Mannat_Haveli","Mumbai","9586472"));
	      e.setSalary(50000);
	      
	      Employee e1=new Employee();
			
	      e1.setName("Joy");
	      e1.setHomeAddress(new Address("Jaipur","Rajasthan","695834"));
	      e1.setOfficeAddress(new Address("TRIPURA","AGARTALA","9865745"));
	      e1.setSalary(50000);
	      
	      Employee e2=new Employee();
			
	      e2.setName("Pooja");
	      e2.setHomeAddress(new Address("AGRA","UTTAR PRADESH","856421"));
	      e2.setOfficeAddress(new Address("AHMEDABAD","GUJARAT","256849"));
	      e2.setSalary(50000);
	      
	      
	      Employee e3=new Employee();
			
	      e3.setName("Salman");
	      e3.setHomeAddress(new Address("ALMORA","UTTARANCHAL","254896"));
	      e3.setOfficeAddress(new Address("AMRITSAR","PUNJAB","321549"));
	      e3.setSalary(50000);
	      
	      
	      
	      
	      em.getTransaction().begin();
	      em.persist(e);
	      em.persist(e1);
	      em.persist(e2);
	      em.persist(e3);
	      em.getTransaction().commit();
	      
	      em.close();
	}
}
