package sg.edu.iss.CAGen.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sg.edu.iss.CAGen.Repo.EnrolmentRepository;

@Service
public class EnrolmentServiceImpl implements EnrolmentService {

	@Autowired
	EnrolmentRepository erepo;
}
