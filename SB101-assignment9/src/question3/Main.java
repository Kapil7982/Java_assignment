package question3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
        ForEven even = new ForEven();
    
        ForOdd odd = new ForOdd(even);
        
        even.start();
        odd.start();
	}

}
