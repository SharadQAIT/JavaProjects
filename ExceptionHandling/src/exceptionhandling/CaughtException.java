package exceptionhandling;

public class CaughtException
{
	public static void main(String[] args) throws InterruptedException 
	{
		 try 
		 {
			Thread.sleep(1000);
		 } 
		 catch (InterruptedException e) 
		 {
			e.printStackTrace();
		}

		 try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 Thread.sleep(2000);
	}

}

/* Everytime no need try catch block and due to that we can use interruptedException
 * 
 * 
 */

