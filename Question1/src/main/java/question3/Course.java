package question3;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

	@Entity
	public class Course {
	
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private int courseId;
		public int getCourseId() {
			return courseId;
		}

		public void setCourseId(int courseId) {
			this.courseId = courseId;
		}

		public String getCourseName() {
			return courseName;
		}

		public void setCourseName(String courseName) {
			this.courseName = courseName;
		}

		public String getDuration() {
			return duration;
		}

		public void setDuration(String duration) {
			this.duration = duration;
		}

		public String getFee() {
			return fee;
		}

		public void setFee(String fee) {
			this.fee = fee;
		}

		public List<Student> getCourse() {
			return course;
		}

		public void setCourse(List<Student> course) {
			this.course = course;
		}

		public Teacher getT1() {
			return t1;
		}

		public void setT1(Teacher t1) {
			this.t1 = t1;
		}

		private String courseName;
		private String duration;
		private String fee;
		
		@ManyToMany(cascade = CascadeType.ALL)
		private List<Student> course=new ArrayList<>();
		
		@ManyToOne(cascade = CascadeType.ALL)
		private Teacher t1;

	
	

}
