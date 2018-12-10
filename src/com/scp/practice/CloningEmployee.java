package com.scp.practice;

public class CloningEmployee {

	public static void main(String[] args) throws CloneNotSupportedException {
		EmployeeAddress employeeAddress= new EmployeeAddress("007", "MG Road", "pune") ;
		Employee emp1= new Employee("Bond", 55, employeeAddress);
		 
	Employee emp2 =(Employee) emp1.clone();
	
	System.out.println(emp1);
	System.out.println(emp2);
	
    emp2.getEmpAddress().setCity("Thane");
    System.out.println(emp2);
	
	}
}


class Employee implements Cloneable
{
private String name; 
private int	age;
private	EmployeeAddress empAddress;

/*
@Override
	protected Object clone() throws CloneNotSupportedException {
	 Employee empClone	=(Employee)super.clone();
	 EmployeeAddress employeeAddressclone= new EmployeeAddress(this.empAddress.getHouseNo(),this.empAddress.getStreet(),this.empAddress.getCity());
	   empClone.setEmpAddress(employeeAddressclone);
		return employeeAddressclone;
	}
*/



@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
	   Employee e=(Employee)super.clone();
	    EmployeeAddress newad= (EmployeeAddress) e.getEmpAddress().clone();
	         e.setEmpAddress(newad);
		return e;
	}
@Override
public String toString() {
	return "Employee [name=" + name + ", age=" + age + ", empAddress=" + empAddress + "]";
}
public Employee(String name, int age, EmployeeAddress empAddress) {
	super();
	this.name = name;
	this.age = age;
	this.empAddress = empAddress;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public EmployeeAddress getEmpAddress() {
	return empAddress;
}
public void setEmpAddress(EmployeeAddress empAddress) {
	this.empAddress = empAddress;
}


}

class EmployeeAddress implements Cloneable
{
 private String houseNo;
 private String street;
 private String city;
 
 @Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
 
 
@Override
public String toString() {
	return "EmployeeAddress [houseNo=" + houseNo + ", street=" + street + ", city=" + city + "]";
}
public EmployeeAddress(String houseNo, String street, String city) {
	super();
	this.houseNo = houseNo;
	this.street = street;
	this.city = city;
}
public String getHouseNo() {
	return houseNo;
}
public void setHouseNo(String houseNo) {
	this.houseNo = houseNo;
}
public String getStreet() {
	return street;
}
public void setStreet(String street) {
	this.street = street;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
 
 
 
	
}