package question3;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class TrainingDao {

	
	public void addCourse(Course course) {
		
		
		 EntityManager em= Persistence.createEntityManagerFactory("evaluationUnit").createEntityManager();
		 em.getTransaction().begin();
		 
		 em.persist(course);
		 
		 em.getTransaction().commit();
		 em.close();
		 
		 System.out.println("done");
		
		
	}
	public void registerTeacher(Teacher teacher) {
		 EntityManager em= Persistence.createEntityManagerFactory("c2unit").createEntityManager();
		 em.getTransaction().begin();
		 em.persist(teacher);
		 em.getTransaction().commit();
		 em.close();
		 System.out.println("done");
		
	}
	
	
	public void assignTeacherWithCourse(int teacherId, int courseId) throws TeacherException, CourseException{
		
        EntityManager em= Persistence.createEntityManagerFactory("c2unit").createEntityManager();
		 
		 Teacher e=em.find(Teacher.class,teacherId);
		 
		 Course d=em.find(Course.class,courseId);
		 
		 if(e!=null && d!=null) {
		 e.getCourse().add(d);
		 d.setT1(e);
		 
		 em.getTransaction().begin();
		 em.persist(e);
		 em.getTransaction().commit();
		 em.close();
		 System.out.println("done");
		 }
		 else if(e==null) {
			 throw new TeacherException("teacher not found");
		 }
		 else if(d==null) {
			 throw new CourseException("course not found");
		 }
		
		
	}
	
	
	public List<Student> getAlltheStudentsByCourseName(String courseName)throws CourseException{
		
		List<Student> list=null;
		
		 EntityManager em= Persistence.createEntityManagerFactory("c2unit").createEntityManager();
		 
		 Query q= em.createQuery("select course from Course where courseName=?1");
		 q.setParameter(1, courseName);
		 
		list=q.getResultList();
		 
		 if(list.size()==0) {
			 throw new CourseException("Course not in this department");
		 }
		 
		 return list;
	}

}
