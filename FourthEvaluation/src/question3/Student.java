package question3;

import java.util.TreeSet;

public class Student implements Comparable<Student>{

	private int rollNo;
	private String name;
	private int mathsMarks;
	private int scienceMarks;
	private int engMarks;
	private int total;
	
	public int getRollNo()
	{
		return rollNo;
	}
	
	public void setRollNo(int rollNo) 
	{
		this.rollNo = rollNo;
	}
	
	public String getName() 
	{
		return name;
	}
	
	public void setName(String name) 
	{
		this.name = name;
	}
	
	public int getMathsMarks() 
	{
		return mathsMarks;
	}
	
	public void setMathsMarks(int mathsMarks)
	{
		this.mathsMarks = mathsMarks;
	}
	
	public int getScienceMarks() 
	{
		return scienceMarks;
	}
	
	public void setScienceMarks(int scienceMarks)
	{
		this.scienceMarks = scienceMarks;
	}
	
	public int getEngMarks() 
	{
		return engMarks;
	}
	
	public void setEngMarks(int engMarks) 
	{
		this.engMarks = engMarks;
	}

	public int getTotal() 
	{
		return total;
	}

	public void setTotal(int total) 
	{
		this.total = this.engMarks+this.mathsMarks+this.scienceMarks;
	}

	public Student(int rollNo, String name, int mathsMarks, int scienceMarks, int engMarks) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.mathsMarks = mathsMarks;
		this.scienceMarks = scienceMarks;
		this.engMarks = engMarks;
		
		this.setTotal(total);
	}

	@Override
	public int compareTo(Student s) {
		if(this.getTotal()>s.getTotal())
		{
			return +1;
		}
		else if(this.getTotal()<s.getTotal())
		{
			return -1;
		}
		else
		return s.getName().compareTo(this.getName());
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", mathsMarks=" + mathsMarks + ", scienceMarks="
				+ scienceMarks + ", engMarks=" + engMarks + ", total=" + total + "]";
	}
	
	public static void main(String[] args) {
		
		TreeSet<Student> t = new TreeSet<>();
		
		t.add(new Student (1, "Mohit", 90, 86, 89));
		t.add(new Student (2, "Lohit", 90, 86, 89));
		t.add(new Student (3, "Rohit", 90, 86, 89));
		
		for(Student st:t)
		{
			System.out.println(st);
		}
	}
}
