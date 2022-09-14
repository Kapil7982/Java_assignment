package natural_numbers;

public class  PrimeFactors {
	

    public static void factorial(int n) {
    	if(n>1 && n<101)
    	{
    		for(int i=1; i<=n; i++)
    		{
    			if(n%i==0)
    			{
    				System.out.println(i);
    			}
    		}
    	}
    	else
    	{
    		System.out.println("Invalid Number");
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		factorial(100);
	}

}
