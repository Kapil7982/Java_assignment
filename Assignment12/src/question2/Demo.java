package question2;

import java.util.Scanner;

public class Demo {

	public Hotel provideFood(int amount)
	{
		if(amount>1000)
		{
			return new TajHotel();
		}
		else if(amount>200 && amount<1000)
		{
			return new RoadSideHotel();
		}
		else
		{
			return null;
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter amount");
		
		int amount = sc.nextInt();
		
		Demo d = new Demo();
		
		Hotel h = d.provideFood(amount);
		
		if(h!=null)
		{
			if(h instanceof TajHotel)
			{
				((TajHotel)h).welcomeDrink();
				h.chickenBiryani();
				h.masalaDosa();
				
			}
			else if(h instanceof RoadSideHotel)
			{
				h.chickenBiryani();
				h.masalaDosa();
			}
			else
			{
				System.out.println("Please Enter a valid amount");
			}
		}
	}
}
