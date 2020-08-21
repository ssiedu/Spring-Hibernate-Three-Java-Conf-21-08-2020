package com.ssi;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CourseDAOImpl implements CourseDAO {
	
@Autowired	
private SessionFactory sessionFactory;
	
	public Course saveCourse(Course course) {
		//write code for saving course details
		Session session=sessionFactory.openSession();
		Transaction tr=session.beginTransaction();
		session.save(course);
		tr.commit();
		session.close();
		return course;
	}
	
	public Course updateCourse(Course course) {
		return null;
	}
	public Course searchCourse(int code) {
		return null;
	}
	public Course deleteCourse(int code) {
		return null;
	}
}
