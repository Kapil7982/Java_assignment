package question4;


import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;


public class IndianState {
	
	static Map<String, List<String>> map = new HashMap<>();
	 
    public static void sortbykey()
    {
        TreeMap<String, List<String>> ts = new TreeMap<>();
 
        ts.putAll(map);
 
        for (Map.Entry<String, List<String>> entry : ts.entrySet())
        {
            System.out.println("States :- " + entry.getKey() +"| Cities:- " + entry.getValue());
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		map.put("Haryana", Arrays.asList("Faridabad"," Sonipat","Panipat ","Ambala"));
		map.put("Goa", Arrays.asList("Vasco-da-Gama"," Ponda","Margao","Mapusa"));
		map.put("Uttar Pradesh", Arrays.asList("Agra "," Kanpur","Allahabad","Varanasi"));
		map.put("Tamil Nadu", Arrays.asList("Tiruchirappalli"," Madurai","Erode","Coimbatore"));
         
		sortbykey();
		
	
	}
}
