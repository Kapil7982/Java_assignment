package has_A_Relationship;


import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    EntityManager em = 	Persistence.createEntityManagerFactory("employeeUnit").createEntityManager();
	
	    Customer c = new Customer();
	    
	    
	    c.setName("Ram");
	    c.setEmail("ram@gamil.com");
	    c.setMobleNumber("9887675675");
	    
	    
	       c.setName("Ravi");
		   c.setEmail("ravi@gamil.com");
		   c.setMobleNumber("7989348685");
	    
	    c.getAddresses().add(new Address("Bihar", "Patna", "110078", "Home"));
	    c.getAddresses().add(new Address("Rajasthan", "Jaipur", "546700", "Office"));
	    c.getAddresses().add(new Address("Maharashtra", "Mumbai", "989566", "Farm_House"));
	    
	    c.getAddresses().add(new Address("Tripura", "Agartala", "34356", "Home"));
	    c.getAddresses().add(new Address("Utter Pradesh", "Agra", "45678", "Office"));
	    c.getAddresses().add(new Address("Goa", "Panji", "452367", "Farm_House"));
	    
	    em.getTransaction().begin();
	    
	    em.persist(c);
	    
	    em.getTransaction().commit();
	    
	    em.close();
	}

}
