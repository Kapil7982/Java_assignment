package question1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo {

	public static void main(String[] args) {
		
		ApplicationContext ac = new AnnotationConfigApplicationContext(Config.class);
		
		DataDepend dp = ac.getBean("dP", DataDepend.class);
		
		dp.representsData();
	}
}
