package WrapperUnwrapperclass;

public class WrapperUnwrapper {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		int var=100;
		
		Integer obj=new Integer(var); //Wrapping ---> Autoboxing
		
		
		System.out.println(obj);
		
		int i=obj; //unwrapping---> AutoUnboxing
	}

}
