package com.scp.Cloning;
class Product
{
   int id;
   String name;
public Product(int id, String name) {
	super();
	this.id = id;
	this.name = name;
}
public Product(Product p)
{
   id=p.id;
   name=p.name;

}
void Display()
{
  System.out.println("id="+id);
  System.out.println("name="+name);

}

}
public class CopyConstructor 
{
  public static void main(String[] args) 
  {
	 Product p1=new Product(1,"A");
	 //System.out.println(p1);
	 Product p2=new Product(p1);
	 p1.Display();
	 p2.Display();
	 p2.id=2;
	 p2.name="B";
	 p2.Display();

	 
}
}
