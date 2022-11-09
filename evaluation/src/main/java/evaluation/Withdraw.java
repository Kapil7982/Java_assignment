package evaluation;

public class Withdraw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AccountDao ac = new AccountImpl();
		
		System.out.println(ac.withdraw(30000, 1));
	}

}
