package question4;


import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;




public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<Student> s = new TreeSet<>();
		
		s.add(new Student(1, "Moner", 520));
		s.add(new Student(2, "Ali", 800));
		s.add(new Student(3, "Shubham", 400));
		s.add(new Student(4, "Paramjeet", 570));
		s.add(new Student(5, "Sumit", 299));
		s.add(new Student(6, "Shubham", 450));
		
		
		List<Student> filter= s.stream()
				.filter(p -> p.getMarks() > 500)
				.collect(Collectors.toList());

         System.out.println(filter);
	}

}
