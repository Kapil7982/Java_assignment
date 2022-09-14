package question3;

public class Main {

	
	public int[] findAndReturnPrimeNumbers(int[] inputArray)
	{
		
		int count=0;
		for(int i=0; i<inputArray.length; i++)
		{
			if(prime(inputArray[i]))
			{
				count++;
			}
		}
		int[] num = new int[count];
		int index =0;
		for(int i=0; i<inputArray.length; i++)
		{
			if(prime(inputArray[i]))
			{
				num[index]= inputArray[i];
				index++;
			}
		}
		return num;
		
	}
	
 public	static boolean prime(int n)
	{
		for(int i=2; i<n; i++)
		{
			if(n%i==0 )
			{
				return false;
			}
		}
		if(n<2)
		{
			return false;
		}
		return true;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr = {10,12,5,50,11,14,15,29,19,23};
		
	    Main m1 = new Main();
	    
		int [] num = m1.findAndReturnPrimeNumbers(arr);
		for(int i=0; i<num.length; i++)
		{
			
			System.out.println(num[i]);
		}
	}

}
