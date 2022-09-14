package question6;

public class CommerceStudent implements Student {

	private int accountMarks;
	private int economicsMarks;
	private int businessStudiesMarks;
	
	
	public int getAccountMarks() {
		return accountMarks;
	}
	public void setAccountMarks(int accountMarks) {
		this.accountMarks = accountMarks;
	}
	public int getEconomicsMarks() {
		return economicsMarks;
	}
	public void setEconomicsMarks(int economicsMarks) {
		this.economicsMarks = economicsMarks;
	}
	public int getBusinessStudiesMarks() {
		return businessStudiesMarks;
	}
	public void setBusinessStudiesMarks(int businessStudiesMarks) {
		this.businessStudiesMarks = businessStudiesMarks;
	}
	
	public double findPercentage()
	{
		int sum = (getAccountMarks()+getEconomicsMarks()+getBusinessStudiesMarks())*100;
		double percentage = sum/300;
		return percentage;
	}
}
