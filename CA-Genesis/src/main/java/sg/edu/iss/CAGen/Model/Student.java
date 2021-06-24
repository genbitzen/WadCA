package sg.edu.iss.CAGen.Model;

import java.time.LocalDate;
import java.util.Collection;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Student {

	@Id
	@GeneratedValue(generator = "UUID")
	@GenericGenerator(
			name = "UUID",
			strategy = "org.hibernate.id.UUIDGenerator")
	private UUID student_Id;
	@DateTimeFormat(pattern="dd/MM/YY")
	private LocalDate admission_Date;
	private String email;
	private String firstName;
	private String middleName;
	private String lastName;
	@OneToMany(mappedBy = "student")
	private Collection<Enrolment> enrolments;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(LocalDate admission_Date, String email, String firstName, String middleName, String lastName) {
		super();
		this.admission_Date = admission_Date;
		this.email = email;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
	}
	public Student(LocalDate admission_Date, String email, String firstName, String middleName, String lastName,
			Collection<Enrolment> enrolments) {
		super();
		this.admission_Date = admission_Date;
		this.email = email;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.enrolments = enrolments;
	}
	
	public UUID getStudent_Id() {
		return student_Id;
	}
	public void setStudent_Id(UUID student_Id) {
		this.student_Id = student_Id;
	}
	public LocalDate getAdmission_Date() {
		return admission_Date;
	}
	public void setAdmission_Date(LocalDate admission_Date) {
		this.admission_Date = admission_Date;
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
	public Collection<Enrolment> getEnrolments() {
		return enrolments;
	}
	public void setEnrolments(Collection<Enrolment> enrolments) {
		this.enrolments = enrolments;
	}
	@Override
	public String toString() {
		return "Student [student_Id=" + student_Id + ", admission_Date=" + admission_Date + ", email=" + email
				+ ", firstName=" + firstName + ", middleName=" + middleName + ", lastName=" + lastName + ", enrolments="
				+ enrolments + "]";
	}
	
}
