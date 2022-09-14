package assignnment6;

public class Student {

	private int roll;
	private String name;
	private int age;
	private int marks;
	
	public Student() {
			
		}
	public Student(int roll, String name, int marks, int age) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
		this.age = age;
	}
	
	
	
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getMarks() {
		return marks;
	}
	
	public int getAge() {
		return age;
	}
	

	public void setMarks(int marks) {
		if(marks>0 && marks<500)
		this.marks = marks;
		else 
			System.out.println("Wrong marks");
	}

	public void setAge(int age) {
		if(age>18 && age<60)
		this.age = age;
		else
			System.out.println("Invalid age");
	}
}
