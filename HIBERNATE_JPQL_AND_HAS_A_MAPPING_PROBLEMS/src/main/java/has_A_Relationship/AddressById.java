package has_A_Relationship;

import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class AddressById {

	public static void main(String[] args) {
		
       EntityManager em= Persistence.createEntityManagerFactory("employeeUnit").createEntityManager();
		
		
       String jpql="from Customer where cid=1";
		
		Query q= em.createQuery(jpql);
	
		List<Customer> emps= q.getResultList();
		
		for(Customer emp:emps) {
			
			List<Address> addrs= emp.getAddresses();
			
			for(Address adr:addrs) {
				
				System.out.println(adr);
			}
			
			
		}
		
		em.close();
	}
}
