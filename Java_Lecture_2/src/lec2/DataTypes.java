package lec2;

public class DataTypes 
{

	public static void main(String[] args) 
	{
		
		// All are primitive data type
		int i=1234567890; // Store integer value in int data type,Same for other data type. In int only store 10 value. 
		float f=1.13133113313131323423423f; 	// Store float value by using f suffix	, When define int i, floar f it's 
		long l=1113213131312313l;  				// Store long integer value by using l suffix
		double d=1.23423423423424324234234234; //Store long decimal value in double DT (data type)
		boolean b = false; 					// boolean value store false, true values only
		char c = 'a';
		String s = "This is primitive data type";  // String is a class in java also.

		int a; //Called declaration
		int x=10; //called initialization
		
		
		DataTypes dt; //This is non-primitive data type, Classname use as datatype and define variable.
	
		// below are the camel casing variable defines. first letter should be capital and break those long words with capital letters
		int batmanBegins; 
		int theDarkKnight;
		int theDarkKnightRises; 
		
		/*In java documents library file */
		// class name is generally normal fonts
		// interface name is generally italic fonts
		// https://www.selenium.dev/selenium/docs/api/java/allclasses-noframe.html - Define java default classes, interfaces
		
		String abc=new String();  // here we can create an object by using called string class.
		abc="Hello";
		
		String abc1= "Hello"; // Here is also created String class object and store value in abc1
		
		String s1= "Way";
		String s2= "2";
		String s3= "Automation";
		
			
		System.out.println(s1+s2+s3);
		System.out.println("Way"+"2"+"Automation");
		System.out.println(s1+" "+s2+"   "+s3);

		int  p= 10;
		int  q= 5;
		System.out.println(p+q);
		System.out.println(p+q+"before");
		System.out.println("After"+p+q+"before");
		System.out.println("After"+(p+q)+"before");
		
		//Three opertaros
		/*
		 * Unary operator - single operands
		 * Binary Operator - two operands
		 * Ternery Operator - three operands
		 */
		
		int ab= 10 + 20; // 10,20 is a an operands and + is arithmatic operator
		
		// Equality and relation operator
		
		System.out.println(15==15); // -> Equal to condition true
		System.out.println(14!=15); // -> NotEqual to condition false
		System.out.println(20>15);  // -> Greater than condition true
		System.out.println(10<15);  // -> less than condition true
		System.out.println(20>=20);  // -> Greater than condition true
		System.out.println(10<=10);  // -> less than condition true
		
		// Conditional Operators
		
		System.out.println((123==123) && (50==50));  // AND operator. Both condition are true -> True
		System.out.println((123==120) && (50==50));  // AND operator. 1 condition is False and 2 condition True -> False
		System.out.println((123==120) && (50==45));  // AND operator. 1 condition is False and 2 condition False -> False
		
		System.out.println((123==123) || (50==50)); // OR operator , One of them condition must true. Must signle condition should be true.
		
		}
		
		
	}


