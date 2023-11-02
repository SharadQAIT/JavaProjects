package calc;

public class Calculator 
{

	public int add(int a,int b)
	{	
		int c=a+b;
		return c;
		
	}
	public int sub(int x,int y)
	{	
		int z=x-y;
		return z;
		
	}
	public int div(int p,int q)
	{
		int r=p/q;
		return r;
	}
	 public int mul(int m,int n)
	 {
		 int o=m*n;
		 return o;
	 }
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		Calculator c=new Calculator();
		int add=c.add(10, 20);
		int sub=c.sub(30, 20);
		int div= c.div(10, 2);
		int mul=c.mul(30, 30);
		System.out.println("Summation of 10+20= "+add);
		System.out.println("Summation of 30-20= "+sub);
		System.out.println("Summation of 10/2= "+div);
		System.out.println("Summation of 30*30= "+mul);

	}

}
