package com.ssi.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import org.hibernate.validator.constraints.Range;

@Entity
public class Course {
	@Id
	@Min(value=100, message="Code Cant Be Less Than 100")
	private int code;
	
	private String title;
	private String subject;
	@Range(min=1, max=12, message="Duration Must Be Between 1-12 Only")
	//@Min(value=1, message="Code")
	//@Max(12)
	private int duration;
	private int fees;
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public int getFees() {
		return fees;
	}
	public void setFees(int fees) {
		this.fees = fees;
	}
	@Override
	public String toString() {
		return "Course [code=" + code + ", title=" + title + ", subject=" + subject + ", duration=" + duration
				+ ", fees=" + fees + "]";
	}
	
}
