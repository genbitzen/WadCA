package sg.edu.iss.CAGen.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import sg.edu.iss.CAGen.Model.LecturerCanTeach;

public interface LecturerCanTeachRepository extends JpaRepository<LecturerCanTeach, Integer> {

	//Find courses based on input parameters ( lecturerID )
	//Can use findById?
}
