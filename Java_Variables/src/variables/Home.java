package variables;

public class Home {

	
	// instance //local //class variables
	
	//Instance - Declared in body
	// local - Define in method
	// Class variables - Static method will be use other class variables.
	
	int a=10;  // Instance / Global Variables
	
	
	public void local()
	{
		int a=10; // local
		int b=20;
		System.out.println(a);
	}

	
	public static void main(String[] args) 
	
	{
		// TODO Auto-generated method stub
		Home h=new Home();
		h.local();
	}

}
