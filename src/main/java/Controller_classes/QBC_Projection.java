package Controller_classes;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;

import BEAN_classes.Employee;
import utility_Dao.utility;

public class QBC_Projection {
public static void main(String[] args) 
{
	Session session = utility.getSession().openSession();
	Criteria cr = session.createCriteria(Employee.class);		
	
	
	/***
//	to get only emp names
	Projection prj = Projections.property("salary");
	cr.setProjection(prj);
	
//	to get only salary and in desc order
	Order order = Order.desc("salary");
	cr.addOrder(order);
	
	Projection prj1 = Projections.property("salary");
	cr.setProjection(prj1);
	***/
	
//	to get only emp names, code
	Projection prj2 = Projections.property("ename");
	Projection prj3 = Projections.property("ecode");
	cr.setProjection(prj2);	
	cr.setProjection(prj3);	


	
	
	
	ProjectionList plist = Projections.projectionList();
	plist.add(prj2);
	plist.add(prj3);
	
	cr.setProjection(plist);
	cr.list();


	List<Object[]> ls = cr.list();
	
	for(Object[] i : ls)
	{
		System.out.println(i[0]);
		System.out.println(i[1]);
	}




}


}

