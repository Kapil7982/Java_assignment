package evaluation;

public class Delete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 AccountDao ac = new AccountImpl();
		 
		 System.out.println(ac.deleteAccountById(3));
	}

}
