package question4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {

	private Drawshapes d;

	public Drawshapes getD() {
		return d;
	}

	public void setD(Drawshapes d) {
		this.d = d;
	}
	
	public static void main(String[] args) {
		
		 ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
			
		   Runner r= ac.getBean(Runner.class,"dm");
			
		   r.getD().shapes();
		    
		}
}
