package sg.edu.iss.CAGen.service;

import java.util.ArrayList;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sg.edu.iss.CAGen.Model.Enrolment;
import sg.edu.iss.CAGen.Repo.EnrolmentRepository;

@Service
public class EnrolmentServiceImpl implements EnrolmentService {

	@Autowired
	EnrolmentRepository erepo;
	
	@Transactional
	public ArrayList<Enrolment> listEnrolmentByCourseId(UUID id){
		return erepo.findEnrolmentByCourseId(id);
	}
}
