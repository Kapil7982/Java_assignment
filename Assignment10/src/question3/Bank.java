package question3;

public class Bank {

	private Bank(){
	      System.out. println("Inside private constructor of Bank");
	   }

	public static Bank display() 
	{
	      return new Bank();
	  }
	  
	
}
