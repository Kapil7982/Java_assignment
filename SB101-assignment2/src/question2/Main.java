package question2;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		
		 Student s1=new Student(1,"Abbas",600);
	        Student s2=new Student(2,"jay",450);
	        Student s3=new Student(5,"Meet",240);

	        Map<Student,String> dd=new TreeMap<>(new SortByMarks());

	        dd.put(s1,"Kerala");
	        dd.put(s2,"Gujarat");
	        dd.put(s3,"Delhi");

	             Set<Map.Entry<Student,String>> de=dd.entrySet();

	             for(Map.Entry<Student,String> dr:de)
	             {
	                 System.out.println(dr.getValue() +" :- "+ dr.getKey());
	               
	             }
	}
}
