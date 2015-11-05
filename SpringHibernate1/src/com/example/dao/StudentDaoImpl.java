package com.example.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.example.model.Student;

public class StudentDaoImpl implements StudentDao{

	SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}


	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}


	@Override
	public void insertStudent(Student student) {
		Session session = sessionFactory.openSession();
		Transaction trans = session.beginTransaction();
		
		session.save(student);
		trans.commit();
		session.close();
	}

	@Override
	public Student getStudent(int id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		return session.get(Student.class, id);
	}
	
	@Override
	public void updateStudent(Student student) {
		// TODO Auto-generated method stub
		
		Session session = sessionFactory.openSession();
		Transaction t = session.beginTransaction();
		session.update(student);
		t.commit();
		
		
	}
	
	@SuppressWarnings("unchecked")
	public java.util.List<Student> getAllStudents() {
		Session session = sessionFactory.openSession();
		return session.createQuery("from Student").list();
	};
	
	@Override
	public void deleteStudent(Student student) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		Transaction t = session.beginTransaction();
		session.delete(student);
		t.commit();
	}

}
