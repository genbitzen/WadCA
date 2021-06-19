package sg.edu.iss.CAGen;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import sg.edu.iss.CAGen.Model.Course;
import sg.edu.iss.CAGen.Repo.CourseRepository;

@SpringBootApplication
public class CaGenesisApplication {

	@Autowired 
	CourseRepository crepo;
	
	public static void main(String[] args) {
		SpringApplication.run(CaGenesisApplication.class, args);
	}

	@Bean
	CommandLineRunner runner() {
		return args -> {

			//change Id to String
				Course c1 = new Course(1001,"History in Salmon Farming","A brief Introduction to Salmon farming techniques", 60, 3, "8 weeks");
				Course c2 = new Course(1003,"Anatomy of Salmon 101","A good understanding of Salmon biology", 30, 3, "6 weeks");
				Course c3 = new Course(1010,"River Fish Environments","Various Fishing environments contributing to the lives of river fishes", 25, 2, "3 weeks");
				Course c4 = new Course(1008,"Basic Fishing Techniques","A brief Introduction to fish poaching techniques", 30, 3, "4 weeks");
				Course c5 = new Course(2008,"Advanced Fishing Techniques","In-depth Understanding to fish poaching techniques", 20, 5, "6 weeks");
				crepo.save(c1); crepo.save(c2); crepo.save(c3);crepo.save(c4);crepo.save(c5); 

		};
	}
}
