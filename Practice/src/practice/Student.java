package practice;

public class Student {
	
	int roll;
	String name;
	int marks;
	
	void displayStudentDetails() {
		
		System.out.println("Roll is:-"+roll);
		System.out.println("Name is:-"+name);
		System.out.println("Marks is:-"+marks);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Student s1 = new Student();
		
		s1.roll = 1;
		s1.name= "Rohit";
		s1.marks = 70;
		s1.displayStudentDetails();
		

		
		Student s2 = new Student();
		s2.roll = 2;
		s2.name= "Mohit";
		s2.marks = 80;
		s2.displayStudentDetails();
		
		
		s1 = null;
		s2 = null;
		System.out.println(s1);
		System.out.println(s2);
	}

}
