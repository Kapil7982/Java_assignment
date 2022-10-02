package question1;


import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		ObjectOutputStream op=new ObjectOutputStream(new FileOutputStream("abc.txt"));

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String name = br.readLine();
		
		//String address = br.readLine();
		
		System.out.println("Employee name :-" + name);
		//System.out.println("Address :-" + address);
	}

}
