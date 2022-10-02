package question1;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ProductThread pr = new ProductThread();
		
		pr.start();
		
		synchronized (pr) 
		{
			System.out.println("main thread calls the wait method");

			pr.wait();
			
			
			System.out.println("main thread got the notification");
			System.out.println(pr.pro);
		}
		
	}

}
