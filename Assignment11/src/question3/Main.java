package question3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Area area = new Area();
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter length for rectangle: ");
	        int len = sc.nextInt();
	        
	  
	        System.out.print("Enter breadth for rectangle: ");
	        int breadth = sc.nextInt();
	        area.rectangleArea(len, breadth);
	        
	        System.out.println("============================================================================");

	        System.out.print("Enter side for square: ");
	        int side = sc.nextInt();
	        area.squareArea(side);
	        
	        System.out.println("============================================================================");

	        System.out.print("Enter radius for circle: ");
	        int radius = sc.nextInt();
	        area.circleArea(radius);
	}

}
