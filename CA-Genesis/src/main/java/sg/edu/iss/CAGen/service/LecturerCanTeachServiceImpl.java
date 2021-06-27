package sg.edu.iss.CAGen.service;

import java.util.ArrayList;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sg.edu.iss.CAGen.Model.Course;
import sg.edu.iss.CAGen.Model.LecturerCanTeach;
import sg.edu.iss.CAGen.Repo.LecturerCanTeachRepository;

@Service
public class LecturerCanTeachServiceImpl implements LecturerCanTeachService{

	@Autowired
	LecturerCanTeachRepository ltrepo;
	
	
	//List all courses taught by all lecturer
	
	@Transactional
	public ArrayList<LecturerCanTeach> listAllCourseTaught(){
		return (ArrayList<LecturerCanTeach>) ltrepo.findAll();
	}
	
	//LIst courses taught by 1 lecturer
	@Transactional
	public ArrayList<LecturerCanTeach> listCourseByLecturerId(UUID id){
		return ltrepo.findCourseLecturerById(id);
	}
	
	//List coursenames by lecutuerId
	@Transactional
	public ArrayList<Course> findCourseNamebyId (UUID id){
		return ltrepo.listCourseNamesByLecturerId(id);
		
	}
	@Transactional
	public void addCousesTaught(LecturerCanTeach lct) {
		ltrepo.save(lct);
	}
}
