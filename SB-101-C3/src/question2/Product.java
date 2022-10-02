package question2;

public class Product extends Thread{

	int pro=1;
	
	@Override
	public void run() {
		
		synchronized (this) {
			
		     for(int i=1; i<=10; i++)
		     {
		    	 pro*= i;
		     }
		     this.notify();
		}
	}
}
