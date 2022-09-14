package question6;

import java.util.Scanner;

public class Main {

	public static double getStudent(int choice)
	{
          Scanner sc = new  Scanner(System.in);
		
		double per=0.0;
		if(choice==1)
		{
			System.out.println("Enter Hindi Marks:- ");
			int hindi = sc.nextInt();
			
			System.out.println("Enter English Marks:- ");
			int englis = sc.nextInt();
			
			System.out.println("Enter History Marks:- ");
			int history = sc.nextInt();
			
			ArtStudent art = new ArtStudent();
			art.setEnglishMarks(englis);
			art.setHindiMarks(hindi);
			art.setHistoryMarks(history);
			
			
			per = art.findPercentage();
			
		}
		
		if(choice==2)
		{
			System.out.println("Enter Physics Marks:- ");
			int physics = sc.nextInt();
			
			System.out.println("Enter Chemistry Marks:- ");
			int chemistry = sc.nextInt();
			
			System.out.println("Enter Maths Marks:- ");
			int maths = sc.nextInt();
			
			System.out.println("Enter Biology Marks:- ");
			int biology = sc.nextInt();
			
			ScienceStudent sci = new ScienceStudent();
			sci.setPhysicsMarks(physics);
			sci.setChemistryMarks(chemistry);
			sci.setMathsMarks(maths);
			sci.setBiologyMarks(biology);
			
		
			per = sci.findPercentage();
			
		}
		
		if(choice==1)
		{
			System.out.println("Enter Account Marks:- ");
			int account = sc.nextInt();
			
			System.out.println("Enter Economics Marks:- ");
			int economics = sc.nextInt();
			
			System.out.println("Enter Business Marks:- ");
			int business = sc.nextInt();
			
			CommerceStudent com = new CommerceStudent();
			com.setAccountMarks(account);
			com.setEconomicsMarks(economics);
			com.setBusinessStudiesMarks(business);
			
			
			per = com.findPercentage();
			
		}
		
		return per;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double answer = getStudent(2);
		System.out.println("Percentage is: "+ answer);
		
	}

}
