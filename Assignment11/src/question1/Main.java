package question1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of passengers:- ");
		int numberOfPassengers = sc.nextInt();
		
		System.out.println("Enter number of kilometers:- ");
		int numberOfKms = sc.nextInt();
		
		OLA myOla = new OLA();
		Car myCar = myOla.bookCar(numberOfPassengers, numberOfKms);
		int res = myOla.calculateBill(myCar);
		System.out.println("The total fare amount is :- "+ res);
	}

}
