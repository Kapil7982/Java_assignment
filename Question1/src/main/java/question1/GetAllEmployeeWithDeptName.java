package question1;

import java.util.List;

public class GetAllEmployeeWithDeptName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

         EmployeeDao ed=new EmployeeDao();
		
		List<Employeee> em = null;
		
		try {
			
			em = ed.getAllEmployeeWithDeptName("HR");
			
		} catch (EmployeeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(Employeee e:em) 
		{
			System.out.println(e.getEmpId());
			System.out.println(e.getEmpName());
			System.out.println(e.getAddress());
			System.out.println(e.getSalary());
			System.out.println(e.getDept());
		}
	}

}
