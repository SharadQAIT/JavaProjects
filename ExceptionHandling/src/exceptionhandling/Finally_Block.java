package exceptionhandling;

public class Finally_Block 
{
	public static void main(String[] args) 
	{ 
		try
		{
			System.out.println("Beginner");
			int i=10/2;
			System.out.println(i);
			
		//Connection with db but somehow getting an error
		}
		catch(Throwable e)
		{	
			System.out.println("Error Occured");
		}
		finally
		{
			System.out.println("Closing the db conection");
			
		}
	}
}

/*	Finally is for--> It's compulsory run 
 *
 * 
 */

