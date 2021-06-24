package sg.edu.iss.CAGen.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sg.edu.iss.CAGen.Model.Student;
import sg.edu.iss.CAGen.Repo.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	StudentRepository srepo;
	
	//List all students info 
	
	@Transactional
	public ArrayList<Student> listAllStudents(){
		return (ArrayList<Student>) srepo.findAll();
	}
}
