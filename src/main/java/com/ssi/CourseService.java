package com.ssi;

import java.util.List;

public interface CourseService {
	public Course saveCourse(Course course);
	public Course searchCourseById(int code);
	public List<Course> getAllCourses();
	public Course deleteCourse(int code);
}
