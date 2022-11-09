package question3;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle{

	void start() {
		
		System.out.println("Bike journey start");
	}
	
	public void go() {
		
	      start();
	}
}
