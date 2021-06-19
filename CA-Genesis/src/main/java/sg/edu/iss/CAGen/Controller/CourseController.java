package sg.edu.iss.CAGen.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import sg.edu.iss.CAGen.Repo.CourseRepository;

//CourseEnrolment
@Controller
@RequestMapping("/course")
public class CourseController {

	@Autowired
	CourseRepository crepo;
	
	//Getting list of Courses from 1 table to display 
	@GetMapping("/list")
	public String enrolmentList(Model model) {

		model.addAttribute("courses", crepo.findAll());
		return "courseEnrolment";
	}
}
