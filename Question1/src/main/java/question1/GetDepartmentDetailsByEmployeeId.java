package question1;

public class GetDepartmentDetailsByEmployeeId {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        EmployeeDao em=new EmployeeDao();
		
		try {
			
			System.out.println(em.getDepartmentDetailsByEmployeeId(3));
			
		} catch (DepartmentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
