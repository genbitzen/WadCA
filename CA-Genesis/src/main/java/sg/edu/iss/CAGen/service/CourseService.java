package sg.edu.iss.CAGen.service;

import java.util.ArrayList;
import java.util.UUID;

import sg.edu.iss.CAGen.Model.Course;

public interface CourseService {

	//Write implemented methods here
	public boolean saveCourse(Course course);
	public ArrayList<String>findAllCourseName();
	public ArrayList<Course>listAllCourses();
	public Course findCourseByName(String name);
	public Course findCourseById(UUID id);
}
