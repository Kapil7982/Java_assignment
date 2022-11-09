package question1;

public class AddEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EmployeeDao empd = new EmployeeDao();
		
		Employeee emp = new Employeee();
		
		emp.setAddress(new Address("Jaipur", "Rajasthan","78906"));
		emp.setSalary(20000);
		emp.setEmpName("Joy");
		
		empd.addEmployee(emp);
	}

}
