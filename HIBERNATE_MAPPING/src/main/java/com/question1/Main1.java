package com.question1;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        EntityManager em = Persistence.createEntityManagerFactory("collageUnit").createEntityManager();
		
        String jpql= ("select Collage from Student where studentRoll=3");
        
        Query q = em.createQuery(jpql);
		
		List<Collage> list= q.getResultList();
		
		System.out.println(list);
	}

}
