package question1;

public class Student extends Person {

	int StudentId;
	String courseEnrolled ;
	int courseFee;
	
	
	public int getStudentId()
	{
		return StudentId;
	}
	
	public void setStudentId(int StudentId)
	{
		this.StudentId= StudentId;
	}
	
	public String getCourseEnrolled()
	{
		return courseEnrolled;
	}
	
	public void setCourseEnrolled(String courseEnrolled)
	{
		this.courseEnrolled= courseEnrolled;
	}
	
	public int getCourseFee()
	{
		return courseFee;
	}
	
	public void setCourseFee(int courseFee)
	{
		this.courseFee= courseFee;
	}
	
	@Override
	public String toString()
	{
		return "Student  [studentId=" + StudentId + ", courseFee=" + courseFee + ", courseEnrolled="+ courseEnrolled+
				", address= Address[" +" city = " + address.city+ ", State = "+ address.state +", Pincode= "+address.pincode  +"]";
		
	}

	

	

	

	
}
