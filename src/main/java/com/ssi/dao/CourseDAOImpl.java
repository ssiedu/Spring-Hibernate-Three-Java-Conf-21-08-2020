package com.ssi.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ssi.entities.Course;

@Repository
public class CourseDAOImpl implements CourseDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public List<Course> getAllCourses() {
		Session session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(Course.class);
		List<Course> courses = criteria.list();
		session.close();
		return courses;
	}

	public Course saveCourse(Course course) {
		// write code for saving course details
		Session session = sessionFactory.openSession();
		Transaction tr = session.beginTransaction();
		session.save(course);
		// session.saveOrUpdate(course);	//common method for insert and update
		tr.commit();
		session.close();
		return course;
	}

	public Course updateCourse(Course course) {
		// write code for updating course details
		Session session = sessionFactory.openSession();
		Transaction tr = session.beginTransaction();
		session.update(course);
		tr.commit();
		session.close();
		return course;
	}

	public Course searchCourseById(int code) {
		Session session = sessionFactory.openSession();
		Course course = session.get(Course.class, code);
		session.close();
		return course;
	}

	public Course deleteCourse(int code) {
		Session session = sessionFactory.openSession();
		Course course = session.get(Course.class, code);
		Transaction tr = session.beginTransaction();
		session.delete(course);
		tr.commit();
		session.close();
		return course;
	}

}
