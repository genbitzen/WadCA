package sg.edu.iss.CAGen.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sg.edu.iss.CAGen.Model.Lecturer;
import sg.edu.iss.CAGen.Repo.LecturerRepository;

@Service
public class LecturerServiceImpl implements LecturerService {

	@Autowired
	LecturerRepository lrepo;
	
	@Transactional
	public boolean saveLecturer(Lecturer lecturer) {
		if(lrepo.save(lecturer)!= null) return true; else return false;
	}
	
	//List All Lecturers
	@Transactional
	public ArrayList<Lecturer> listAllLecturers(){
		return (ArrayList<Lecturer>) lrepo.findAll();
	}
	//find member by Id
	@Transactional
	public Lecturer findLecturerById(UUID id) {
		return lrepo.findById(id).get();
	}
	//find lecturerId by email
	@Transactional
	public UUID findLecturerIdbyEmail(String email) {
		return lrepo.findLecturerIdbyEmail(email);
	}
	//get lecturer firstName
	@Transactional
	public Lecturer findLecturerByFirstName(String firstName) {
		return lrepo.findLecturerByFirstName(firstName.trim()).get(0);
	}
	@Transactional 
	public ArrayList<String> findAllLecturerNames() {
		List<Lecturer> lecturers = lrepo.findAll();
		//Create empty list titled names
		ArrayList<String> names = new ArrayList<String>();
		for(Iterator<Lecturer> iterator = lecturers.iterator(); iterator.hasNext();) {
			Lecturer lecturer = (Lecturer) iterator.next();
			names.add(lecturer.getFirstName());
		}
		return names;
	}
}
