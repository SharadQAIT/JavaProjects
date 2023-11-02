package methods;
public class SimpleLearningMethods
{


	public void Display()  //Declare method
	{
	int a=10;
	System.out.println(a);
	}
	
	public int Displayview()
	{
		
	//Return Type ---> datatype of the value returned by method
	// keyword ---> Return
		
	int x=10;
	return x;
	}	
	public void methodparameter()
	{
		int a=10;
		int b=15;
		int c=20;
		System.out.println("a="+a+" b="+b+" c="+c);
		
	}
	public int methodparameter1(int p,int q,int r) // This method output is not working
	{
		int x=p+q+r;
		return x;
	}

	public static void main(String[] args)

	{
		SimpleLearningMethods a=new SimpleLearningMethods();
		a.Display();
		a.Displayview();
		
		SimpleLearningMethods a1=new SimpleLearningMethods();
		a1.methodparameter();
		int b= a1.methodparameter1(10, 20, 30);
		System.out.println("Summation of 3 value is "+b);
	}
}


