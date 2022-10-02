package question5;

public class MyThread extends Thread{

	 public void run()
	    {
	        System.out.println("Extends thread");
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyThread t = new MyThread();
        t.start();
       
	}

	

}
