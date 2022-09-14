package question3;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Student s1 = Student.getStudent(false);
		System.out.println(s1.getRoll());
		System.out.println(s1.getName());
		System.out.println(s1.getAddress());
		System.out.println(s1.getCollageName());
		
		System.out.println("---------------------------Second Student--------------------------------");
		
		Student s2 = Student.getStudent(true);
		System.out.println(s2.getRoll());
		System.out.println(s2.getName());
		System.out.println(s2.getAddress());
		System.out.println(s2.getCollageName());
		
		
	}

}
