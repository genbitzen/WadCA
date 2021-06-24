package sg.edu.iss.CAGen.Repo;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import sg.edu.iss.CAGen.Model.Lecturer;

public interface LecturerRepository extends JpaRepository<Lecturer, UUID> {

	//do a query to find firstName
	@Query("SELECT l from Lecturer l where l.firstName LIKE :name")
	List<Lecturer> findLecturerByFirstName(@Param("name")String name);
}
