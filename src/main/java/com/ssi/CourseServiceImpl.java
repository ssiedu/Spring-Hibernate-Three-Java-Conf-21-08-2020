package com.ssi;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
		// TODO Auto-generated method stub
		return dao.getAllCourses();
	}
	
	
	
	
	
	
}
