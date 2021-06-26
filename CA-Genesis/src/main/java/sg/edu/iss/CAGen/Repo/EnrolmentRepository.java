package sg.edu.iss.CAGen.Repo;

import java.util.ArrayList;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import sg.edu.iss.CAGen.Model.Enrolment;

public interface EnrolmentRepository extends JpaRepository<Enrolment, UUID>{

	//query based on CourseID
	
	@Query("SELECT e FROM Enrolment e WHERE course_Id LIKE :id")
	public ArrayList<Enrolment> findEnrolmentByCourseId(@Param("id") UUID id);
}
