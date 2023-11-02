package SingleTonDesignPattern;

public class SingleTonTest {
	
	private static SingleTonTest instance=new SingleTonTest();

	private SingleTonTest()
	{
		System.out.println("Creating Object");
	}
	public static SingleTonTest getInstance()
	{
		return instance;
	}
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

	}
	
	

}
