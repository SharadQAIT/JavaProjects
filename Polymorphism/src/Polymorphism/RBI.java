package Polymorphism;

public class RBI 
{
	/*
	 *   same method name and different signature
	 *   In same class we have mutiple methods with same name but different method signature
	 */

	public static void main(String[] args) 
	{
		RBI R=new RBI();
		R.getHomeLoanROI("SBI", 100);
		R.getHomeLoanROI("BOI","Maninagar", 2500);
		R.getHomeLoanROI(2000, "ICICI");
		R.doLogin("Sharad Khairnar", 12345); /// Add only parameter and updated username instead of mobile. Wise versa.
		
	}
	public void getHomeLoanROI(String bankName, int amount)
	{
		System.out.println(bankName+"Loan amount is: "+amount);
	}
	public void getHomeLoanROI(String bankName, String Branch,int amount )
	{
		System.out.println(Branch+"of"+bankName+"and the loan amount is:"+amount);

	}
	public void getHomeLoanROI(int amount, String bankName)
	{
		System.out.println(amount+"amount is for the bank is: "+bankName);

	}
	public void doLogin(String Username, int Password)
	{
		System.out.println(Username+"Logged in successfully,"+ Password+"is the Password");

	}
	public void doLogin(int Mobile, int Password)
	{
		System.out.println(Mobile+"Logged in successfully by using Mobile,"+ Password+"is the Password");

	}

}
