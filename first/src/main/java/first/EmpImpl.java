package first;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EmpImpl implements EmpDao{

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("empUnit");
	
	@Override
	public void save(Employee emp) {
		// TODO Auto-generated method stub
		 
		
		
		EntityManager em = emf.createEntityManager();
			
		em.getTransaction().begin();
		
		em.persist(emp);
		
		System.out.println("Added");
		
		em.getTransaction().commit();
		
		em.close();
		
		
	}

	@Override
	public String getAddressOfEmployee(int empId) {
		// TODO Auto-generated method stub
		String address = null;
		
       
		
		EntityManager em = emf.createEntityManager();
		
		Employee emp = em.find(Employee.class, empId);
		
		if(emp != null)
		{
			address = emp.getAddress();
		}
		else
		{
			address = "Not Available";
		}
		
		return address;
	}

	@Override
	public String giveBonusToEmployee(int empId, int bonus) {
		// TODO Auto-generated method stub
		String bon = null;
		
		
			
	     EntityManager em = emf.createEntityManager();
	     
	     Employee emp = em.find(Employee.class, empId);
	     
	     if(emp == null)
	     {
	    	 bon = "Nothing";
	     }
	     else
	     {
	    	 em.getTransaction().begin();
	    	 
	    	 emp.setSalary(emp.getSalary()+bonus);
	    	 
	    	 em.getTransaction().commit();
	    	 
	    	 bon = "Bonus available";
	     }
	     
	     em.close();
		
		return bon;
	}

	@Override
	public boolean deleteEmployee(int empId) {
		// TODO Auto-generated method stub
		boolean res = false;
		

			
	     EntityManager em = emf.createEntityManager();
	     
	     Employee emp = em.find(Employee.class, empId);
	     
	     if(emp !=null)
	     {
	    	 em.getTransaction().begin();
	    	 
	    	 em.remove(emp);
	    	 
	    	 res = true;
	    	 
	    	 em.getTransaction().commit();
	    	 
	     }
	     
	     else
	     {
	    	 res = false;
	     }
	     
	     em.close();
		
		return res;
	}

}
