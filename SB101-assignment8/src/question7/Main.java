package question7;

public class Main implements Runnable  {

	public void run()
	{
		for(int i=0;i<10;i++){
			String tname=Thread.currentThread().getName();
			System.out.println(tname +": is running");
			}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Main m = new Main();
		
		Thread one = new Thread(m);
		Thread two = new Thread(m);
		
		
		one.setName("Dhoni :- Dhoni's thread..");
		two.setName("Kohli :- Kholi's thread..");
		
		one.setPriority(8);
		one.setPriority(10);
		

		
		one.start();
		two.start();
	
		
		
		
	}

}
