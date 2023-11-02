package Abstractclass;

public class D extends C
{

	@Override
	void view() {
		// TODO Auto-generated method stub
		System.out.println("Class D");
		
	}
	
	public static void main(String[] args) {
		D obj=new D();
		obj.view();
		obj.display();
		
	}

}
