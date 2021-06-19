package sg.edu.iss.CAGen.Model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Enrolment {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int enrolment_Id;
	double student_Grade;
	@DateTimeFormat(pattern="dd/MMMM/YYYY")
	LocalDate Student_Enrolment_Date;
	@DateTimeFormat(pattern="dd/MMMM/YYYY")
	LocalDate Start_Date;
	String Enrolment_Status;
	public Enrolment() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Enrolment(int enrolment_Id, double student_Grade, LocalDate student_Enrolment_Date, LocalDate start_Date,
			String enrolment_Status) {
		super();
		this.enrolment_Id = enrolment_Id;
		this.student_Grade = student_Grade;
		Student_Enrolment_Date = student_Enrolment_Date;
		Start_Date = start_Date;
		Enrolment_Status = enrolment_Status;
	}
	//Enrolment ID is auto-generated 
	public Enrolment(double student_Grade, LocalDate student_Enrolment_Date, LocalDate start_Date, String enrolment_Status) {
		super();
		this.student_Grade = student_Grade;
		Student_Enrolment_Date = student_Enrolment_Date;
		Start_Date = start_Date;
		Enrolment_Status = enrolment_Status;
	}
	public int getEnrolment_Id() {
		return enrolment_Id;
	}
	public void setEnrolment_Id(int enrolment_Id) {
		this.enrolment_Id = enrolment_Id;
	}
	public double getStudent_Grade() {
		return student_Grade;
	}
	public void setStudent_Grade(double student_Grade) {
		this.student_Grade = student_Grade;
	}
	public LocalDate getStudent_Enrolment_Date() {
		return Student_Enrolment_Date;
	}
	public void setStudent_Enrolment_Date(LocalDate student_Enrolment_Date) {
		Student_Enrolment_Date = student_Enrolment_Date;
	}
	public LocalDate getStart_Date() {
		return Start_Date;
	}
	public void setStart_Date(LocalDate start_Date) {
		Start_Date = start_Date;
	}
	public String getEnrolment_Status() {
		return Enrolment_Status;
	}
	public void setEnrolment_Status(String enrolment_Status) {
		Enrolment_Status = enrolment_Status;
	}
	@Override
	public String toString() {
		return "Enrolment [enrolment_Id=" + enrolment_Id + ", student_Grade=" + student_Grade
				+ ", Student_Enrolment_Date=" + Student_Enrolment_Date + ", Start_Date=" + Start_Date
				+ ", Enrolment_Status=" + Enrolment_Status + "]";
	}
	
	
}
