package sg.edu.iss.CAGen.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import sg.edu.iss.CAGen.Model.Course;

public interface CourseRepository extends JpaRepository<Course, Integer> {

}
