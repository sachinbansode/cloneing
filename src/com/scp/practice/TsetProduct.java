package com.scp.practice;

public class TsetProduct {
	public static void main(String[] args) throws CloneNotSupportedException {
		 Product p1= new Product(100, 12000,"laptop");
		 System.out.println("P1..."+p1);
		 
     Product p2= p1.clone();
     System.out.println("P2..."+p2);
     
     
     
     System.out.println("\nAfter changing the Value");
     
     
     p1.setPname("Tv");
     System.out.println(p1);
     System.out.println(p2);
	}
	

}

class Product implements Cloneable{
	private int pid;
	private int pprice;
     String pname;
	
	@Override
	protected Product clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return (Product) super.clone();
	}
	
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pprice=" + pprice + ", pname=" + pname + "]";
	}
	public Product(int pid, int pprice, String pname) {
		super();
		this.pid = pid;
		this.pprice = pprice;
		this.pname = pname;
	}

	public int getPid() {
		return pid;
	}
	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}
	public int getPprice() {
		return pprice;
	}
	public void setPprice(int pprice) {
		this.pprice = pprice;
	}
	
	
}