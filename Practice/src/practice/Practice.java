package practice;

public class Practice {
	
	void wholeNum(int n)
	{
		if(n<0)
		{
			System.out.println("Error");
		}
		else if(n%2==0)
		{
			int rem = n%10;
	        System.out.println(rem<0?n -rem:n+(10-rem));
		}
		else if(n%2==1)
		{
			System.out.println(n);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           
		Practice math = new Practice();
		math.wholeNum(44);
		
		
		
	}

}
