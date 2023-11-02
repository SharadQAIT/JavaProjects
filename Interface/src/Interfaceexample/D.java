package Interfaceexample;

public class D implements A,C
{

	@Override
	public void see() {
		System.out.println("This is C class interface see method");
	}

	@Override
	public void look() {
		System.out.println("This is C class interface look method");
		
	}

	@Override
	public void display() {
		System.out.println("This is A class interface display method");
		
	}

	@Override
	public void store() {
		System.out.println("This is A class interface Store method");
		
	}
		
public static void main(String[] args) {
	
	D obj=new D();
	obj.see();
	obj.look();
	obj.display();
	obj.store();
}	
	
}
