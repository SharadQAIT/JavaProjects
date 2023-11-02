package exceptionhandling;

public class ExceptionHandle 
{

	public static void main(String[] args) 
	{
		try 
		{
		System.out.println("Beginner");
		int c=10/0;
		System.out.println(c);
		}
		catch (Exception e)
		{
			System.out.println("Error Occured");
			e.printStackTrace(); // What kind of exception generated.
		}
		System.out.println("Ending");
	}
}


/*
 *Try for got a error and catch for skip the try error .  
 * 
 */

