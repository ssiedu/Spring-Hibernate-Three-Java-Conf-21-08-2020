package com.ssi;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Course {
	@Id
	private int code;
	private String title;
	private String subject;
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
