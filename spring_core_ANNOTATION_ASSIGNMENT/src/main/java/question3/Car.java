package question3;

import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle {

	void start() {
		
		System.out.println("Car journey start");
	}
	
	public void go() {
		
		start();
	}
}
