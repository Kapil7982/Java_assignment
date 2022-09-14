package question1;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;


public class Demo {

    public  Map<Employee,String> sortMapUsingEmployeeSalary(Map<Employee,String> originalMap)
    {

        List<Map.Entry<Employee,String>> linkList = new LinkedList<>(originalMap.entrySet());

        Collections.sort(linkList, (a, b) -> {
            return a.getKey().getSalary() > b.getKey().getSalary() ? -1 : 1;
        });

        Map<Employee, String> sortedMap = new LinkedHashMap<>();

        linkList.forEach(x -> sortedMap.put(x.getKey(), x.getValue()));

        return sortedMap;
    }

    public static void main(String[] args) {

        Map<Employee,String> hm = new HashMap<>();

        hm.put(new Employee("5", "Mohit", 60000.00),"HR");
        hm.put(new Employee("4", "Lohit", 9000.00),"Sales");
        hm.put(new Employee("3", "Kapil", 16000.00),"Marketing");
        hm.put(new Employee("2", "Rohit", 6000.00),"Sales");
        hm.put(new Employee("1", "Rana", 23000.00),"Accounts");

        Demo main = new Demo();

        Map<Employee, String> sorted = main.sortMapUsingEmployeeSalary(hm);


        for(Entry<Employee, String> emp : sorted.entrySet()) {
            System.out.println(emp.getKey());
            System.out.println(emp.getValue().toString());
        }
    }
}
