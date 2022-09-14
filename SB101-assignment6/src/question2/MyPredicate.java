package question2;

import java.util.function.Predicate;

public class MyPredicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Predicate<Integer> pf = i -> (i < 18); 
	
        System.out.println(pf.test(10)); 
		
	}

}



  //Predicate<T> is a generic functional interface that represents a single argument function that returns a boolean value (true or false). This 
 //interface available in java. util. function package and contains a test(T t) method that evaluates the predicate of a given argument.