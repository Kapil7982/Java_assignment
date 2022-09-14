package question4;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//PrintList pl= city -> System.out.println(city);
		
		PrintList pl= city ->{
			for(String s:city) 
			{
				System.out.println(s);
			}
		};
		
		
		List<String> city = Arrays.asList("Delhi","Pune","Jaipur","Mumbai","Bengaluru");
		pl.display(city);
	}

}
