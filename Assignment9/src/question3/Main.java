package question3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		Employee e = new Employee();
		e.Name = "Mohit";
		e.Age = 25;
		e.Phone_number = "8945346546";
		e.Address = "Bandra Street Colony Number-31";
		e.Salary = 120000.00;
		e.Specialisation = "Backend Developer";
		
		Manager m = new Manager();
		m.Name = "Rolex";
		m.Age = 33;
		m.Phone_number = "7945346546";
		m.Address = "Avenue Street Colony Number-51";
		m.Salary = 200000.00;
		m.Department = "HR Department";
		
		
		
		
		System.out.println("Employee Name :- " + e.Name);
		System.out.println("Employee Age :- " + e.Age);
		System.out.println("Employee Contact no. :- " + e.Phone_number);
		System.out.println("Employee Address :- " + e.Address);
		System.out.println("Employee Salary :- " + e.Salary);
		System.out.println("Employee Specialisation :- " + e.Specialisation);
		
		
		System.out.println("===============================================================================");
		System.out.println("===============================================================================");
		
		System.out.println("Manager Name :- " + m.Name);
		System.out.println("Manager Age :- " + m.Age);
		System.out.println("Manager Contact no. :- " + m.Phone_number);
		System.out.println("Manager Address :- " + m.Address);
		System.out.println("Manager Salary :- " + m.Salary);
		System.out.println("Manager Department :- " + m.Department);
	}

}
