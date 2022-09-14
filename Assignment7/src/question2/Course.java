package question2;

import java.util.Scanner;

public class Course {

	
	private int courseId;
	private String courseName;
	private int courseFee;
	
	
	
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public int getCourseFee() {
		return courseFee;
	}
	public void setCourseFee(int courseFee) {
		this.courseFee = courseFee;
	}
	
	
	void displayCourseDetails(int courseId, String courseName, int courseFee)
	{
		this.courseId = courseId;
		this.courseName = courseName;
		this.courseFee = courseFee;
		
		System.out.println("Welcome Student");
		System.out.println("Your course Id is:- "+courseId);
		System.out.println("Your course Name is:- "+courseName);
		System.out.println("Your course Fee is:- "+courseFee);
	}
	
	static void authenticate(String username, String password)
	{
		if(username =="Admin" && password =="Mohit")
		{
			Course  c1 = new Course();
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter your name");
			String courseName = sc.nextLine();
			
			System.out.println("Enter your Course Id");
			int courseId = sc.nextInt();
			
			System.out.println("Enter your Fee");
			int courseFee = sc.nextInt();
			
			c1.displayCourseDetails(courseId, courseName, courseFee);
			
		}
		else
		{
			System.out.println("Invalid usename or password");
		}
	}
	
	
	public static void main(String[] args) {
		authenticate("Admin","Mohit");
		
		System.out.println("------------------------Student Details-------------------------");
		
		authenticate("User","KuchOr");
	}
}
