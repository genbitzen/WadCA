package sg.edu.iss.CAGen.Repo;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import sg.edu.iss.CAGen.Model.Student;

public interface StudentRepository extends JpaRepository<Student, UUID> {

}
