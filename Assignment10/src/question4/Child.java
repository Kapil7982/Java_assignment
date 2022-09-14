package question4;

public class Child extends Parent{

	
	public Child(int number)
	{
		super(number);
	}

	@Override
	void method1()
	{
		System.out.println("Inside the method 1 of Child class");
	}
	
	void method4()
	{
		System.out.println("Inside the method 4 of Child class");
	}
}
