package question4;

import org.springframework.stereotype.Component;


public class Triangle implements Drawshapes{

	
	void draw() {
		
		System.out.println("You have drawn Triangle");
	}

	@Override
	public void shapes() {
		// TODO Auto-generated method stub
		draw();
	}
	

}