package assignnment6;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Student s1= new Student(60, "Mohit", 51, 29);
		
		Student s2= new Student();
		s2.setRoll(57);
		s2.setName("Lohit");
		s2.setMarks(30);
		s2.setAge(19);
		
		
		System.out.println("------------------------------Validation info depends on input is showing above------------------------------");
		
		System.out.println("Roll is :"+s1.getRoll());
		System.out.println("Name is :"+s1.getName());
		System.out.println("Marks is :"+s1.getMarks());
		System.out.println("Age is :-"+ s1.getAge());
		
		System.out.println("------------------------------Second Output-------------------------------");
		
		System.out.println("Roll is :"+s2.getRoll());
		System.out.println("Name is :"+s2.getName());
		System.out.println("Marks is :"+s2.getMarks());
		System.out.println("Age is :-"+ s2.getAge());
	}

}
