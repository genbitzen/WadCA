package sg.edu.iss.CAGen.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import sg.edu.iss.CAGen.service.EnrolmentService;
import sg.edu.iss.CAGen.service.LecturerCanTeachService;

@Controller
@RequestMapping("/gradecourse")
public class GradeCourseController {

	//Courses taught by lecturer
	@Autowired
	LecturerCanTeachService ltservice;
	
	//Enrolled Students in the course
	@Autowired
	EnrolmentService eservice;
	
}
