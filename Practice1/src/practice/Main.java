package practice;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, Student> hm = new HashMap<>();
		
		hm.put("Mumbai", new Student(10 , "Ram", 850));
		hm.put("Delhi", new Student(12, "Rishab", 750));
		hm.put("Chennai", new Student(14, "Deepak", 650));
		
		 Set<Map.Entry<String, Student>> set = hm.entrySet();
		 
		 for(Map.Entry<String, Student> st : set)
		 {
			 System.out.println("City name is :-"+st.getKey());
			 System.out.println("================================");
			 
			Student s =  st.getValue();
			
			System.out.println("Roll :- "+s.getRoll());
			System.out.println("Name :- "+s.getName());
			System.out.println("Marks :- "+s.getMarks());
			 System.out.println("================================");
				
			
			
		 }
		
//		hm.put(3, "Three");
//		hm.put(4, "Four");
//		hm.put(null, "Five");
//		hm.put(null, "Six");	
//		
//		Set<Integer> set =  hm.keySet();
//		
//		Collection<String> col =  hm.values();
//		
//		for(String s : col)
//		{
//			System.out.println(s);
//		}
//		
//		Set<Map.Entry<Integer, String>> set = hm.entrySet();
//		
//		for(Map.Entry<Integer, String> me : set)
//		{
//			System.out.println(me.getKey()+"========"+me.getValue());
//		}
//		//System.out.println(col);
//		
//		
//		System.out.println(hm);
//		System.out.println(set);
//		System.out.println(hm.size());
		
	}


}
