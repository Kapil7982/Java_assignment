package com.Utility;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EmployeeUitility {

	private static EntityManagerFactory emf;
	
	static {
		emf = Persistence.createEntityManagerFactory("accountUnit");
	}
	
	public static EntityManager providEntityManager() {
		
		return emf.createEntityManager();
	}
}
