package question3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list =  Arrays.asList(2,3,4,5,6,7,8,9,10);
		
		List<Integer> square = list.stream()
				                   .map(i-> i*i)
				                   .collect(Collectors.toList());
		System.out.println(square);
	}

}
