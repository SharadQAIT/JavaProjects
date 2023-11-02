package ReflectionExample;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class Home {

	
	//When run the test cases at time need to generates Log file (That's the concept )
	
	public static void main(String[] args) {

		Test t=new Test();
		Class clazz=t.getClass();
		System.out.println(clazz.getSimpleName());
		Method[] Arrayofmethods=clazz.getDeclaredMethods();
		System.out.println(Arrayofmethods.length);
		
		Constructor[] c=clazz.getDeclaredConstructors();
		System.out.println("Cunstroctur length is "+c.length);
		
		for(Constructor cons:c)
		{
			System.out.println("Cunstructor name is display with package  "+cons.getName());
		}
		
		for(Method M1:Arrayofmethods)
		{
			System.out.println(M1.getName()+" Return type is "+M1.getName());
			
			Parameter[] params=M1.getParameters();
			
			for(Parameter param:params) 
			{
				System.out.println(param.getName());
			}
		}
		
	
		/*
		 * Test---> Object---> Class Object
		 * method---> get executed ---> Method
		 * Cunstructor---> called ---> Cunstructor
		 * 
		 * Widely used Class and methods re-usable
		 */
		
	}

}
