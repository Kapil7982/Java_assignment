package com.Question2;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Demo {

	 public static void main(String[] args) {
		
		 EntityManager em = 	Persistence.createEntityManagerFactory("employeeUnit").createEntityManager();
		 
		    Query q= em.createNamedQuery("product.price");
		    Query q1 = em.createNamedQuery("product.name");
			
			
			List<Object[]> list= q1.getResultList();
			
			for(Object[] oa : list)
			{
				String name = (String)oa[0];
				int qut = (Integer)oa[1];
				
				System.out.println("Nmme is" + name);
				System.out.println("Balance is " + qut);
				
				System.out.println("============================================");
			}
		    
		    q.setParameter("id", 3);
		    Integer a= (Integer)q.getSingleResult();
			
			 System.out.println("Quantity of productId is" + a);
	}
}
