package sg.edu.iss.CAGen.Repo;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import sg.edu.iss.CAGen.Model.Enrolment;

public interface EnrolmentRepository extends JpaRepository<Enrolment, UUID>{

}
