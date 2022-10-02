package question1;

public class ThreadA extends Thread{

	BetweenThem b;
	String name;
	
	public ThreadA(BetweenThem b, String name)
	{
		this.b= b;
		this.name = name;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		b.funA(name);
	}
}
