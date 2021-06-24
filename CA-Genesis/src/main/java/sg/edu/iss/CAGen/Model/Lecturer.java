package sg.edu.iss.CAGen.Model;

import java.time.LocalDate;
import java.util.Collection;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Lecturer {

	//test out UUID first
	@Id
	@GeneratedValue(generator = "UUID")
	@GenericGenerator(
			name = "UUID",
			strategy = "org.hibernate.id.UUIDGenerator")
	@Type(type = "uuid-char")
	private UUID lecturer_Id;
	@DateTimeFormat(pattern="dd/MM/YY")
	private LocalDate doj;
	private String email;
	private String firstName;
	private String middleName;
	private String lastName;
	@OneToMany(mappedBy="lecturer")
	private Collection<LecturerCanTeach> lecturerCanTeaches;
	public Lecturer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Lecturer(LocalDate doj, String email, String firstName, String middleName, String lastName) {
		super();
		this.doj = doj;
		this.email = email;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
	}

	public Lecturer(LocalDate doj, String email, String firstName, String middleName, String lastName,
			Collection<LecturerCanTeach> lecturerCanTeaches) {
		super();
		this.doj = doj;
		this.email = email;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.lecturerCanTeaches = lecturerCanTeaches;
	}
	public UUID getLecturer_Id() {
		return lecturer_Id;
	}
	public void setLecturer_Id(UUID lecturer_Id) {
		this.lecturer_Id = lecturer_Id;
	}
	public LocalDate getDoj() {
		return doj;
	}
	public void setDoj(LocalDate doj) {
		this.doj = doj;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Collection<LecturerCanTeach> getLecturerCanTeaches() {
		return lecturerCanTeaches;
	}
	public void setLecturerCanTeaches(Collection<LecturerCanTeach> lecturerCanTeaches) {
		this.lecturerCanTeaches = lecturerCanTeaches;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((lecturer_Id == null) ? 0 : lecturer_Id.hashCode());
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
		Lecturer other = (Lecturer) obj;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (lecturer_Id == null) {
			if (other.lecturer_Id != null)
				return false;
		} else if (!lecturer_Id.equals(other.lecturer_Id))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Lecturer [lecture_Id=" + lecturer_Id + ", doj=" + doj + ", email=" + email + ", firstName=" + firstName
				+ ", middleName=" + middleName + ", lastName=" + lastName + ", lecturerCanTeaches=" + lecturerCanTeaches
				+ "]";
	}
	
	
}
