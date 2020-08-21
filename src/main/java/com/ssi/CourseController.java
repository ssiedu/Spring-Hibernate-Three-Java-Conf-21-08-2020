package com.ssi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CourseController {
	
	@Autowired
	private CourseService service;
	
	@RequestMapping("newcourse")
	public String showCourseEntryPage() {
		return "centry";
	}
	
	//savecourse?code=111&title=core+java&subject=java&duration=3&fees=7000
	@RequestMapping("savecourse")
	public ModelAndView saveCourseData(@ModelAttribute("info") Course course) { //data-binding
		//we need to store model object into database using hibernate
		service.saveCourse(course);
		//forward the request to view
		ModelAndView mv=new ModelAndView("confirmation");
		return mv;
				
	}
}
