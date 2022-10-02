package question3;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Product[] p = {
			
				new Product(2),
				new Product(5),
				new Product(4),
				new Product(3),
				new Product(6),
				new Product(7),
				
		};
		
		ExecutorService service = Executors.newFixedThreadPool(3);
		
		for(Product pronum : p)
		{
			Future f = service.submit(pronum);
			
			try {
				System.out.println("Product :- "+ f.get());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		service.shutdown();
	}

}
