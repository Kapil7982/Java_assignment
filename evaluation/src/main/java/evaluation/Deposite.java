package evaluation;

public class Deposite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 AccountDao ac = new AccountImpl();
		 
		 System.out.println(ac.deposit(8000, 3));
	}

}
