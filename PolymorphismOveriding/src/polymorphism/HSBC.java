package polymorphism;

public class HSBC extends RBI
{
	public static void main(String[] args)
	{
		
		HSBC obj=new HSBC();
		System.out.println(obj.getHomeLoanROI());
		System.out.println(obj.getCarLoanROI());
	}
	public double getHomeLoanROI()
	{
		return 15.5;
	}
	public double getCarLoanROI()
	{
		return 18.5;
	}
	public HSBC getobject() // User class name for return object of that class and already 2 methods are same but run by using two different object by diff classes
	{
		HSBC HS=new HSBC();
		return HS;
	}
	
	public AMEX getobject1()
	{
		AMEX obj = new AMEX();
		return obj;
	}


 // Should parent-child relation must a have if want create one object by class. The class having to child class must if not then shows error
	
	
	
}

