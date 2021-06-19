package sg.edu.iss.Model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Lecturer_In_Course {

	@Id
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern="dd/MMMM/YYYY")
	Date course_Start_Date;

	public Date getCourse_Start_Date() {
		return course_Start_Date;
	}

	public void setCourse_Start_Date(Date course_Start_Date) {
		this.course_Start_Date = course_Start_Date;
	}
	
	
}
