package sg.edu.iss.CAGen.Model;

import java.util.Collection;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

@Entity
public class Course {

	@Id
	@GeneratedValue(generator = "UUID")
	@GenericGenerator(
			name = "UUID",
			strategy = "org.hibernate.id.UUIDGenerator")
	@Type(type = "uuid-char")
	private UUID course_Id;
	private int class_size;
	private String course_name;
	private int credits;
	private String description;
	private String duration;
	@OneToMany(mappedBy="course")
	private Collection<LecturerCanTeach> lecturerCanTeaches;
	@OneToMany(mappedBy="course")
	private Collection<Enrolment> enrolments;
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Course(int class_size, String course_name, int credits, String description, String duration,
			Collection<LecturerCanTeach> lecturerCanTeaches, Collection<Enrolment> enrolments) {
		super();
		this.class_size = class_size;
		this.course_name = course_name;
		this.credits = credits;
		this.description = description;
		this.duration = duration;
		this.lecturerCanTeaches = lecturerCanTeaches;
		this.enrolments = enrolments;
	}
	
	public Course(int class_size, String course_name, int credits, String description, String duration) {
		super();
		this.class_size = class_size;
		this.course_name = course_name;
		this.credits = credits;
		this.description = description;
		this.duration = duration;
	}
	public UUID getCourse_Id() {
		return course_Id;
	}
	public void setCourse_Id(UUID course_Id) {
		this.course_Id = course_Id;
	}
	public int getClass_size() {
		return class_size;
	}
	public void setClass_size(int class_size) {
		this.class_size = class_size;
	}
	public String getCourse_name() {
		return course_name;
	}
	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}
	public int getCredits() {
		return credits;
	}
	public void setCredits(int credits) {
		this.credits = credits;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public Collection<LecturerCanTeach> getLecturerCanTeaches() {
		return lecturerCanTeaches;
	}
	public void setLecturerCanTeaches(Collection<LecturerCanTeach> lecturerCanTeaches) {
		this.lecturerCanTeaches = lecturerCanTeaches;
	}
	public Collection<Enrolment> getEnrolments() {
		return enrolments;
	}
	public void setEnrolments(Collection<Enrolment> enrolments) {
		this.enrolments = enrolments;
	}
	@Override
	public String toString() {
		return "Course [course_Id=" + course_Id + ", class_size=" + class_size + ", course_name=" + course_name
				+ ", credits=" + credits + ", description=" + description + ", duration=" + duration
				+ ", lecturerCanTeaches=" + lecturerCanTeaches + ", enrolments=" + enrolments + "]";
	}
	
}
