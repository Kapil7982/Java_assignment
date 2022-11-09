package evaluation;

public class FindById {

	public static void main(String[] args) {
		
		AccountDao ac = new AccountImpl();
		
		System.out.println(ac.findById(3));
	}
}
