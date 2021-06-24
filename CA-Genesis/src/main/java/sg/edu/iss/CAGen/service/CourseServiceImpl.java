package sg.edu.iss.CAGen.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sg.edu.iss.CAGen.Model.Course;
import sg.edu.iss.CAGen.Repo.CourseRepository;

@Service
public class CourseServiceImpl implements CourseService {

	@Autowired
	CourseRepository crepo;
	
	@Transactional
	//save course into entity and return a boolean 
	public boolean saveCourse(Course course) {
		if(crepo.save(course)!=null) return true; else return false;
	}
	
	@Transactional
	//List all courses details 
	public ArrayList<Course> listAllCourses(){
		return (ArrayList<Course>)crepo.findAll();
	}
	@Transactional
	//find course based on ID
	public Course findCourseById(UUID id) {
		return crepo.findById(id).get();
	}
	@Transactional
	public Course findCourseByName(String name) {
		return crepo.findCoursesByName(name).get(0);
	}
	//check for course name and extract into a list<String> 
	@Transactional
	public ArrayList<String> findAllCourseName(){
		//Use CRUD to extract all data into a list <Course>
		List<Course> courses = crepo.findAll();
		//Create empty ArrayList to store names
		ArrayList<String> names = new ArrayList<String>();
		//USe iterator to loop list of courses and extract course names;
		//Use hasNext to check if there's at least one element left to iterate over;
		for(Iterator<Course> iterator = courses.iterator(); iterator.hasNext();) {
			//New obj to store the next iterated value in the list
			Course course = (Course) iterator.next();
			//Store into created list of names
			names.add(course.getCourse_name());
		}
		return names;
	}
}
