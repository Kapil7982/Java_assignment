package question5;

public class Collage {

	Person p;
	
//	public Person getP() {
//		return p;
//	}



	public void setP(Person p) {
		this.p = p;
	}



	public void doJob()
	{
		
		p.inService();
		System.out.println("Job is started");
		
	}

	
}
