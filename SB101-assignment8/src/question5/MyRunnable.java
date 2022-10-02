package question5;

public class MyRunnable implements Runnable{

	public void run(){
	      System.out.println(" Runnable Thread");
	   }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  MyRunnable r=new MyRunnable();
	      Thread t =new Thread(r);
	      t.start();
	}
}
