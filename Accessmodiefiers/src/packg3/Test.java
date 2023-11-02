package packg3;

public class Test
{
		public int publicvariable=10;
		private int privatevariable=20;
		protected int protectedvariable=30;
		int defaultvariable=40;
		
		public static void main(String[] args)
		{
			Test obj=new Test();
			System.out.println(obj.publicvariable);
			System.out.println(obj.privatevariable);
			System.out.println(obj.protectedvariable);
			System.out.println(obj.defaultvariable);
			
			
		}
}
