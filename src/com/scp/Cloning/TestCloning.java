package com.scp.Cloning;
// shallow cloning.............. its create exactcopy of origional..... 
//if origional change copy object alsochange and voce versa.
/**
 * The clone() method saves the extra processing task for creating the exact copy 
 * of an object. If we perform it by using the new keyword, it will take a lot 
 * of processing time to be performed that is why we use object cloning
 * 
 *
 */



public class TestCloning {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		Adress a= new Adress(11005, "pune");
		Student s1=new Student(100, "sachin",a);
		
		
	      Student s2=(Student) s1.clone();	
	      System.out.println(s1);
	      System.out.println(s1.hashCode());
	      
	      System.out.println(s2);
	      System.out.println(s2.hashCode());
	      
	      s2.getA().setCity("mumbai");
	      
	      System.out.println(s1);
	      System.out.println(s2);
		
	}

}
 class Adress{
private 	int pincoe;
private	 String city;
@Override
public String toString() {
	return "Adress [pincoe=" + pincoe + ", city=" + city + "]";
}
public Adress(int pincoe, String city) {
	super();
	this.pincoe = pincoe;
	this.city = city;
}
public int getPincoe() {
	return pincoe;
}
public void setPincoe(int pincoe) {
	this.pincoe = pincoe;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}


	 
 }

class Student implements Cloneable{
	
private int sid; 

private String name;
private Adress a;



@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
@Override
public String toString() {
	return "Student [sid=" + sid + ", name=" + name + ", a=" + a + "]";
}
public Student(int sid, String name, Adress a) {
	super();
	this.sid = sid;
	this.name = name;
	this.a = a;
}
public int getSid() {
	return sid;
}
public void setSid(int sid) {
	this.sid = sid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Adress getA() {
	return a;
}
public void setA(Adress a) {
	this.a = a;
}



	
}