import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.examples.domain.Song;
import com.hibernate.examples.domain.SongDetails;


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
		
		Song song = new Song();
		song.setSongName("ABC");
		song.setSongType("POP");
		//int songId = (Integer) session.save(song);
		
		SongDetails sd = new SongDetails();
		//sd.setSongId(songId);
		sd.setAuthor_name("jkk");
		sd.setXyz("kes");
		sd.setSong(song);
		session.save(sd);
		
		trns.commit();
		
		session.close();
		
	}

}
