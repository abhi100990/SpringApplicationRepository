package com.hibernate.examples.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.Generated;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.ManyToAny;

@Entity
public class Student {

	@Id
	@GenericGenerator(name="auto", strategy="increment")
	@GeneratedValue(generator = "auto")
	private int student_id;
	private String name;
	private String standard;
	public int getStudent_id() {
		return student_id;
	}
	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStandard() {
		return standard;
	}
	public void setStandard(String standard) {
		this.standard = standard;
	}
	
	@ManyToMany(cascade = CascadeType.ALL)
	private List<Teacher> teachers = new ArrayList<Teacher>();
	public List<Teacher> getTeachers() {
		return teachers;
	}
	public void setTeachers(List<Teacher> teachers) {
		this.teachers = teachers;
	}
	
	
	/*
	@ManyToOne(cascade = CascadeType.ALL)
	private Teacher teacher;
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}*/
}
