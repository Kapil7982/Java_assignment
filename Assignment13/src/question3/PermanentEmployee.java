package question3;

public class PermanentEmployee extends Employee {

	private double basicPay;
	
	public double getBasicPay() 
	{
		return basicPay;
	}

	public void setBasicPay(double basicPay) 
	{
		this.basicPay = basicPay;
	}

	public PermanentEmployee(int employeeId, String employeeName, double basicpay) 
	{
		super(employeeId, employeeName);
		this.basicPay = basicpay;
		this.calculateSalary();
	}

	@Override
	public void calculateSalary() 
	{
		double PF_amount=0;
		PF_amount = (basicPay*0.12);
		setSalary(basicPay-PF_amount);
		
	}

}
