package sg.edu.iss.CAGen.Controller;

import java.util.ArrayList;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import sg.edu.iss.CAGen.Model.Course;
import sg.edu.iss.CAGen.Model.Lecturer;
import sg.edu.iss.CAGen.Model.LecturerCanTeach;
import sg.edu.iss.CAGen.service.CourseService;
import sg.edu.iss.CAGen.service.LecturerCanTeachService;
import sg.edu.iss.CAGen.service.LecturerCanTeachServiceImpl;
import sg.edu.iss.CAGen.service.LecturerService;
import sg.edu.iss.CAGen.service.StudentService;

@Controller
@RequestMapping("/courseenrolment")
public class CourseEnrolmentController {

	//import service layer via auto-wired
	@Autowired
	LecturerService lservice;
	
	@Autowired
	LecturerCanTeachService ltservice;
	
	@Autowired
	CourseService cservice;
	
	@Autowired
	StudentService stservice;

	@Autowired
	public void setCourseService(LecturerCanTeachServiceImpl ltserviceImpl) {
		this.ltservice= ltserviceImpl;
	}
	@RequestMapping(value ="/add")
	public String addCourses(Model model) {
		//add new course form
		model.addAttribute("addcourse", new LecturerCanTeach());
		//extract names from DB
		ArrayList<String> clist = cservice.findAllCourseName();
		ArrayList<String> llist = lservice.findAllLecturerNames();
		model.addAttribute("cnames", clist);
		model.addAttribute("lnames", llist);
		//direct to html
		return "addcourseform";
	}
	
	@RequestMapping(value = "/save")
	public String saveCourseTaught (@ModelAttribute("addcourse") @Valid LecturerCanTeach addcourse,BindingResult bindingResult, Model model) {
		if(bindingResult.hasErrors()) {
			return "addcourseform";
		}
		//Lecturer Id
		Lecturer lecturer = lservice.findLecturerByFirstName(addcourse.getLecturer().getFirstName());
		lecturer = lservice.findLecturerById(lecturer.getLecturer_Id());
		addcourse.setLecturer(lecturer);
		//Course Id
		Course course = cservice.findCourseByName(addcourse.getCourse().getCourse_name());
		course = cservice.findCourseById(course.getCourse_Id());
		addcourse.setCourse(course);
		//Find course name
		Course coursename = cservice.findCourseByName(addcourse.getCourse().getCourse_name());
		addcourse.setCan_Teach(coursename.toString());
		ltservice.addCousesTaught(addcourse);
		return "forward:/courseenrolment/add";
	}
	@RequestMapping(value = "/list")
	public String listCourseKnown(Model model) {
		model.addAttribute("allCourses", cservice.listAllCourses());
		return "courseEnrolment";
	}
	
	@RequestMapping(value = "/studentlist")
	public String studentsList(Model model) {
		model.addAttribute("students", stservice.listAllStudents());
		return "DetailedCourseEnrolment";
	}
	
}
