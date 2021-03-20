package utility_Dao;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class utility 
{
	public static SessionFactory getSession() 
	{
		Configuration config = new Configuration().configure();
		SessionFactory sf = config.buildSessionFactory();

		return sf;	
	}
}
