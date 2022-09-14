package question1;

public class Instructor extends Person{

	int instructorId;
	int salary;
	
	
	public int getInstructorId()
	{
		return instructorId;
	}
	
	public void setInstructorId(int instructorId)
	{
		this.instructorId= instructorId;
	}
	
	public int getSalary()
	{
		return salary;
	}
	
	public void setSalary(int salary)
	{
		this.salary= salary;
	}
	
	@Override
	public String toString()
	{
		return "Instructor [instructorId=" + instructorId + ", salary=" + salary + 
				", address =Address[" +" city = " + address.city+ ", State = "+ address.state +", Pincode = "+ address.pincode  +"]";
		
	}
}
