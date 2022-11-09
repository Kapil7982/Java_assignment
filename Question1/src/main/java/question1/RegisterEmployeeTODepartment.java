package question1;

public class RegisterEmployeeTODepartment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

         EmployeeDao ed=new EmployeeDao();
		
		try {
			
			ed.registerEmployeeTODepartment(3, 1);
			
		} catch (EmployeeException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (DepartmentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
