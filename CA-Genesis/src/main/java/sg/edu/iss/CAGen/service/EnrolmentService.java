package sg.edu.iss.CAGen.service;

import java.util.ArrayList;
import java.util.UUID;

import org.springframework.data.repository.query.Param;

import sg.edu.iss.CAGen.Model.Enrolment;

public interface EnrolmentService {

	//Implementation methods
	public ArrayList<Enrolment> listEnrolmentByCourseId(UUID id);
	}
