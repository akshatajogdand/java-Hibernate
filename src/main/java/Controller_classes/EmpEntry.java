package Controller_classes;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import BEAN_classes.Employee;
import utility_Dao.utility;

public class EmpEntry 
{
	public static void main(String[] args)
	{
		/**
		
//		1. create configuration class object and call configure() method 
		Configuration config = new Configuration().configure();
		
//		2. create SessionFactory object
		SessionFactory sf = config.buildSessionFactory();
		
//		3. create Session object
		Session session = sf.openSession();	
	
//		4. create Transaction object
		Transaction tr = session.beginTransaction();
		
//		5. create entity object and pass it to save() method
//		Employee emp = new Employee();
//		emp.setEcode(123459);
//		emp.setEname("aksah==");
//		emp.setSalary(40000);
//		emp.setDesg("engineer");
//		session.save(emp);
		
		session.save(new Employee(123,"akshataj",12000,"tester"));		
	
//		6. commit Transaction 
		tr.commit();
		
//		7. close Session 
		session.close();
		
		System.out.println("stored...........");
	}
	**/
		Employee emp = new Employee(12121, "amruta", 50000, "devloper");
		
//		SessionFactory sf = utility.getSession();
//		Session session = sf.openSession();	

		Session session = utility.getSession().openSession();
		
		Transaction tr = session.beginTransaction();
		session.save(emp);
		System.out.println(emp);
		tr.commit();
		
		session.close();
		
		System.out.println("stored using 2 method...........");
		
		
		
		
				

}
}
