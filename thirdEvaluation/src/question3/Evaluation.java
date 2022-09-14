package question3;

public abstract class Evaluation {

	private final int numberOfQuestions;
	abstract void evaluationTiming();
	
	void printNoOfQuestions() 
	{
		System.out.println("No. of Questions in Evaluation is :" +numberOfQuestions);
	}
	
	public Evaluation(int numberOfQuestion)
	{
		super();
		this.numberOfQuestions = numberOfQuestion;
	}
}
