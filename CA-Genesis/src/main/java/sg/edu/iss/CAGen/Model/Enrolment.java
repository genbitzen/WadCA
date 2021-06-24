package sg.edu.iss.CAGen.Model;

import java.time.LocalDate;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Enrolment {

	@Id
	@GeneratedValue(generator = "UUID")
	@GenericGenerator(
			name = "UUID",
			strategy = "org.hibernate.id.UUIDGenerator")
	private UUID enrolment_Id;
	@DateTimeFormat(pattern="dd/MM/YY")
	private LocalDate enrolment_Date;
	private String grade;
	private String status;
	@ManyToOne
	@JoinColumn(name="course_Id", nullable= false)
	private Course course;
	@ManyToOne
	@JoinColumn(name="student_Id", nullable= false)
	private Student student;
	public Enrolment() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Enrolment(LocalDate enrolment_Date, String grade, String status, Course course, Student student) {
		super();
		this.enrolment_Date = enrolment_Date;
		this.grade = grade;
		this.status = status;
		this.course = course;
		this.student = student;
	}
	public UUID getEnrolment_Id() {
		return enrolment_Id;
	}
	public void setEnrolment_Id(UUID enrolment_Id) {
		this.enrolment_Id = enrolment_Id;
	}
	public LocalDate getEnrolment_Date() {
		return enrolment_Date;
	}
	public void setEnrolment_Date(LocalDate enrolment_Date) {
		this.enrolment_Date = enrolment_Date;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	@Override
	public String toString() {
		return "Enrolment [enrolment_Id=" + enrolment_Id + ", enrolment_Date=" + enrolment_Date + ", grade=" + grade
				+ ", status=" + status + ", course=" + course + ", student=" + student + "]";
	}
	
}
