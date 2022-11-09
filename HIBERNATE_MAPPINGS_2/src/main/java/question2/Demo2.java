package question2;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManager em = Persistence.createEntityManagerFactory("employeeUnit").createEntityManager();
		
		Course cou = em.find(Course.class, 2);
		
		List<Student> list = cou.getStudent();
		
		for(Student s : list)
		{
			System.out.println("Name of Student :- " +s.getName());
			System.out.println("Email of Student :- " +s.getEmail());
			System.out.println("Mobile no of Student :- " +s.getMobile());
			
	        System.out.println("====================================");
		}
	}

}
