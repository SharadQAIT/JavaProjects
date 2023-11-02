package breakandcontinue;

public class Breakstatement
{
	
	public void go()
	{
		int i;
		for(i=0;i<=10;i++)
		{
			if(i==8)
				break;
			System.out.println(i);
			
		}
	}
	
	public static void main(String[] args)
	{
		Breakstatement break1=new Breakstatement();
		break1.go();	
	}

}

/*
 * 
 * 0
 * 1
 * 2
 * 3
 * 4
 * 
 * Break and continue statements are not use into block of methods
 * Break statement is use within switch case & Loop and continue statements use within a Loop only
 * 
 */

