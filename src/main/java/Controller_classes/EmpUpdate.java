package Controller_classes;

import org.hibernate.Session;
import org.hibernate.Transaction;

import BEAN_classes.Employee;
import utility_Dao.utility;

public class EmpUpdate {
	public static void main(String[] args) {

		Session session = utility.getSession().openSession();
		Employee emp = session.get(Employee.class, 12121);
		emp.setEname("aarohiiiii...");
		emp.setSalary(70000);

		Transaction tr = session.beginTransaction();
		session.update(emp);
		tr.commit();

		session.close();
		System.out.println("updated..........");

//		Employee emp = new Employee();
//		emp.setEcode(1212);
//		emp.setEname("aarohi...");
//		emp.setSalary(70000);
//		Session session = utility.getSession().openSession();
//
//		Transaction tr = session.beginTransaction();
//		session.update(emp);
//		tr.commit();
//
//		session.close();
//
//		System.out.println("updated..........");

	}
}
