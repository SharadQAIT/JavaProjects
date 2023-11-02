package Polymorphicreference;

public class B extends A
{
	public static void main(String[] args) {
		A driver=new B(); //Polymorphic reference
		driver.add();
	}
}
