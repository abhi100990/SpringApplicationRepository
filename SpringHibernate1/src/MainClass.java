import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.dao.StudentDao;
import com.example.dao.StudentDaoImpl;
import com.example.model.Student;


public class MainClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");
		
		StudentDao studentDao = (StudentDaoImpl) context.getBean("studentDaoImpl");
		
		Student student = (Student) context.getBean("student");
		
		student.setName("Abhishek");
		student.setEmail("abhi10901@gmail.com");
		student.setPhone("9638793021");
		
		studentDao.insertStudent(student);
		
		/*student = studentDAOImpl.getStudent(1);
		
		student.setName("XYZ111");
		student.setMobile("12345");
		student.setEmail("sun.agr8612@gmail.com");
		
		studentDAOImpl.updateStudent(student);*/
		
		/*List<Student> list = studentDAOImpl.getAllStudents();
		
		 
		for(int i = 0; i<list.size(); i++){
			student = list.get(i);
			System.out.println(student.getName() + " - " + student.getEmail() + " - " + student.getMobile());
		}*/
		
		/*student = studentDAOImpl.getStudent(1);
		studentDAOImpl.deleteStudent(student);*/
		
	}

}
