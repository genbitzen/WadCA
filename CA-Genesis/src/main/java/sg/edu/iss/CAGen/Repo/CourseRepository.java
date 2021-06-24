package sg.edu.iss.CAGen.Repo;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import sg.edu.iss.CAGen.Model.Course;

public interface CourseRepository extends JpaRepository<Course, UUID> {

	@Query("SELECT c FROM Course c WHERE c.course_name LIKE :name")
	public List<Course> findCoursesByName(@Param("name") String name);
}
