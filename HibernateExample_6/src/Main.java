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
		
		Student s2 = new Student();
		s2.setName("Ronak");
		s2.setStandard("SR");
		
		Student s3 = new Student();
		s3.setName("Riken");
		s3.setStandard("JR");
		
		Teacher tchr1 = new Teacher();
		tchr1.setName("Sunil");
		tchr1.getStudents().add(s1);
		tchr1.getStudents().add(s2);
		session.save(tchr1);
		
		Teacher tchr2 = new Teacher();
		tchr2.setName("Umang");
		tchr2.getStudents().add(s1);
		tchr2.getStudents().add(s2);
		tchr2.getStudents().add(s3);
		session.save(tchr2);
		
		trns.commit();
		
		session.close();
		
	}

}
