package question3;

import java.util.List;

public class GetDetails {
	
public static void main(String[] args) {
	
	 TrainingDao t=new TrainingDao();
	try {
		List<Student> li= t.getAlltheStudentsByCourseName("java");
		 System.out.println(li);
	} catch (CourseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
 
}

		 

}