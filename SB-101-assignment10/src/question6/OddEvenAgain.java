package question6;

import java.util.concurrent.Callable;

public class OddEvenAgain implements Callable{
	
	int num;
	
	public OddEvenAgain(int num) {
		
		this.num = num;
	}

	@Override
	public Object call() throws Exception {
		// TODO Auto-generated method stub
		
		
			if(num%2==0)
			{
				return "Even Number";
			}
			else if(num%2!=0)
			{
				return "Odd Number";
			}
			return num;
		
		
		
	}
	

	
}
