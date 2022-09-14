package evaluation;

public class Student {

	private int rollNumber;
	private String studentName;
	private int marks;
	
	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int rollNumber, String studentName, int marks2) {
		super();
		this.rollNumber = rollNumber;
		this.studentName = studentName;
		this.marks = marks2;
	}
	
	
	
	
	
	
}
