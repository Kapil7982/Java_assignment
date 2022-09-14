package question1;

public interface X {

	void methodX();
	
	default void defaultMethodOfX()
	{
		System.out.println("Default method of X..");
	}
	
	static void staticMethodOfX()
	{
		System.out.println("Static mehotd of X....");
	}
}
