package sg.edu.iss.CAGen.Controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import sg.edu.iss.CAGen.service.EnrolmentService;
import sg.edu.iss.CAGen.service.LecturerCanTeachService;
import sg.edu.iss.CAGen.service.LecturerService;

@Controller
@RequestMapping("/gradecourse")
public class GradeCourseController {

	//Taking courseId from Enrolment 
	//Courses taught by lecturer
	@Autowired
	LecturerCanTeachService ltservice;
	
	//Lecturer 
	@Autowired
	LecturerService lservice;
	
	//Enrolled Students in the course
	@Autowired
	EnrolmentService eservice;
	
	
	
	//Using email to link lecturer table 
	//@RequestMapping("/list") 
	//public String ListCoursesTaught(Model model) {
	//linking based on lecturer Id
	//model.addAttribute("courses", ltservice.listCourseByLecturerId(id)); 
	//Find list of courses taught by this lecturer.
	//ArrayList<String> clist = ltservice.listCourseNameById(id);
	//model.addAttribute("cnames", clist);
	//return "gradecourse";
	//}
	 
}
