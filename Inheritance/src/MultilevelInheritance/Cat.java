package MultilevelInheritance;

public class Cat extends Dog
{
	public void tigerBarking()
	{
		System.out.println("The tiger is barking");
	}
	public static void main(String[] args) 
	{
		
		Cat c=new Cat();
		c.catBarking();
	}
}
