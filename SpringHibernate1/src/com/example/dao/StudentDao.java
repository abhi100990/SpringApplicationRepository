package com.example.dao;

import java.util.List;

import com.example.model.Student;

public interface StudentDao {

	public void insertStudent(Student student);
	public Student getStudent(int id);
	public void updateStudent(Student student);
	public List<Student> getAllStudents();
	public void deleteStudent(Student student);
}
