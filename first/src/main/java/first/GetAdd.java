package first;

public class GetAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EmpDao  empd = new EmpImpl();
		 
		System.out.println(empd.getAddressOfEmployee(1));
	}

}
