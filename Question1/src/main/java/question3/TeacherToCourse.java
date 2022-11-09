package question3;

public class TeacherToCourse {
	public static void main(String[] args) {

	      TrainingDao t=new TrainingDao();
			
			
				try {
					t.assignTeacherWithCourse(5, 4);
				} catch (TeacherException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (CourseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		
		}

	}
