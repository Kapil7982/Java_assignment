package question1;

public class BetweenThem {

	 public synchronized void funA(String name)
	 {
		 System.out.println("Hello");
		 
		 try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		 System.out.println(name);
	 }
}
