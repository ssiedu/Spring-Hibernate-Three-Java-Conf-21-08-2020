package com.ssi;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

public interface CourseDAO {
	public Course saveCourse(Course course);
	public Course updateCourse(Course course);
	public Course searchCourseById(int code) ;
	public Course deleteCourse(int code) ;
	public List<Course> getAllCourses();
}
