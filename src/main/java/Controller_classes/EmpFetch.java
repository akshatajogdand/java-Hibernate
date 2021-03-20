package Controller_classes;

import java.util.*;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import BEAN_classes.Employee;
import utility_Dao.utility;

public class EmpFetch {
	public static void main(String[] args)
	{
//		no need to begin transaction as we are fetiching the values

/****************************** query by ID ***********************************
		Session session = utility.getSession().openSession();
		Employee emp = session.get(Employee.class, 12121);			
		
		System.out.println(emp.getEname());
		System.out.println(emp.getDesg());
		session.close();

		System.out.println("......"+emp);
		
		
		
to fetch multiple rows use QBC or HQL	
/****************************** query by criteria ***********************************
		Session session = utility.getSession().openSession();
		Criteria cr = session.createCriteria(Employee.class);
		
		List<Employee> ls = cr.list();
		
		for(Employee i : ls)
		{
			System.out.println(i);
			
			System.out.println(i.getEname());
			System.out.println(i.getDesg());
		}
	***/	
/****************************** ordering ***********************************
		
		Session session = utility.getSession().openSession();
		Criteria cr = session.createCriteria(Employee.class);
		
		Order order = Order.desc("salary");
		cr.addOrder(order);
		
		List<Employee> ls = cr.list();
		
		for(Employee i : ls)
		{
			System.out.println(i);
			
			System.out.println(i.getEname());
			System.out.println(i.getSalary());
		}

/****************************** query by criteria ***********************************/
//for filteration we have REsrictions class with many static methods that return instance of criterian 
/****************************** query by criteria ***********************************/
		
		Session session = utility.getSession().openSession();
		Criteria cr = session.createCriteria(Employee.class);
		
//		Criterion criterion_obj = Restrictions.gt("salary", 15000);

		Criterion criterion_obj1 = Restrictions.between("salary", 15000, 70000);
		Criterion criterion_obj2 = Restrictions.like("ename", "a%");
	
//		cr.add(criterion_obj1);
//		cr.add(criterion_obj2);
		
//		Criterion criterion_obj3 = Restrictions.or(criterion_obj1, criterion_obj2);
		
//		Criterion criterion_obj3 = Restrictions.and(criterion_obj1, criterion_obj2);
		Criterion criterion_obj4 = Restrictions.eq("ename", "amruta");

		cr.add(criterion_obj4);
				
				
				
		List<Employee> ls = cr.list();
		
		for(Employee i : ls)
		{
			System.out.println(i);
			
			System.out.println(i.getEname());
			System.out.println(i.getSalary());
	}
}
}
