package question6;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// TODO Auto-generated method stub

		      OddEvenAgain[] arr = {
				
				new OddEvenAgain(10),
				new OddEvenAgain(21),
				new OddEvenAgain(30),
				new OddEvenAgain(5),
				new OddEvenAgain(50),
				new OddEvenAgain(69),
				};
		      
				ExecutorService service= Executors.newFixedThreadPool(3);
				
				for(OddEvenAgain oye:arr)
				{
				  Future f= service.submit(oye);
				  System.out.println(f.get());
				}
				service.shutdown();
	}

}
