package com.ssi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CourseController {
	
	@Autowired
	private CourseService service;
	
	
	@RequestMapping("viewall")
	public ModelAndView showAllCourses() {
		List<Course> courses=service.getAllCourses();
		ModelAndView mv=new ModelAndView("courselist-jstl");
		mv.addObject("courses", courses);
		return mv;
	}
	
	@RequestMapping("searchcourse")
	public ModelAndView searchCourse(@RequestParam("code") int code) {
		//read the course-code
		//search the detail using service
		Course course=service.searchCourseById(code);
		//will return ModelAndView (contains view name and model object)
		ModelAndView mv=new ModelAndView("searchresult");
		mv.addObject("course",course);
		return mv;
	}
	
	
	
	//mapping to show search-form (when user clicks the hyper linke with href="search", we need to show csearch.jsp"
	@RequestMapping("search")
	public String showSearchForm() {
		return "csearch";
	}
	
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
