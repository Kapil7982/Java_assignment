package question1;

public class OLA {

	public Car bookCar(int numberOfPassenger, int numberOfKMs)
	{

       if(numberOfPassenger<=3)
       {
    	   HatchBack h1 = new HatchBack();
    	   h1.setNumberOfPassenger(numberOfPassenger);
    	   h1.setNumberOfKms(numberOfKMs);
    	   
    	   return h1;
       }
       else 
       {
    	   Sedan s1 = new Sedan();
    	   s1.setNumberOfPassenger(numberOfPassenger);
    	   s1.setNumberOfKms(numberOfKMs);
    	   
    	   return s1;
       }
	
		
		
	}
	public int calculateBill(Car car)
	{
		if(car instanceof HatchBack)
		{
			HatchBack h1 = (HatchBack) car;
			
			int numberOfKMs = h1.getNumberOfKms();
			int farePerKm = h1.farePerKm;
			int totalFare = numberOfKMs*farePerKm;
			
			return totalFare;
		}
		else if(car instanceof Sedan)
		{
			Sedan s1 = (Sedan) car;
			
			int numberOfKMs = s1.getNumberOfKms();
			int farePerKm = s1.farePerKm;
			int totalFare = numberOfKMs*farePerKm;
			
			return totalFare;
			
		}
		return 0;
	}
}
