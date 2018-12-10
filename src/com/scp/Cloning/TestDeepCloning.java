package com.scp.Cloning;

/*
 * Sometimes we want to get a copy of an Object, but java works on reference and if 
 * we don’t want to alter the original object then we need to perform deep copy. 
 * In simple terms, deep copy of an Object should be completely detached from 
 * the original object.
 * 
 */


public class TestDeepCloning {
	public static void main(String[] args) throws CloneNotSupportedException
	{
	  Address1 a1=new Address1(111, "pune");
	  Emp e1=new Emp(1, "A", a1);
	  Emp e2=(Emp) e1.clone();
	  System.out.println(e1);
	  System.out.println(e1.hashCode());
	  System.out.println(e2);
	  System.out.println(e2.hashCode());
	  
	  
	  e2.getA().setCity("mumbai");
	  System.out.println(e1);
	  System.out.println(e2);
		
	}

}


class Address1 implements Cloneable{
	private int pin;
	private String city;
	@Override
	public String toString() {
		return "Address1 [pin=" + pin + ", city=" + city + "]";
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Address1(int pin, String city) {
		super();
		this.pin = pin;
		this.city = city;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
}

class Emp implements Cloneable{
	 private int eid;
	 private String ename;
	 private Address1 a;
	 
	 @Override
	protected Object clone() throws CloneNotSupportedException { 
		Emp e=(Emp) super.clone();                  // clone () ,..... first we create 1 obj of emp, and add super.clone();...
		 e.a= (Address1) this.a.clone();   
		                                          //e.a=(Address1) this.a.clone();//  main logic of deep cloning.
		return e;
		 
	
	}
	 
	@Override
	public String toString() {
		return "Emp [eid=" + eid + ", ename=" + ename + ", a=" + a + "]";
	}
	public Emp(int eid, String ename, Address1 a) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.a = a;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public Address1 getA() {
		     
		       return a; 
	          
		    

	}
	public void setA(Address1 a) {
		this.a = a;
	}
	 
	 
	
}
