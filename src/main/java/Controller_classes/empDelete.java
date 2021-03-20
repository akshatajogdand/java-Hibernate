package Controller_classes;

import org.hibernate.Session;
import org.hibernate.Transaction;

import BEAN_classes.Employee;
import utility_Dao.utility;

public class empDelete
{
	public static void main(String[] args) 
	{
	Employee emp = new Employee(1212);
	
	Session session = utility.getSession().openSession();
	
	Transaction tr = session.beginTransaction();
	session.delete(emp);	
	tr.commit();
	
	session.close();
	
	System.out.println("deleted..........");

	}
}
