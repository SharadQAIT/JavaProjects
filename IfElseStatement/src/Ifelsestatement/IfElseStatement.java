package Ifelsestatement;

public class IfElseStatement
{
	public static void main(String[] args)
	{
	
	int num= (int) (Math.random()*20);
		if(num>10 && num<15)
		{
		System.out.println(num+" is between 10 and 15");
		}	
		else if(num>15 && num<20)
		{
		System.out.println(num+" is between 15 and 20");
		}
		else
		{
			System.out.println(num+" is less than 10");

		}
	}

}