package question3;

import java.util.concurrent.Callable;

public class Product implements Callable {

	int n;
	
	public Product(int n)
	{
		super();
		this.n = n;
	}
	
	@Override
	public Object call() throws Exception {
		// TODO Auto-generated method stub
		int pro=1;
		for(int i=1; i<=n; i++)
		{
			pro*= i;
		}
		return pro;
	}

	
}
