package com.ssi.services;

import java.util.List;

import com.ssi.entities.Course;

public interface CourseService {
	public Course updateCourse(Course course);
	public Course saveCourse(Course course);
	public Course searchCourseById(int code);
	public List<Course> getAllCourses();
	public Course deleteCourse(int code);
}
