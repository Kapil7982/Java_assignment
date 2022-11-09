package first;

public class Bonus {

	public static void main(String[] args) {
		
		EmpDao empd = new EmpImpl();
		System.out.println(empd.giveBonusToEmployee(1, 800));
	}
}
