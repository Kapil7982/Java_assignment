package question3;

public class Addcourse {
public static void main(String[] args) {
	TrainingDao t=new TrainingDao();
	Course c=new Course();
	c.setCourseName("java");
	c.setDuration("5 months");
     c.setFee("50000");
	
	t.addCourse(c);
}
}
