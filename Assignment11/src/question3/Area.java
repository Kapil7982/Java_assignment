package question3;

public class Area extends Shape{

	double PI = 3.142;

	@Override
	public int rectangleArea(int length, int breadth) {
		// TODO Auto-generated method stub
		System.out.println("Area of Rectangle is :- "+length*breadth);
		return 0;
		
	}
     
	@Override
	public int squareArea(int side) {
		// TODO Auto-generated method stub
		System.out.println("Area of Square is :- "+side*side);
		return 0;
	}

	@Override
	public int circleArea(int radius) {
		// TODO Auto-generated method stub
		System.out.println("Area of Circle is :- "+PI*(radius*radius));
		return 0;
	}

	

	
}
