package question3;

import java.util.Arrays;
import java.util.List;

public class Demo {

	public static void doTransaction(List<? extends Payment> list) {
		for(Payment p : list) {
			p.doPayment();
		}
	}
	
	public static void main(String[] args) {
		List<CashPayment> list1 = Arrays.asList(new CashPayment(5000),new CashPayment(7600));
		List<CardPayment> list2 = Arrays.asList(new CardPayment(9000),new CardPayment(8000));
		doTransaction(list1); // for CashPayment
		doTransaction(list2); // for CardPayment
		
		
	}

}
