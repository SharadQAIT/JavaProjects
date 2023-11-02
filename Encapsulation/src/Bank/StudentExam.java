package Bank;

public class StudentExam 
{	
	private String name;
	
	public void setName(String Name)
	{
		String S=Name;
		System.out.println(S);
	}
	public String getName()
	{
		return name;
	}

	public static void main(String[] args)
	{
		StudentExam Std=new StudentExam();
		Std.setName("Sharad");
		Std.getName();
	}

}
