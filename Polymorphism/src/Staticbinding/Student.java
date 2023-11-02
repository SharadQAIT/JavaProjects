package Staticbinding;

public class Student
{
	/*
	 * 
	 * 
	 * Static Binding in Java
	 * When the compiler is able to determine the method call binding to the method body during compile-time,
	 * we call it static binding or early binding. Generally, the methods which are static, private, and final are static binding.
	 * This is because method overriding is not possible for such methods. Hence the compiler knows which class method to call 
	 * during compile time itself.
	 * 
	 * Let’s see a simple example of static binding. Here we have only 1 class with a single method and we create a reference
	 * object of the Student class. Hence when it calls s.getName, the compiler knows that it belongs to the Student class getName
	 * method. There is no confusion in the binding process.
	 * 
	 * 
	 * 
	 * 
	 */
	  public void getName() 
	  {
	    System.out.println("Student Name");
	  }

	  public static void main(String[] args) 
	  {
	    Student s = new Student();
	    s.getName();
	  }
}	