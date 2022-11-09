package question1;

public class AddDepartment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EmployeeDao empd = new EmployeeDao();
		
		Department dept = new Department();
		
		dept.setLocation("Banglore");
		dept.setDeptName("HR");
		
		empd.addDepartment(dept);
	}

}
