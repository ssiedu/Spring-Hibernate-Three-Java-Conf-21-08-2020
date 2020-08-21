package com.ssi;

import org.hibernate.Session;
import org.hibernate.Transaction;

public interface CourseDAO {
	public Course saveCourse(Course course);
	public Course updateCourse(Course course);
	public Course searchCourse(int code) ;
	public Course deleteCourse(int code) ;
}
