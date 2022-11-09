package com.Question2;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class DetailsById {

	public static void main(String[] args) {
		
		EntityManager em = 	Persistence.createEntityManagerFactory("employeeUnit").createEntityManager();
		
		String jpql= "from Product where ProductId=1";
		TypedQuery<Product> q= em.createQuery(jpql,Product.class);
		
		Product acc= q.getSingleResult();
		
		System.out.println(acc);

	}
}
