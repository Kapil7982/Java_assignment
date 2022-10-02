package question5;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Demo1 {

	public static void main(String[] args) throws Exception {
		
		List<Student> list = new ArrayList<Student>();
		
		
		list.add(new Student(1, "Ravi", 450, "ravi@gmail.com","raviTeja"));
		list.add(new Student(1, "Ravi", 450, "ravi@gmail.com","raviTeja"));
		list.add(new Student(1, "Ravi", 450, "ravi@gmail.com","raviTeja"));
		list.add(new Student(1, "Ravi", 450, "ravi@gmail.com","raviTeja"));
		list.add(new Student(1, "Ravi", 450, "ravi@gmail.com","raviTeja"));
		
	
		
		ObjectOutputStream op=new ObjectOutputStream(new FileOutputStream("studentdata.txt"));
        op.writeObject(list);
        op.flush();
        op.close();

//        ObjectInputStream ip=new ObjectInputStream(new FileInputStream("studentdata.txt"));
//       Object o= ip.readObject();
//       Student s= (Student) o;
//       ip.close();
//        System.out.println("Roll number is "+s.getRoll());
//        System.out.println("Name is "+s.getName());
//        System.out.println("Email is "+s.getEmail());
//        System.out.println("Password is "+s.getPassword());
//		
	}
}
