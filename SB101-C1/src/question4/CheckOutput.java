package question4;



	public class CheckOutput {
		public static void main(String args[])
		{
		    try
			{
				System.out.print("A");
				
				int num = 99/0;
				
				System.out.print("B");
			}
			catch(ArithmeticException ex)
			{
			    System.out.print("C");
			}
			catch(Exception ex)
			{
			     System.out.print("D");
			}
			    System.out.print("E");
			}
		}


	//    The Output of the above code is "ACE" because the above program run line by line and when it comes to line number 10 it simply execute the
	//    print statement and after that when it comes to line number 12 then it get's the ArithemeticException and didn't execute the line number
	//    14 and that exception caught by line number 16 which is there to catch the ArithemeticException and execute the line number 18 print statement
	//    and after that the second exception which is super of all the exception but there is no other exception and the last statement execute and 
	//    we got the resulted output which is "ACE".