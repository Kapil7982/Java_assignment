package question4;

public class ThreadB implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=0; i<=20; i++)
		{
			sum+= i;
		}
		
		System.out.println(Thread.currentThread().getName()+ " "+"Sum of first 20 :-" +sum);
	}

	
}
