package SingleTonDesignPattern;


public class ComparisonTest {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		String name1="Way2Automation";
		String name2="Way2Automation";
		System.out.println(name1==name2); //True //Comparision object reference same address
		System.out.println(name1.equals(name2)); //True //Content verification
		
		String name_1=new String ("Raman");
		String name_2=new String ("Raman");
		
		int x=100;
		int y=100;
		
	/*	System.out.println(x==y);*/ 
		System.out.println(name_1==name_2);
		System.out.println(name_1.equals(name_2)); 
		
		//Create single object and store multiple value at one place
		
		SingleTonTest s1= SingleTonTest.getInstance();
		SingleTonTest s2= SingleTonTest.getInstance();
		System.out.println(s1);
		System.out.println(s2);		
		System.out.println(s1==s2);
	}

	
	/*
	 * == or .equals()
	 * 
	 * == Comparison = Object reference same address
	 * .equals()= Content is same
	 * 
	 */
	
	
	
	
}
