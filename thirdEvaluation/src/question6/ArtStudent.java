package question6;

public class ArtStudent implements Student{

	private int hindiMarks;
	private int englishMarks;
	private int historyMarks;
	public int getHindiMarks() 
	{
		return hindiMarks;
	}
	public void setHindiMarks(int hindiMarks)
	{
		this.hindiMarks = hindiMarks;
	}
	
	public int getEnglishMarks()
	{
		return englishMarks;
	}
	
	public void setEnglishMarks(int englishMarks) 
	{
		this.englishMarks = englishMarks;
	}
	
	public int getHistoryMarks() 
	{
		return historyMarks;
	}
	
	public void setHistoryMarks(int historyMarks) 
	{
		this.historyMarks = historyMarks;
	}
	
	public double findPercentage()
	{
		int sum = (getHindiMarks()+getEnglishMarks()+getHistoryMarks())*100;
		double percentage = sum/300;
		return percentage;
	}
}
