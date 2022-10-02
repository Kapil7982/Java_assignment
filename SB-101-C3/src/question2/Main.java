package question2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Product p = new Product();
		
		p.start();
		
		synchronized (p) {
			
			try {
				p.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println(p.pro);
		}
	}

}
