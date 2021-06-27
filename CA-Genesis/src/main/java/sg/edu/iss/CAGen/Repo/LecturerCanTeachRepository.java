package sg.edu.iss.CAGen.Repo;

import java.util.ArrayList;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import sg.edu.iss.CAGen.Model.Course;
import sg.edu.iss.CAGen.Model.LecturerCanTeach;

public interface LecturerCanTeachRepository extends JpaRepository<LecturerCanTeach, Integer> {

	//Find courses based on input parameters ( lecturerID )
	//Can use findById?
	@Query("SELECT cl FROM LecturerCanTeach cl WHERE lecturer_Id LIKE :id")
	public ArrayList<LecturerCanTeach> findCourseLecturerById(@Param("id") UUID id);
	
	//Find course name based on lecturerId
	@Query("SELECT c FROM LecturerCanTeach cl INNER JOIN cl.course c INNER JOIN cl.lecturer l WHERE l.lecturer_Id LIKE :lecturerid")
	public ArrayList<Course> listCourseNamesByLecturerId (@Param("lecturerid") UUID id);
}
