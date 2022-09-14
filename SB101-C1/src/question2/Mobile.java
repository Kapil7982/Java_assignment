package question2;

import java.util.ArrayList;
import java.util.HashMap;



public class Mobile {
	
    HashMap<String, ArrayList<String>> mobiles = new HashMap<>();

    public String addMobile(String company, String model) 
    {
        String message = "Mobile Not added";

        if (mobiles.containsKey(company)) 
        {
            mobiles.get(company).add(model);
            message = "Mobile added successfully";
        } 
        else 
        {
            ArrayList<String> type = new ArrayList<String>();
            
            type.add(model);
            
            mobiles.put(company, type);
            
            message = "Mobile added successfully";
        }
        return message;
    }

    public ArrayList<String> getModels(String company)
    {
        ArrayList<String> list = new ArrayList<>();

        if (mobiles.containsKey(company))
        {
            mobiles.get(company).forEach(x -> list.add(x));
        } 
        else 
        {
            return null;
        }

        return list;
    }

    public static void main(String[] args) {

        Mobile mob = new Mobile();
        System.out.println(mob.addMobile("apple", "Iphone13"));
        System.out.println(mob.addMobile("samsung", "ACE"));
        System.out.println(mob.addMobile("apple", "Iphone12"));
        System.out.println(mob.addMobile("apple", "Iphone11"));


        ArrayList<String> listModels = mob.getModels("apple");
        
        System.out.println("===================================");
        
        if (listModels == null)
        	
            System.out.println("No such company exist");
        
        else
            listModels.forEach(x -> System.out.print(x + " "));
    }
}
