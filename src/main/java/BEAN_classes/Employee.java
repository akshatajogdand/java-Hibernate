package BEAN_classes;

import javax.persistence.*;

@Entity
public class Employee {

@Id	
int ecode;
String ename;
int salary;
String desg;

public String getDesg() {
	return desg;
}
public void setDesg(String desg) {
	this.desg = desg;
}
public int getEcode() {
	return ecode;
}
public void setEcode(int ecode) {
	this.ecode = ecode;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}



@Override
public String toString() {
	return "Employee [ecode=" + ecode + ", ename=" + ename + ", salary=" + salary + ", desg=" + desg + ", getDesg()="
			+ getDesg() + ", getEcode()=" + getEcode() + ", getEname()=" + getEname() + ", getSalary()=" + getSalary()
			+ "]";
}
}
