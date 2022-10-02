package question1;

public class ProductThread extends Thread{

	int pro = 1;
	
	@Override
	public void run() {
		
		
		synchronized (this) 
		{
			
			System.out.println("child thread performing calculation");
			
			for(int i=1; i<=10; i++)
			{
				pro = pro*i;
			}
			
			System.out.println("child thread giving the notification");
			this.notify();
		}
		
	}
}
