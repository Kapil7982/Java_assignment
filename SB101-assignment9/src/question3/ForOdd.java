package question3;

public class ForOdd extends Thread{

	ForEven even;
	
	public ForOdd(ForEven even)
	{
		this.even = even;
	}
	
	 @Override
	 public void run()
	 {
		 try {
			even.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	        for(int i=0;i<20;i++)
	        {
	            if(i%2 == 1)
	                System.out.println("Odd :-" +i);
	        }
	    }
}
