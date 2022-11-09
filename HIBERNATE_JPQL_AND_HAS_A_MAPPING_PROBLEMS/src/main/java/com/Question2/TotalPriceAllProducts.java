package com.Question2;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class TotalPriceAllProducts {

	public static void main(String[] args) {
		
		EntityManager em = 	Persistence.createEntityManagerFactory("employeeUnit").createEntityManager();
		
        String jpql= "select price,quantity,productName from Product";
		
		Query q= em.createQuery(jpql);

	
	
	 	List<Object[]> results= q.getResultList();
	 
	 	for(Object[] or: results) {
	 		
	 		 int price= (Integer)or[0];
	 		 int quantity= (Integer)or[1];
	 		 String name = (String)or[2];
	 		 
	 		 int total = price*quantity;
	 		
	 		 System.out.println("Total price of "+name +" is:- "+total);
	 		 
	 		 
	 		System.out.println("===========================");
	}
	}
}
