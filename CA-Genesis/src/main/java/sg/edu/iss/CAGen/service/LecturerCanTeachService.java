package sg.edu.iss.CAGen.service;

import java.util.ArrayList;
import java.util.UUID;

import sg.edu.iss.CAGen.Model.Course;
import sg.edu.iss.CAGen.Model.LecturerCanTeach;

public interface LecturerCanTeachService {

	//List all implementations
	
	public ArrayList<LecturerCanTeach> listAllCourseTaught();
	public ArrayList<LecturerCanTeach> listCourseByLecturerId(UUID id);
	public void addCousesTaught(LecturerCanTeach lct);
	public ArrayList<Course> findCourseNamebyId (UUID id);
}
