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
		
		Teacher tchr1 = new Teacher();
		tchr1.setName("Sunil");
		
		Teacher tchr2 = new Teacher();
		tchr2.setName("Umang");
		
		Student s1 = new Student();
		s1.setName("Abhi");
		s1.setStandard("JR");
		s1.getTeachers().add(tchr1);
		s1.getTeachers().add(tchr2);
		session.save(s1);
		
		Student s2 = new Student();
		s2.setName("Ronak");
		s2.setStandard("SR");
		s2.getTeachers().add(tchr1);
		s2.getTeachers().add(tchr2);
		session.save(s2);
		
		Student s3 = new Student();
		s3.setName("Riken");
		s3.setStandard("JR");
		s3.getTeachers().add(tchr2);
		session.save(s3);
		
		trns.commit();
		
		session.close();
		
	}

}
