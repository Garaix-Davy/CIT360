package garaix.cit360;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateTest {

	public static void main(String[] args) {
		
		// creates a new user or a Model object that hibernate will process
		UserDetails user1 = new UserDetails();
		user1.setUserId(1);
		user1.setUserName("First User");
		
		UserDetails user3 = new UserDetails();
		user3.setUserId(3);
		user3.setUserName("Third User");

		// Here we're creating a configuration that calls its configuration method
		// and then, we're calling the buildSessionFactory so that the configuration from 
		// hibernate is passed into the SessionFactory object called sessionFactory.
		// Note: we're not specifying the config file as we're using the default name (hibernate.cfg.xml).
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

		// now creating a session we can use to save our Model object, user.
		Session session = sessionFactory.openSession();
		
		// beginning the transaction. In here, we can save as many objects as we want.
		session.beginTransaction();
		
		// saving the user objects
		session.save(user1);
		session.save(user3);
		
		session.getTransaction().commit(); // fetching and committing the transaction.
		

		
		
		
	}

}
