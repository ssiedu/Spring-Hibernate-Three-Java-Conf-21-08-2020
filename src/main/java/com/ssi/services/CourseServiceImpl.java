package com.ssi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssi.dao.CourseDAO;
import com.ssi.entities.Course;

@Service
public class CourseServiceImpl implements CourseService {
	
	@Autowired
	private CourseDAO dao;
	
	public Course saveCourse(Course course) {
		//we will not write any hibernate code here, we already have it in DAO
		return dao.saveCourse(course);
	}
	public Course searchCourseById(int code) {
		return dao.searchCourseById(code);
	}

	public List<Course> getAllCourses() {
		return dao.getAllCourses();
	}

	public Course deleteCourse(int code) {
		return dao.deleteCourse(code);
	}

	public Course updateCourse(Course course) {
		return dao.updateCourse(course);
	}
	
	
	
	
	
	
}
