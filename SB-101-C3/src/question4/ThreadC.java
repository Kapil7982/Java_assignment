package question4;

public class ThreadC implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int pro=1;
		
		for(int i=1; i<=10; i++)
		{
			pro*= i;
		}
		
		System.out.println(Thread.currentThread().getName()+ "Product of 1st 10 numbers :-" +pro);
	}

	
}
