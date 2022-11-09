package question2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;


@Configuration
@ComponentScan(basePackages = "question2")
@PropertySource("name.properties")
public class AppConfig {

	@Bean
	public List<Student> getList()
	{
		List<Student> stu = new ArrayList<>();
		
		stu.add(new Student(1,"Dinesh","Delhi","dinesh@123",88));
		stu.add(new Student(2,"Ankit","Mumbai","ankit@123",89));
		stu.add(new Student(3,"Mahesh","New York","mahesh@123",90));
		stu.add(new Student(4,"Surya","Sri Lanka","surya@123",95));
		stu.add(new Student(5,"Monu","Gujrat","monu@123",100));
		
		return stu;
	}
	
	@Bean
	public Map<Student, Course> getMap(){
		
		Map<Student, Course> m1=new HashMap<>();
		
		m1.put(new Student(3,"Mahesh","New York","mahesh@123",90), new Course(201,"Java","5 Months",9000));
		m1.put(new Student(2,"Ankit","Mumbai","ankit@123",89), new Course(202,"Spring","5 Months",5000));
		m1.put(new Student(3,"Mahesh","Rameshwar","mahesh@123",90), new Course(203,"Hibernate","5 Months",3000));
		
		return m1;
	}
}
