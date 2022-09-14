package question2;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
	
	public static int getNumber() {
		return 1500;
	}

	public static void main(String[] args) {
		
		Predicate<Student> pre = s -> s.getMarks() < 500;
		
		System.out.println(pre.test(new Student(12, "Rohan", 400)));
		
		System.out.println("=================================================");
		
		//Pridicate
		
		Consumer<Student> c = s->{
			 
			System.out.println("Roll no :- " +s.getRoll());
			System.out.println("Name  :- " +s.getName());
			System.out.println("Marks :- " +s.getMarks());
		};
		
		c.accept(new Student(1, "Mohit" , 600));
		
		System.out.println("=================================================");
		
		// Consumer
		
		Supplier<Student> s = () -> new Student(1, "Krutika", 880);
		
	    
	    Supplier<Integer> s1 = Main::getNumber;
	    
	    System.out.println(s1.get());
	    
	    
	    System.out.println("=================================================");
	    
	    //  Supplier
	    
	    Function<String, Integer> f = p->{
	    	
	    	int n = Integer.parseInt(p);
	    	return n;
	    	
	    };
	    
		System.out.println(f.apply("123")+456);
		
		
		//Function
	}

}
