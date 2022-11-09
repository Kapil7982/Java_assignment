package question1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hibernate.cfg.Environment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "question1")
@PropertySource(value = "a.properties")
public class Config {

	@Value("#{'${cities}'.split(',')}")
	public List<String> city;
	
	@Autowired
	public Environment ev;
	
	@Bean
	public List<String> cities(){
		
		List<String> cities = new ArrayList<>();
		
		cities.addAll(city);
		
		return cities;
		
	}
	
	@Bean
	public List<Student> students(){
		
		List<Student> students = new ArrayList<>();
		
		students.add(new Student("Ravi",1,800));
		students.add(new Student("Mohit",2, 1000));
		students.add(new Student("Rohit",3,600));
		students.add(new Student("Kavita",4,700));
		students.add(new Student("Alex",5,400));	
		
		return  students;
	}
	
	@Bean
	public Map<Student, String> theMap(){
		
		Map<Student, String> theMap = new HashMap<>();
		
		for(int i=0; i<5; i++)
		{
			theMap.put(students().get(i), cities().get(i));
		}
		
		
		return theMap;
	}
	
	
}
