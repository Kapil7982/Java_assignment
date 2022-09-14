package question3;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Main {
	
	public Map<String, Student> sortMapUsingStudentName(Map<String, Student>originalMap)
	{
		Comparator<Map.Entry<String, Student>> sorting = (s,s1) -> s.getValue().getName().compareToIgnoreCase(s1.getValue().getName());
		
		
		
		Set<Map.Entry<String, Student>> set = originalMap.entrySet();
		Set<Map.Entry<String, Student>> sortingSet = new TreeSet<>(sorting);
		sortingSet.addAll(set);
		
		LinkedHashMap<String, Student> sortingMap = new LinkedHashMap<>();
		
		for(Map.Entry<String, Student> stu : sortingSet)
		{
			sortingMap.put(stu.getKey(), stu.getValue());
		}
		
		return sortingMap;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Main d = new Main();
		
		Map<String, Student> map = new HashMap<>();
		
		map.put("INDIA", new Student(1, "Mohit", "mohit@gmail.com", 450));
		map.put("US", new Student(2, "Roshan", "roshan@gmail.com", 760));
		map.put("UK", new Student(3, "Lala", "lala@gmail.com", 230));
		map.put("CHINA", new Student(4, "Rocky", "rocky@gmail.com", 800));
		map.put("JAPAN", new Student(5, "Sanju", "sanju@gmail.com", 500));
		
		Map<String, Student> result = d.sortMapUsingStudentName(map);
		
		for(Map.Entry<String, Student> stu: result.entrySet())
		{
			System.out.println("Student country :- "+ stu.getKey());
			
			Student s = stu.getValue();
			
			System.out.println("Student Roll No :- "+ s.getRoll());
			System.out.println("Student Name :- "+ s.getName());
			System.out.println("Student Email ID :- "+ s.getEmail());
			System.out.println("Student Marks :- "+ s.getMarks());
			
			System.out.println("=========================================");
		}
	}

}
