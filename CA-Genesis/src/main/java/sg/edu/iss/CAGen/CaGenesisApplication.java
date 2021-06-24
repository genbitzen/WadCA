package sg.edu.iss.CAGen;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import sg.edu.iss.CAGen.Model.Course;
import sg.edu.iss.CAGen.Model.Lecturer;
import sg.edu.iss.CAGen.Model.Student;
import sg.edu.iss.CAGen.Repo.CourseRepository;
import sg.edu.iss.CAGen.Repo.LecturerCanTeachRepository;
import sg.edu.iss.CAGen.Repo.LecturerRepository;
import sg.edu.iss.CAGen.Repo.StudentRepository;

@SpringBootApplication
public class CaGenesisApplication {

	@Autowired 
	CourseRepository crepo;
	
	@Autowired
	LecturerRepository lrepo;
	
	@Autowired
	LecturerCanTeachRepository ltrepo;
	
	@Autowired
	StudentRepository srepo;
	
	public static void main(String[] args) {
		SpringApplication.run(CaGenesisApplication.class, args);
	}

	@Bean
	CommandLineRunner runner() {
		return args -> {

			//change Id to String
			Course c1 = new Course(60,"History in Salmon Farming",3,"A brief Introduction to Salmon farming techniques", "8 weeks");
			Course c2 = new Course(30,"Anatomy of Salmon 101",3,"A good understanding of Salmon biology","6 weeks");
			Course c3 = new Course(25,"River Fish Environments",2,"Various Fishing environments contributing to the lives of river fishes","3 weeks");
			Course c4 = new Course(30,"Basic Fishing Techniques",3,"A brief Introduction to fish poaching techniques","4 weeks");
			Course c5 = new Course(20,"Advanced Fishing Techniques",5,"In-depth Understanding to fish poaching techniques","6 weeks");
			crepo.save(c1); crepo.save(c2); crepo.save(c3);crepo.save(c4);crepo.save(c5); 

			//Create Lecturer Table
			Lecturer l1 = new Lecturer(LocalDate.of(02, 11, 03), "XXX@gmail.com", "Tin", "The", "Great");
			Lecturer l2 = new Lecturer(LocalDate.of(05, 05, 05), "ZZZ@hotmail.com", "Cher Wah", "The", "Wise");
			Lecturer l3 = new Lecturer(LocalDate.of(01, 8, 01), "QQQ@gmail.com", "Yuen Kwan", "The", "Fast");
			lrepo.save(l1);lrepo.save(l2);lrepo.save(l3);
			
			//Create Student Table 
			Student s1 = new Student(LocalDate.of(02, 01, 10),"AAZX@gmail.com","Akito","The","Tall");
			Student s2 = new Student(LocalDate.of(05, 01, 10),"CCZH@gmail.com","Kizuka","The","Cool");
			Student s3 = new Student(LocalDate.of(10, 01, 10),"WWSX@gmail.com","Lilth","The","Fat");
			Student s4 = new Student(LocalDate.of(12, 01, 10),"TTSY@gmail.com","Pickle","The","Wise");
			Student s5 = new Student(LocalDate.of(21, 01, 10),"NBFT@gmail.com","Coral","The","Funny");
			srepo.save(s1);srepo.save(s2);srepo.save(s3);srepo.save(s4);srepo.save(s5);
			//Create LecturerCanTeach
			//LecturerCanTeach lt1 = new LecturerCanTeach("History in Salmon Farming",crepo.find)
		};
	}
}
