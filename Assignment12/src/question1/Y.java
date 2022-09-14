package question1;

public interface Y {

   void methodY();
	
	default void defaultMethodOfY()
	{
		System.out.println("Default method of Y..");
	}
	
	static void staticMethodOfY()
	{
		System.out.println("Static mehotd of Y....");
	}
}
