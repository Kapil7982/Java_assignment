package question2;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  List <String> city =  Arrays.asList("Delhi","Chandigarh", "Haryana", "Bihar", "Indore", "Goa");
		 
		 Collections.sort(city,(s,s1) -> s.compareTo (s1) < 1 ? 1 : -1);
		 
		 city.forEach(System.out::println);

	}

}
