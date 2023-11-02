package Staticbinding2;

public class Employee extends Person 
{

	/*Static Binding in Java
	 * 
	 * Now consider the below example. We have a parent class Person with a static method getName and a subclass Employee 
	 * also with a static method getName. First, we create an object p1 of Person class. When it executes p1.getName, 
	 * it directly calls the Parent class method. This is because the compiler resolves binding during compile time itself.
 	 * 
	 */
  public static void getName()
  {
    System.out.println("Employee Name");
  }
  
  public static void main(String[] args) 
  {
    Person p1 = new Person();  // Method call outside the existing class file
    Person p2 = new Employee(); // Method call outside the existing class file
    Employee E1= new Employee(); // Method call within a class
    E1.getName();
    p1.getName();
    p2.getName();
    
   /* Next, we create an Employee object of Person type. Since the parent class method is static, the compiler knows 
	* that we cannot override this method. Hence when it executes p2.getName, it calls the Person class method only. 
	* This the reason it prints “Person Name” for both the method calls.
	*  
    */
  }
}
