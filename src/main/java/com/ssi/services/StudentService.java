package com.ssi.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssi.dao.StudentDAO;
import com.ssi.entities.Student;

@Service
public class StudentService {
	@Autowired
	private StudentDAO dao;
	
	public Student searchStudent(int rno) {
		return dao.searchStudent(rno);
	}
	
	public Student saveStudent(Student student) {
		return dao.saveStudent(student);
	}
}
