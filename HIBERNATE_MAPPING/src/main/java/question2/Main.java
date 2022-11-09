package question2;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;


public class Main {

	public static void main(String[] args) {
		

	    EntityManager em = 	Persistence.createEntityManagerFactory("collageUnit").createEntityManager();
	
	    Customer c = new Customer();
	    
	    
	    c.setName("Ram");
	    c.setEmail("ram@gamil.com");
	    c.setMobileNumber("9887675675");
	    
	    Customer c1 = new Customer();
	    
	    
	       c1.setName("Ravi");
		   c1.setEmail("ravi@gamil.com");
		   c1.setMobileNumber("7989348685");
	    
	    c.getAddresses().add(new Address("Bihar", "Patna", "110078"));
	    c.getAddresses().add(new Address("Rajasthan", "Jaipur", "546700"));
	    c.getAddresses().add(new Address("Maharashtra", "Mumbai", "989566"));
	    
	    c1.getAddresses().add(new Address("Tripura", "Agartala", "34356"));
	    c1.getAddresses().add(new Address("Utter Pradesh", "Agra", "45678"));
	    c1.getAddresses().add(new Address("Goa", "Panji", "897564"));
	    
	    em.getTransaction().begin();
	    
	    em.persist(c);
	    em.persist(c1);
	    
	    em.getTransaction().commit();
	    
	    em.close();
	}
}
