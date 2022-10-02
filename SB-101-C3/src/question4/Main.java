package question4;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThreadA t = new ThreadA();
		ThreadB t1 = new ThreadB();
		ThreadC t2 = new ThreadC();
		
		Thread k = new Thread(t);
		Thread d = new Thread(t1);
		Thread r = new Thread(t2);
		
		k.setName("Kholi");
		d.setName("Dhoni");
		r.setName("Rohit");
		
		
		d.start();
		try {
			d.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		r.start();
		try {
			r.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		k.start();
		
	}

}
