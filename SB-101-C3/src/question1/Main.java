package question1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		BetweenThem b = new BetweenThem();
		ThreadA  t = new ThreadA(b,"Ravi");
		ThreadB t1 = new ThreadB(b, "Kavi");
		
		t.start();
		t1.start();
	}

}
