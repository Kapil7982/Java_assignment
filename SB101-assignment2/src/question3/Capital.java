package question3;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Capital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedHashMap<String, String> lhm= new LinkedHashMap<String, String>();
		
		    lhm.put("Gujarat","Gandhinagar");
		    lhm.put("Maharashtra","Mumbai");
		    lhm.put("Bengal","Kolkata");
		    lhm.put("Rajasthan","Jaipur");
		    lhm.put("Goa","Panji");

	      Set<Map.Entry<String,String>> li=lhm.entrySet();

	      for (Map.Entry<String,String> list:li)
	      {
	          System.out.println("State :- "+list.getKey()+ ", Capital:- "+ list.getValue());
	      }
	    }
	}


