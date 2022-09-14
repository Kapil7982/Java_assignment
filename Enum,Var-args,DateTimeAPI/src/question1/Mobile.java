package question1;

import java.util.Scanner;

public class Mobile {
	
	static String[] outdatedModels = {"note4","note5","note6","note7"};
	

	public static void searchOutdatedModel(String companyName, String... model) 
	{
		
		for(int i=0; i<model.length; i++)
		{
			String s = model[i];
			
			for(int j=0; j<outdatedModels.length; j++)
			{
				if(outdatedModels[j].equals(s))
				{
					System.out.println(s+ "_OUTDATED");
					break;
				}
			}
		}
	}
		
	   public static void main(String[] args)
	   {
		   Mobile m = new Mobile();
		   
		  Scanner sc = new Scanner(System.in);
		  
		  System.out.println("Enter how many models you want to check?");
		  
		  int n = sc.nextInt();
		  
		  String[] models = new String[n];
		  for(int i=0; i<n; i++)
		  {
			  System.out.println("Enter the model name:- ");
			  
			  String model = sc.next();
			  
			  models[i] = model;
		  }
		  
		  m.searchOutdatedModel("Samsung", models);
	   }
	}

