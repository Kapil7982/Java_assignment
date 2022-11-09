package question2;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class Demo3 {

	public static void main(String[] args) {
		
         EntityManager em= Persistence.createEntityManagerFactory("employeeUnit").createEntityManager();
		
		Student s= em.find(Student.class, 1);
		 
		 List<Course> list=s.getCourse();
		 
		 for(Course c: list ) 
		 {
			 System.out.println("CourseId of Student :- " +c.getCourseId());
			 System.out.println("Course alloted to Student :- " +c.getCourseName());
			 System.out.println("Cousrse duration  :- " +c.getDuration());
			 System.out.println("Course fee :- " +c.getFee());
				
		        System.out.println("====================================");
		 }
	}
}
