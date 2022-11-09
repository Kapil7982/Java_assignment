package question3;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
@Repository
public class ProductRepoImp implements ProductRepo {

	@Override
	public boolean insertProductDetails(Product product) {
		 
		boolean x= false;
		
        EntityManager em= EMUtil.provideEntityManager();
		
		
		em.getTransaction().begin();
		
		em.persist(product);
		x=true;
		
		em.getTransaction().commit();
		
		
		em.close();
		return x;
	}

	@Override
	public List<Product> getAllProductDetails() {
		
		 EntityManager em= EMUtil.provideEntityManager();
			
			Query q= em.createQuery("from Product");
			
			List<Product> product= q.getResultList();
			
			em.close();
			
			return product ;
	}

	@Override
	public Product findProduct(int productId) {
		
        EntityManager em= EMUtil.provideEntityManager();
		
       
        return EMUtil.provideEntityManager().find(Product.class, productId);
   	 
	 	
     
		
	}

	@Override
	public List<Product> getProductInPriceRange(int fromPrice, int toPrice) {
		 
		EntityManager em= EMUtil.provideEntityManager();
		String jpql= "from Product where price BETWEEN price=:fromPrice AND price=:toPrice  ";
		Query q= em.createQuery(jpql);
		q.setParameter("fromPrice", fromPrice);
		q.setParameter("toPrice", toPrice);
		
		List<Product> product= q.getResultList();
		
		
		return product;
	}

}
