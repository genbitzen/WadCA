package sg.edu.iss.CAGen.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Lecturer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int lecturer_Id;
	String lecturer_Name;
	String lecturer_Email;
	
	public Lecturer() {
		super();
		// TODO Auto-generated constructor stub
	}
	//For adding new lecturer if any.
	public Lecturer(int lecturer_Id, String lecturer_Name, String lecturer_Email) {
		super();
		this.lecturer_Id = lecturer_Id;
		this.lecturer_Name = lecturer_Name;
		this.lecturer_Email = lecturer_Email;
	}
	public int getLecturer_Id() {
		return lecturer_Id;
	}
	public void setLecturer_Id(int lecturer_Id) {
		this.lecturer_Id = lecturer_Id;
	}
	public String getLecturer_Name() {
		return lecturer_Name;
	}
	public void setLecturer_Name(String lecturer_Name) {
		this.lecturer_Name = lecturer_Name;
	}
	public String getLecturer_Email() {
		return lecturer_Email;
	}
	public void setLecturer_Email(String lecturer_Email) {
		this.lecturer_Email = lecturer_Email;
	}
	@Override
	public String toString() {
		return "Lecturer [Lecturer_Id=" + lecturer_Id + ", Lecturer_Name=" + lecturer_Name + ", Lecturer_Email="
				+ lecturer_Email + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + lecturer_Id;
		result = prime * result + ((lecturer_Name == null) ? 0 : lecturer_Name.hashCode());
		return result;
	}
	//Validatation
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Lecturer other = (Lecturer) obj;
		if (lecturer_Id != other.lecturer_Id)
			return false;
		if (lecturer_Name == null) {
			if (other.lecturer_Name != null)
				return false;
		} else if (!lecturer_Name.equals(other.lecturer_Name))
			return false;
		return true;
	}
	
	
}
