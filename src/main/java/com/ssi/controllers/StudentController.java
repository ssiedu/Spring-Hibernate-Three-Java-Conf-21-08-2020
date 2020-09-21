package com.ssi.controllers;

import java.io.IOException;
import java.sql.Blob;

import org.hibernate.engine.jdbc.BlobProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.ssi.entities.Student;
import com.ssi.services.StudentService;

@Controller
public class StudentController {
	
	@Autowired
	private StudentService service;
	
	@PostMapping("savestudent")
	public ModelAndView saveStudentInfo(@ModelAttribute("student") Student student, @RequestParam("pic") MultipartFile file) {
		
		//System.out.println(student);
		
		try {
			//converting Multipart File Object in byte-array
			byte b[]=file.getBytes();
			//we need to create a Blob object.
			Blob blob=BlobProxy.generateProxy(b);
			student.setPhoto(blob);
			//save to db
			service.saveStudent(student);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		ModelAndView mv=new ModelAndView("studentconfirmation");
		return mv;
		//System.out.println(student);
		
		
	}
	
	@RequestMapping("newstudent")
	public String showEntryForm() {
		return "sentry";
	}
}
