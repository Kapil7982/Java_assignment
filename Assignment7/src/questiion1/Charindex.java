package questiion1;

import java.util.Scanner;

public class Charindex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string");
		String str = sc.nextLine();
		
		System.out.println(" Enter the character position you want to access:");
		int i = sc.nextInt();
		char Character = str.charAt(i);
		System.out.println("Character of the "+ i+" position is :- "+ Character);
	}

}
