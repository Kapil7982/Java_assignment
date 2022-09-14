package question3;

public class Main {

	void messageToStudents(Evaluation evaluation)
	{
		if(evaluation instanceof DsaEvaluation)
		{
			System.out.println("Its a DSA Evaluation");
			evaluation.printNoOfQuestions();
			evaluation.evaluationTiming();
			
			System.out.println("===========================================");
		}
		else
		{
			System.out.println("Its a Coding Evaluation");
			evaluation.printNoOfQuestions();
			evaluation.evaluationTiming();
			
			System.out.println("===========================================");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Main main = new Main();
		main.messageToStudents(new DsaEvaluation(5));
		main.messageToStudents(new CodingEvaluation(4));
	}

}
