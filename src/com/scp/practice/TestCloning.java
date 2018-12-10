package com.scp.practice;

import org.omg.CosNaming.NamingContextExtPackage.AddressHelper;

public class TestCloning {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Department s1=new Department(1, "HR");
		Empolyee e1= new Empolyee(100, "Ram", s1);
		System.out.println( e1);
		
		Empolyee e2=e1.clone();
		System.out.println(e2);
		e2.getDp().setName("CIVIL");
		System.out.println(e1);
		System.out.println(e2);
		
		
	}

}


                              
class Empolyee implements Cloneable                                // class Employee
{
 private int id;
 private String name;
 private Department dp;

 
	protected Empolyee clone() throws CloneNotSupportedException {       //clone overide
		// TODO Auto-generated method stub
	        /* Empolyee e =(Empolyee) super.clone();
	         Department d=(Department) e.getDp().clone();//when Address class is my own class so i can make clone on that class also
	         
			 e.setDp(d);*/
		 Empolyee e =(Empolyee) super.clone();
		         
		 Department dumy=new Department(e.getDp().getId(), e.getDp().getName());//when class is system defined then use these code
		 e.setDp(dumy);
			 return e;
	         
		
	}

public String toString() {
	return "Empolyee [id=" + id + ", name=" + name + ", dp=" + dp + "]";
}
public Empolyee(int id, String name, Department dp) {
	super();
	this.id = id;
	this.name = name;
	this.dp = dp;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Department getDp() {
	return dp;
}
public void setDp(Department dp) {
	this.dp = dp;
}
 
 
 
}



                                             // class Department
class Department 
{
	 private int id;
	 private String name;
	
	

	
	
				
												
	public String toString() {
		return "Department [id=" + id + ", name=" + name + "]";
	}
	public Department(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	 
}
