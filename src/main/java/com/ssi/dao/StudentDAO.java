package com.ssi.dao;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ssi.entities.Student;

@Repository
public class StudentDAO {
	@Autowired
	private SessionFactory sessionFactory;
	public Student saveStudent(Student student) {
		Session session=sessionFactory.openSession();
		Transaction tr=session.beginTransaction();
		session.save(student);
		tr.commit();
		session.close();
		return student;
	}
	public Student searchStudent(int rno) {
		Session session=sessionFactory.openSession();
		Student student=session.get(Student.class,rno);
		session.close();
		return student;
	}
}
