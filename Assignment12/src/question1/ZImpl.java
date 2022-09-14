package question1;

public class ZImpl implements Z{

	@Override
	public void methodX()
	{
		System.out.println("Method implements of X interface in ZImpl class");
	}
	@Override
	public void methodY() {
		
		System.out.println("Method implements of Y interface in ZImpl class");
	}

	@Override
	public void methodZ() {
		
		System.out.println("Method implements of Z interface in ZImpl class");
	}

	@Override
	public void defaultMethodOfX()
	{
		System.out.println("Override the default method of X class in ZImpl class");
	}
}
