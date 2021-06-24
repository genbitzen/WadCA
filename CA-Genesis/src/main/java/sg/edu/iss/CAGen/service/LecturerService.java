package sg.edu.iss.CAGen.service;

import java.util.ArrayList;
import java.util.UUID;

import sg.edu.iss.CAGen.Model.Lecturer;

public interface LecturerService {

	//write high level methods from implementation here
	public boolean saveLecturer(Lecturer lecturer);
	public ArrayList<String> findAllLecturerNames();
	public ArrayList<Lecturer> listAllLecturers();
	public Lecturer findLecturerById(UUID id);
	public Lecturer findLecturerByFirstName(String firstName);
}
