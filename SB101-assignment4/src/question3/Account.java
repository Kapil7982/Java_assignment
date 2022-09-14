package question3;

public class Account {

	String accountNumber;
    double Balance;
    
    public  Account(String accountNumber)
    {
        this.accountNumber=accountNumber;
    }

    public void Deposit(int amount) 
    {
         Balance=Balance+amount;
        System.out.println(amount +" Deposited successfully");
    }
    public  double withdraw(int amount) throws InsufficientFundsException 
    {
        Balance= Balance-amount;
        if(Balance<0)
        {
           InsufficientFundsException ic= new InsufficientFundsException("Balance amount is more than your account balance.");
            throw ic;
        }
        else
        {
            System.out.println(Balance+" remained balance");
            return Balance;
        }
    }
}
