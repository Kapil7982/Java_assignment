package question3;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Travel {
	
	@Autowired
	@Qualifier("vv")
	private Vehicle v;

	
	void journey() {
		
		v.go();
		
		System.out.println("Journey is going on...");
	}
	
	@PostConstruct
	void construct() {
		
		System.out.println("Journey start..");
	}
	
	@PreDestroy
	void destroy() {
		
		System.out.println("Journey ends..");
	}
}
