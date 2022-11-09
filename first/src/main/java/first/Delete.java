package first;

public class Delete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EmpDao empd = new EmpImpl();
		
		System.out.println(empd.deleteEmployee(1));
	}

}
