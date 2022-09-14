package natural_numbers;

public class Natural_numbers {
	

	static int naturalNumbersSum(int n)
	{
		
			return n*(n+1)/2;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
         int n = 5;
         System.out.println("Sum of natural numbers:-"+naturalNumbersSum(n));
	}

}
