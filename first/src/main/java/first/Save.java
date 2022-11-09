package first;

public class Save {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EmpDao empd = new EmpImpl();
		
		Employee emp = new Employee(1, "Raju", "Bendra_Street", 20000);
		empd.save(emp);
	}

}
