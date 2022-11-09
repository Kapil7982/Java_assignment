package evaluation;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AccountImpl implements AccountDao{
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("accountUnit");

	@Override
	public Account findById(int id) {
		// TODO Auto-generated method stub
		Account  ac = new Account();
		
		EntityManager em = emf.createEntityManager();
		
		ac = em.find(Account.class, id);
		
		return ac;
	}

	@Override
	public String save(Account account) {
		// TODO Auto-generated method stub
		String res= null;
		
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		em.persist(account);
        res = "Successfully Added";
        em.getTransaction().commit();
		
		return res;
	}

	@Override
	public String deleteAccountById(int id) {
		// TODO Auto-generated method stub
		String res = null;
		
		EntityManager em = emf.createEntityManager();
		
		Account ac = em.find(Account.class, id);
		
		if(ac != null)
		{
			em.getTransaction().begin();
			em.remove(ac);
			res = "Deleted Successfully";
			em.getTransaction().commit();
		}
		
		else
		{
			res = "Something went wrong";
		}
		
		return res;
	}

	@Override
	public String withdraw(double amount, int accountId) {
		// TODO Auto-generated method stub
		String res = null;
		
        EntityManager em = emf.createEntityManager();
		
		Account ac = em.find(Account.class, accountId);
		if(ac != null)
		{
			if(ac.getBalance()>=amount)
			{
				em.getTransaction().begin();
				
				ac.setBalance((double)ac.getBalance()-amount);
				
				res = "Withdraw Successfully";
				
				em.getTransaction().commit();
			}
			
			else
			{
				res = "Balance is not available";
			}
			
		}
		else
		{
			res = "Invalid Account";
		}
		
		return res;
	}

	@Override
	public String deposit(double amount, int accountId) {
		// TODO Auto-generated method stub
		String res = null;
		
		EntityManager em = emf.createEntityManager();
		
		Account ac = em.find(Account.class, accountId);
		
		if(ac != null)
		{
			em.getTransaction().begin();
			
			ac.setBalance((double)ac.getBalance()+amount);
			
			res = "Deposit Successfully";
			
			em.getTransaction().commit();
			
		}
		else
		{
			res = "Invalid Account Details";
		}
		
		return res;
		
	}

}
