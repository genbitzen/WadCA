package sg.edu.iss.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Course {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int course_Id;
	String course_Name;
	String course_Description;
	int course_Size;
	int course_Credits;
	String course_Duration;
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Course(String course_Name, String course_Description, int course_Size, int course_Credits,
			String course_Duration) {
		super();
		this.course_Name = course_Name;
		this.course_Description = course_Description;
		this.course_Size = course_Size;
		this.course_Credits = course_Credits;
		this.course_Duration = course_Duration;
	}

	public Course(int course_Id, String course_Name, String course_Description, int course_Size, int course_Credits,
			String course_Duration) {
		super();
		this.course_Id = course_Id;
		this.course_Name = course_Name;
		this.course_Description = course_Description;
		this.course_Size = course_Size;
		this.course_Credits = course_Credits;
		this.course_Duration = course_Duration;
	}
	public int getCourse_Id() {
		return course_Id;
	}
	public void setCourse_Id(int course_Id) {
		this.course_Id = course_Id;
	}
	public String getCourse_Name() {
		return course_Name;
	}
	public void setCourse_Name(String course_Name) {
		this.course_Name = course_Name;
	}
	public String getCourse_Description() {
		return course_Description;
	}
	public void setCourse_Description(String course_Description) {
		this.course_Description = course_Description;
	}
	public int getCourse_Size() {
		return course_Size;
	}
	public void setCourse_Size(int course_Size) {
		this.course_Size = course_Size;
	}
	public int getCourse_Credits() {
		return course_Credits;
	}
	public void setCourse_Credits(int course_Credits) {
		this.course_Credits = course_Credits;
	}
	public String getCourse_Duration() {
		return course_Duration;
	}
	public void setCourse_Duration(String course_Duration) {
		this.course_Duration = course_Duration;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + course_Id;
		result = prime * result + ((course_Name == null) ? 0 : course_Name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Course other = (Course) obj;
		if (course_Id != other.course_Id)
			return false;
		if (course_Name == null) {
			if (other.course_Name != null)
				return false;
		} else if (!course_Name.equals(other.course_Name))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Course [course_Id=" + course_Id + ", course_Name=" + course_Name + ", course_Description="
				+ course_Description + ", course_Size=" + course_Size + ", course_Credits=" + course_Credits
				+ ", course_Duration=" + course_Duration + "]";
	}
	
}
