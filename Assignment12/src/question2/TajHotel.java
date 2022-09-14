package question2;

public class TajHotel implements Hotel{

	public void welcomeDrink()
	{
		System.out.println("Welcome Drink from the TajHotel");
	}
	
	@Override
	public void chickenBiryani()
	{
		System.out.println("Chickern Biryani form the TajHotel");
	}
	
	@Override
	public void masalaDosa()
	{
		System.out.println("Masala Dosa of the Taj Hotel");
	}
	
	public static void main(String[] args)
	{
		
	}
}
