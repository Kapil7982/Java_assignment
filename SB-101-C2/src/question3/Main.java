package question3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Student> list = Arrays.asList(
				new Student(1, "Rahul", 450, "Bendra Street Mumbai"),
				new Student(2, "Rohit", 580, "Goa Dao Street Mumbai"),
				new Student(3, "Mohan", 470, "Capital Street of New York"),
				new Student(4, "Lala", 640, "Game of Right Mumbai"),
				new Student(5, "Sachin", 530, "Street Venue Address")
				);
				 
		List<Student> filter= list.stream()
	    .filter(s -> s.getMarks() > 500)
	    .collect(Collectors.toList());

        filter.stream().map( (id) ->new Employee(id.getRoll(), id.getName(),id.getMarks()*10000, id.getAddress()) ).
                forEach(item -> System.out.println(item));
		
		
		    
	}

}
