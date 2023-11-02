package Bank;

public class StudentTest extends StudentExam

{
	public static void main(String[] args) 
	{
		StudentExam s=new StudentExam();
		/* First case
		 * assign value to private variable through getter and setter methods
		 */
		s.setName("Bharat");
		/*Second case
		 * 
		 * does not allow to assign value to private variables,no getter and setter methods
		 */
		
		/*
		 * Third case
		 * 
		 * 
		 * 
		 * 
		 * private getter and setter  methods cannot be called by other class
		 * they are accessible within the class
		 */
	}
	
}
