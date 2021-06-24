package sg.edu.iss.CAGen.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sg.edu.iss.CAGen.Model.LecturerCanTeach;
import sg.edu.iss.CAGen.Repo.LecturerCanTeachRepository;

@Service
public class LecturerCanTeachServiceImpl implements LecturerCanTeachService{

	@Autowired
	LecturerCanTeachRepository ltrepo;
	
	
	//List all courses taught by lecturer
	
	@Transactional
	public ArrayList<LecturerCanTeach> listAllCourseTaught(){
		return (ArrayList<LecturerCanTeach>) ltrepo.findAll();
	}
}
