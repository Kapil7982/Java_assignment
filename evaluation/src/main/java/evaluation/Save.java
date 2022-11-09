package evaluation;

public class Save {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AccountDao ac = new AccountImpl();
		
		Account act = new Account(3, "user@gamil.com","Bendra_street",500000);
		System.out.println(ac.save(act));
	}

}
