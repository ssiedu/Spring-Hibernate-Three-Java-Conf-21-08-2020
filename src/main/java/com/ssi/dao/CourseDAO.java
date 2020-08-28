package com.ssi.dao;

import java.util.List;

import com.ssi.entities.Course;

public interface CourseDAO {
	public Course saveCourse(Course course);
	public Course updateCourse(Course course);
	public Course searchCourseById(int code) ;
	public Course deleteCourse(int code) ;
	public List<Course> getAllCourses();
}
