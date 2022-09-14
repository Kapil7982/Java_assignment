package question4;

public class Test implements Intr {

	@Override
	public int[] display(int p) {
		
		int[] arr = new int[p];
		
		for(int i=2; i<p; i++)
		{
			int count=0; 
			for(int j=2; j<i; j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count==0)
			{
				arr[i]=i;
			}
		}
		return arr;
	}

}
