package question4;

import java.util.Scanner;

public class Student {

	private int roll;
	private String name;
	private int marks;
	private char grade;
	
	
	public Student ()
	{
		
	}
	
	public int getRoll() 
	{
		return roll;
	}
	
	public void setRoll(int roll) 
	{
		this.roll = roll;
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public int getMarks() 
	{
		return marks;
	}

	public void setMarks(int marks) 
	{
		this.marks = marks;
	}

	public char getGrade() 
	{
		return grade;
	}

	public void setGrade(char grade) 
	{
		this.grade = grade;
	}
	
	public void displayDetails()
	{
		Scanner sc = new Scanner(System.in);
		
		Student s = new Student();
		
		System.out.println("Enter roll number");
		int roll = sc.nextInt();
		s.setRoll(roll);
		
		System.out.println("Enter name");
		String name = sc.next();
		s.setName(name);
		
		System.out.println("Enter marks");
		int marks = sc.nextInt();
		s.setMarks(marks);
		
		
		char grade = s.calculateGrade(marks);
		s.setGrade(grade);
		
		System.out.println(s.toString());
	}
	
	@Override
	public String toString()
	{
		return " Student [roll:- " + roll + " , name:- "+ name+ " , marks :- "+marks+ " , grade :- "+ grade+ "]";
	}
	
	private char calculateGrade(int marks)
	{
		if(marks>= 500)
		{
			return ('A');
		}
		else if(marks<500 && marks>=400)
		{
			return ('B');
		}
		else if(marks<400)
		{
			return ('C');
		}
		return grade;
		
	}
}
