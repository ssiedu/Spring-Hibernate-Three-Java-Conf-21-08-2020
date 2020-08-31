package com.ssi.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ssi.entities.Course;
import com.ssi.services.CourseService;

@Controller
public class CourseController {
	
	@Autowired
	private CourseService service;
	
	@RequestMapping("springform")
	public ModelAndView showSpringForm() {
		//here we will show the spring-form
		Course course=new Course(); course.setCode(555);course.setTitle("DataScience");course.setSubject("Python");course.setDuration(10);course.setFees(50000);
		
		List<String> sub=new ArrayList<String>();	sub.add("Android"); sub.add("Java"); sub.add("Oracle");  sub.add("Python");
		
		ModelAndView mv=new ModelAndView("sample-spring-form");
		mv.addObject("info",course);
		mv.addObject("subjects",sub);
		return mv;
	}
	@RequestMapping("updatecourse")
	public ModelAndView updateCourseData(@ModelAttribute("course") Course course) {
		service.updateCourse(course);
		ModelAndView mv=new ModelAndView("redirect:viewall");
		return mv;
	}
	@RequestMapping("update")
	public ModelAndView showUpdateForm(@RequestParam("code") int code) {
		Course course=service.searchCourseById(code);
		ModelAndView mv=new ModelAndView("update-form");
		mv.addObject("course", course);
		return mv;
	}
	@RequestMapping("deletecourse")
	public ModelAndView deleteCourse(@RequestParam("code") int code) {
		Course course=service.deleteCourse(code);
		ModelAndView mv=new ModelAndView("delete-confirmation");
		mv.addObject("course",course);
		return mv;
	}
	@RequestMapping("delete")
	public String showDeleteForm() {
		return "delete-form";
	}
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
