package Bank;

public class Bank 
{
	
	/*
	 * Encapsulation - Data binding / Wrapping data and methods in single unit
	 * Data hiding - hiding the data from outside world so that they are not directly accessible
	 * Abstraction - Force calling those variables using methods
	 *  
	 * 
	 */
	public int Accountnum=1234567890;
	private int Npin=1234;   // Private variable should not be access in ATM java program(other class) so it is calling by method - Called Encapsulation
	private int amount=10000;
	
	public void accountinfo(int account , int addpin, int Retrievebalance)
	{
		if(account==Accountnum && addpin==Npin)
		{
			
			if(Retrievebalance<=amount)
			{
							
				int currentbalance=amount-Retrievebalance;
				System.out.println("Your withdrwal amount is: " +Retrievebalance+", Available balance is "+currentbalance);
			
			}
			else
			{
				System.out.println("Insufficient Balance");
			}
		}
		else 
		{
			System.out.println("Invalid Crdentials");
		}
	}
	
	public void updatepin(int Updatepin,int acccountnumber,int addpin)
	{
			Npin=Updatepin;
			System.out.println("New Pin Updated Successfully "+Npin);
			if(acccountnumber==Accountnum && addpin==Npin)
			{
				System.out.println("You are successfully Logged In ATM");
			}
	}
	
}
