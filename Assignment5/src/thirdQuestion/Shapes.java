package thirdQuestion;

public class Shapes {

	   public void area(Circle circle) {
		 
		 double result = 3.14*(double)circle.radius*(double)circle.radius;
		 System.out.println("Area of circle is:- "+ result + " square meter.");
	    }

		public void area(Rectangle rectangle) {

			int result = rectangle.breadth*rectangle.length;
			System.out.println("Area of rectangle is:- " + result + " square meter.");
		} 
		
		public void area(Square square) {
			 
			 double result = square.side*square.side;
			 System.out.println("Area of Square is:- "+ result + " square meter.");
		}
}
