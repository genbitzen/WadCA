package sg.edu.iss.Model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Lecturer_In_Course {

	@Id
	@DateTimeFormat(pattern="dd/MMMM/YYYY")
	LocalDate course_Start_Date;

	public LocalDate getCourse_Start_Date() {
		return course_Start_Date;
	}

	public void setCourse_Start_Date(LocalDate course_Start_Date) {
		this.course_Start_Date = course_Start_Date;
	}
	
	
}
