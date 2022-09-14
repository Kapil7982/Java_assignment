package question3;

public class CodingEvaluation extends Evaluation {

	public CodingEvaluation(int numberOfQuestion)
	{
		super(numberOfQuestion);
	}
	
	@Override
	void evaluationTiming()
	{
		System.out.println("Evaluation timing is 2:00 to 3:30");
	}
}
