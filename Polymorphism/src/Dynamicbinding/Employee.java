package Dynamicbinding;

public class Employee extends Person

{
	
	
/*
 * Dynamic Binding in Java
 * When the binding between the method call and its associated function happens during runtime, we call it 
 * dynamic binding or late binding. This occurs mainly in method overriding.
 * 
 * We can use the same example as above so that we can understand the difference better. 
 * The only thing is the methods are not static.
	
	Here, p1 is an Employee object of Person type. Hence p1.getName calls Employee method. This is identified during runtime
	since methods are not static and the compiler does not know binding process during compile-time. Next,  p2 is a Person object
	and so p2.getName calls Person method. Similarly, e is an Employee object, and e.getName calls Employee method. 
	In these 2 cases, there is no ambiguity in binding process.
 * 
 */
	  public void getName()
	  {
		    System.out.println("Employee Name");
	  }
	 
	  public static void main(String[] args) 
	  {
		  Person p1=new Person();
		  Person p2=new Employee();
		  Employee e=new Employee();
		  p1.getName();
		  p2.getName();
		  e.getName();
	  }
	  
}


