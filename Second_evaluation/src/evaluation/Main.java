package evaluation;

import java.util.Scanner;

import secondquestion.Ticket;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number of Students you want to enter:");
		int noOfStudent = sc.nextInt();
		int i=1;
		
		while(i<=noOfStudent) {
			
			 System.out.println("Enter Roll Number: ");
	    	  int rollNumber = sc.nextInt();
	    	  
	    	  System.out.println("Enter Name: ");
	    	  String name = sc.next();
	    	  
	    	  System.out.println("Enter Marks: ");
	    	  int marks = sc.nextInt();
	    	  
	    	  Student s1 = new Student(rollNumber,name,marks);
	    	  
	          System.out.println("Student Detail: "+i);
	          System.out.println("Student Roll Number: "+s1.getRollNumber());
	          System.out.println("Student Name: "+s1.getStudentName());
	          System.out.println("Student Marks: "+s1.getMarks());
	          System.out.println("==========================================");
	    	  i++;
		}
		
	}

	}


