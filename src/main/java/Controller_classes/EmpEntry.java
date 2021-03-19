package Controller_classes;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import BEAN_classes.Employee;

public class EmpEntry 
{
	public static void main(String[] args)
	{
		
//		1. create configuration class object and call configure() method 
		Configuration config = new Configuration().configure();
		
//		2. create SessionFactory object
		SessionFactory sf = config.buildSessionFactory();
		
//		3. create Session object
		Session session = sf.openSession();	
	
//		4. create Transaction object
		Transaction tr = session.beginTransaction();
		
//		5. create entity object and pass it to save() method
		Employee emp = new Employee();
		emp.setEcode(123459);
		emp.setEname("aksah==");
		emp.setSalary(40000);
		emp.setDesg("engineer");
		
		session.save(emp);		
	
//		6. commit Transaction 
		tr.commit();
		
//		7. close Session 
		session.close();
		
		System.out.println("stored...........");
	}

}
