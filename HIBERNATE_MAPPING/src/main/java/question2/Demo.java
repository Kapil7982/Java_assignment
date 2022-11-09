package question2;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Demo {

	public static void main(String[] args) {
		
		EntityManager em = Persistence.createEntityManagerFactory("collageUnit").createEntityManager();
		
		Query q = em.createQuery("from Customer where cid= ?1");
		q.setParameter(1, 1);
		
		List<Customer> list = q.getResultList();
		
		em.close();
		
		for(Customer cus : list)
		{
			 System.out.println(cus.getCid());
        	 System.out.println(cus.getName());
        	 System.out.println(cus.getEmail());
        	 System.out.println(cus.getMobileNumber());
        	 List<Address> adrs = cus.getAddresses();
        	 for(Address a:adrs) {
        		 System.out.println(a.getState());
        		 System.out.println(a.getCity());
        		 System.out.println(a.getPincode());
        	 }
		}
	}
}
