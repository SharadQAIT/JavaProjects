package packg4;

import packg3.Test;

public class Sample extends Test
{

	public static void main(String[] args) 
	{
		/*
		 * Inheritance - Once class object will inherit other class properties
		 * extends,implements
		 * A,B
		 * A extends B
		 * 
		 */
		Sample obj=new Sample();
		System.out.println(obj.publicvariable);
		System.out.println(obj.privatevariable);
		System.out.println(obj.protectedvariable);
		System.out.println(obj.defaultvariable);
		
	}

}
