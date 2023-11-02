package staticnonstaticmethod;

public class Static 

{
	//Static Component --> Cannot give a call to non-static component directly
	//Static --> Static
	//non static -->non static, static
	//non static component cannot be called without making an object
	
	/*
	 * 
	 * Compile 
	 * Executed JVM - Always main method execute first because it is consider static keyword first through main method
	 * 
	 * 
	 */
	
	public static void main(String[] args) 
	{
		Static r1=new Static();
		r1.go(); //Static Component --> Cannot give a call to non-static component directly
		go3(); // Static method call to static method
	}
	public void go()
	{
		System.out.println("Inside Go Method");
		go1();
	}
	public void go1()
	{
		System.out.println("Inside Go1 Method");
		go2();

	}
	public void go2()
	{
		System.out.println("Inside Go2 Method");
		
	}
// Static component ---> Can give a call to static component
	public static void go3()
	{
		System.out.println("Inside Go3 Method");
		
	}
	

}

