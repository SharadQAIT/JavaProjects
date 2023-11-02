package MultilevelInheritance;

public class Dog
{
	public void dogBarking()
	{
		System.out.println("The dog is barking");
	}
	public void catBarking()
	{
		System.out.println("The Cat is barking");
	}
	public static void main(String[] args) {
		
		Dog d=new Dog();
		d.dogBarking();
	}

}
