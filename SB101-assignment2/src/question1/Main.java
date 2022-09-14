package question1;


import java.util.Arrays;

import java.util.List;


public class Main {
	
public static void fun1(List<? extends Number> list) 
{
		
		for(Number n1:list) 
		{
		
			System.out.print(n1+" ");
		}
		
		
	}
	
	public static void main(String[] args) {
		
		List<Integer> ilist= Arrays.asList(10,20,30,40);
		
		fun1(ilist);
	}

}
