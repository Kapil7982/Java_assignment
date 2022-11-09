package question3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "question4")
public class Configrauation {

	@Bean("vv")
	public Vehicle getV() {
		
		Car c = new Car();
		
		return c;
	}
}
