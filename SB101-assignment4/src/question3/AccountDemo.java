package question3;

public class AccountDemo {

	public static void main(String[] args)  {
		
        Account a1=new Account("79889981");
        try {
            a1.Balance = 500;
            a1.Deposit(50000);
            a1.withdraw(90000);
        }
        catch (InsufficientFundsException ii)
        {
            System.out.println(ii.getMessage());
        }

    }
}
