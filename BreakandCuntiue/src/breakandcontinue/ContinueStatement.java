package breakandcontinue;

public class ContinueStatement 

{
	public void go()
	{
		
		for(int i=0;i<=10;i++)
		{
			if(i>=0 && i<=5)             // if condition satisfy then continue statement will do increment i++ // Continue to the next cycle
				continue;				// Continue -->Skip the iteration
			System.out.println(i);
			
		}
		System.out.println("Outside the loop");
	}

	public static void main(String[] args)
	{
		ContinueStatement Continue=new ContinueStatement();
		Continue.go();
	}
}

/*
 *In real time continue statement  implement when the read excel file then will skip between 20 to 30 rows 
*/