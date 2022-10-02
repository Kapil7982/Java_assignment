package question5;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Demo2 {

public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("studentdata.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Object obj;
		try {
			obj = ois.readObject();
			Student s = (Student)obj;
			System.out.println(s);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
		
		
		ois.close();
		
	}
}
