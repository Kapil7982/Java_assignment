package com.Question2;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;


public class DetailsLessThanQuantity5 {

	public static void main(String[] args) {
		
        EntityManager em = 	Persistence.createEntityManagerFactory("employeeUnit").createEntityManager();
		
		String jpql= "select * from Product where quantity < 5";
		Query q= em.createNativeQuery(jpql, Product.class);
        List<Product> list= q.getResultList();
		
		list.forEach(a -> System.out.println(a));
	}
}
