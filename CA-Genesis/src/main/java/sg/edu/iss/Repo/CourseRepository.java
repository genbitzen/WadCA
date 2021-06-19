package sg.edu.iss.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import sg.edu.iss.Model.Course;

public interface CourseRepository extends JpaRepository<Course, Integer> {

}
