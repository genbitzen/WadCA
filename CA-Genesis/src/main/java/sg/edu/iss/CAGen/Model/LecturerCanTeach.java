package sg.edu.iss.CAGen.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class LecturerCanTeach {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int lecturerCanTeach_Id;
	private String can_Teach;
	@ManyToOne
	@JoinColumn(name = "course_Id", referencedColumnName = "course_Id")
	private Course course;
	@ManyToOne
	@JoinColumn(name = "lecturer_Id", referencedColumnName = "lecturer_Id")
	private Lecturer lecturer;
	public LecturerCanTeach() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LecturerCanTeach(String can_Teach, Lecturer lecturer, Course course) {
		super();
		this.can_Teach = can_Teach;
		this.lecturer = lecturer;
		this.course = course;
	}
	public int getLecturerCanTeach_Id() {
		return lecturerCanTeach_Id;
	}
	public void setLecturerCanTeach_Id(int lecturerCanTeach_Id) {
		this.lecturerCanTeach_Id = lecturerCanTeach_Id;
	}
	public String getCan_Teach() {
		return can_Teach;
	}
	public void setCan_Teach(String can_Teach) {
		this.can_Teach = can_Teach;
	}
	public Lecturer getLecturer() {
		return lecturer;
	}
	public void setLecturer(Lecturer lecturer) {
		this.lecturer = lecturer;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	@Override
	public String toString() {
		return "getCan_Teach()";
	}
	
	
	
}
