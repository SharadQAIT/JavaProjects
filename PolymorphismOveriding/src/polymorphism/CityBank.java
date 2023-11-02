package polymorphism;

public class CityBank extends RBI{
	
	public static void main(String[] args) 
	{
		
		CityBank Obj=new CityBank();
		System.out.println(Obj.getHomeLoanROI());
		System.out.println(Obj.getCarLoanROI());
	}
	public double getHomeLoanROI()
	{
		return 9.5;
	}
	public double getCarLoanROI()
	{
		return 12.5;
	}
	
	public CityBank getobject()
	/*
	 *  User class name for return object of that class and already 2 mothods are same but run by using two different object
	 *  by diff classs
	 */
			
	{
		CityBank cj=new CityBank();
		return cj;
	}

}
