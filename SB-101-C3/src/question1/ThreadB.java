package question1;

public class ThreadB extends Thread {

	BetweenThem b;
	String name;
	
	public ThreadB(BetweenThem b, String name)
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
