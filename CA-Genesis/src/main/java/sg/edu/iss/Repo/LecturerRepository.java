package sg.edu.iss.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import sg.edu.iss.Model.Lecturer;

public interface LecturerRepository extends JpaRepository<Lecturer, Integer> {

}
