package MethodOverloading;

public class Calculator
{
	
	public void sum(int a, int b)
	{
		int p=a+b;
		System.out.println(p);
	}
	public void multiply(double a, double b,double c)
	{
		double q=(a*b*c);
		System.out.println(q);
	}
	
	
	public static void main(String[] args) {
		Calculator c=new Calculator();
		c.sum(10, 20);
		c.multiply(23.25, 24.05, 25.05);
	}
	
}
