package question2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext ac=new AnnotationConfigApplicationContext(AppConfig.class);
		
		StudentService s = ac.getBean("studentService",StudentService.class);
		
		s.printMap();
		
		s.printList();
		
		s.printAppName();
	}

}
