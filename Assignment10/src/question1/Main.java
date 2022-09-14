package question1;

import java.util.Scanner;

public class Main {

	public static Person generatePerson(Person person)
	{
		if(person instanceof Student)
		{
			Scanner inputScanner=new Scanner(System.in);
			 
			 System.out.println("Enter Student ID ");
			 int studentId=inputScanner.nextInt();
			 
			 System.out.println("Enter course enrolled");
			 String courseEnrolled=inputScanner.next(); 
			 
			 System.out.println("Enter course fee");
			 int courseFee=inputScanner.nextInt();
			   
			   System.out.println("Enter City");
			   String city=inputScanner.next();
			   
			   inputScanner.nextLine();
			   System.out.println("Enter State");
			   String state=inputScanner.nextLine();
			   
			   System.out.println("Enter Pincode");
			   String pinCode=inputScanner.next();
			 
			 Student student=(Student) person;;
			 student.setStudentId(studentId);
			 student.setCourseEnrolled(courseEnrolled);
			 student.setCourseFee(courseFee);
			 
			 Address address=new Address();
			 address.setCity(city);
			 address.setState(state);
			 address.setPinCode(pinCode);
			 
			 student.setAddress(address);
			 
			 return student;
			
			
		}
		
		else if(person instanceof Instructor)
		{
			Scanner inputScanner=new Scanner(System.in);
			
			 
			  System.out.println("Enter Instructor ID");
			   int instructorId=inputScanner.nextInt();
			   
			   System.out.println("Enter Salary");
			   int salary=inputScanner.nextInt();
			 
			  System.out.println("Enter City");
			   String city=inputScanner.next();
			   
			   inputScanner.nextLine();
			   System.out.println("Enter State");
			   String state=inputScanner.nextLine();
			   
			   System.out.println("Enter Pincode");
			   String pinCode=inputScanner.next();
			   
			   
			   Address address=new Address();
			   address.setCity(city);
			   address.setState(state);
			   address.setPinCode(pinCode);
				 
				 Instructor instructor=(Instructor) person;
				 instructor.setInstructorId(instructorId);
				 instructor.setSalary(salary);
				 instructor.setAddress(address);
				 
				 return instructor;
			
			
		}
		return null;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person newStudent = generatePerson(new Student());

		Person newTeacher = generatePerson(new Instructor());

		System.out.println(newStudent);
		System.out.println(newTeacher);

	}

}
