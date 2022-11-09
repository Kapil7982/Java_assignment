package question5;

public class Clerk implements Person{

	public void registerStudent()
	{
		 System.out.println("enroll the Student in Collage");
	}

	@Override
	public void inService() {
		
		registerStudent();
		
	}
}
