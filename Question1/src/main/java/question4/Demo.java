package question4;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class Demo {

	public static void main(String[] args) {
		
		EntityManager em = Persistence.createEntityManagerFactory("evaluationUnit").createEntityManager();
		
		ConractualEmployee ce = new ConractualEmployee();
		
		ce.setEmpName("Ravi");
		ce.setCostofperday(100);
		ce.setNoOfWorkingDays(10);
		ce.setMobileNumber("78909756454");
		
       ConractualEmployee ce1 = new ConractualEmployee();
		
		ce1.setEmpName("Mohit");
		ce1.setCostofperday(200);
		ce1.setNoOfWorkingDays(20);
		ce1.setMobileNumber("875683484876");
		
		
		ConractualEmployee ce2 = new ConractualEmployee();
		
		ce2.setEmpName("Chavi");
		ce2.setCostofperday(300);
		ce2.setNoOfWorkingDays(30);
		ce2.setMobileNumber("059867474864");
		
		
		ConractualEmployee ce3 = new ConractualEmployee();
		
		ce3.setEmpName("Kavi");
		ce3.setCostofperday(400);
		ce3.setNoOfWorkingDays(40);
		ce3.setMobileNumber("4564765766657");
		
		SalariedEmployee se = new SalariedEmployee();
		se.setEmpName("Joy");
		se.setSalary(20000);
		se.setEmail("joy@gamil.com");
		
		SalariedEmployee se1 = new SalariedEmployee();
		se1.setEmpName("Rancho");
		se1.setSalary(30000);
		se1.setEmail("rancho@gamil.com");
		
		SalariedEmployee se2 = new SalariedEmployee();
		se2.setEmpName("Chatur");
		se2.setSalary(40000);
		se2.setEmail("chatur@gamil.com");
		
		SalariedEmployee se3 = new SalariedEmployee();
		se3.setEmpName("Raju");
		se3.setSalary(50000);
		se3.setEmail("raju@gamil.com");
		
		em.getTransaction().begin();
		
		em.persist(ce);
		em.persist(ce1);
		em.persist(ce2);
		em.persist(ce3);
		em.persist(se);
		em.persist(se1);
		em.persist(se1);
		em.persist(se3);
		
		em.getTransaction().commit();
		
		em.close();
		
	}
}
