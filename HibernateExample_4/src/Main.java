import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.examples.domain.Student;
import com.hibernate.examples.domain.Teacher;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration conf = new Configuration().configure("hibernate.cfg.xml");
		
		SessionFactory sf= conf.buildSessionFactory();
		
		Session session = sf.openSession();
		
		Transaction trns = session.beginTransaction();
		
		Student s1 = new Student();
		s1.setName("Abhi");
		s1.setStandard("JR");
		//s1.setTeacher(tchr);
		//session.save(s1);
		
		Student s2 = new Student();
		s2.setName("Ronak");
		s2.setStandard("SR");
		//s2.setTeacher(tchr);
		//session.save(s2);
		
		Student s3 = new Student();
		s3.setName("Riken");
		s3.setStandard("JR");
		//s3.setTeacher(tchr);
		//session.save(s3);
		
		Teacher tchr = new Teacher();
		tchr.setName("Sunil");
		tchr.getStudents().add(s1);
		tchr.getStudents().add(s2);
		tchr.getStudents().add(s3);
		session.save(tchr);
		
		Teacher tchr2 = new Teacher();
		tchr.setName("Umang");
		session.save(tchr2);
		
		trns.commit();
		
		session.close();
		
	}

}
