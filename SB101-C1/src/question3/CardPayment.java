package question3;

public class CardPayment implements Payment{

	private int amount;

	public CardPayment(int amount) {
		super();
		this.amount = amount;
	}
	
	public void doPayment() {
		// TODO Auto-generated method stub
        System.out.println("Payment done using Card "+amount);
	}
}
