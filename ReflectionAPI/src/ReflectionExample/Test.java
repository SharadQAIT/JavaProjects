package ReflectionExample;

public class Test {
	
	public Test() {

	}
	public Test(int a, int b) {

	}
	public void show(int a,int b)
	{
		
	}
	
	private void add()
	{
	// Other class also be used private methods by reflection feature	
	}
	public void Print()
	{
		
	}
	public int view()
	{
		return 10;
	}
	public double doublevalue()
	{
		return 10.5;
	}

	public static void main(String[] args) {

		Test t=new Test();
		System.out.println(t.getClass().getSimpleName());
		
		
	
	}

}
