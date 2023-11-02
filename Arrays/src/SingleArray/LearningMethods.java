package SingleArray;

public class LearningMethods
{
	public static int a=10;
	public static int b=20;
	
	public static void print()
	{
		int c=a+b;
		System.out.println("Addition of two number 10+20 are: "+c);
		
}
	public static int addition(int r, int s)
	{
		int d=r+s;
		return d;
	}
	
	public static void main(String args[])
	{
		print();
		int e=addition(50,50);
		System.out.println(e);
		
	}
}
