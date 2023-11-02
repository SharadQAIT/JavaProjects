package Abstractclass;

public class B extends A  // This is concrete class where abstract keyword not use.
{
	void display()
	{
		System.out.println("Class A");
	}
	
	
public static void main(String[] args)   
{
	B obj=new B();
	obj.display();
}
}


