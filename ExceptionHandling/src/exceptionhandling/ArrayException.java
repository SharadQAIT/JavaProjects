package exceptionhandling;

public class ArrayException 
{
	public static void main(String[] args) 
	{
		System.out.println("Beggining");
		try {
		int i[]=new int[4];
		i[5]=100;
		}catch(Exception e)
		{
			System.out.println("Error Occured");
			e.printStackTrace();
			
			//screenshot
			//send mail attached screenshot and print error message
			//in mail subject
		}
		
	}
}
