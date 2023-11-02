package SingleArray;

public class TwodimensionalArray {

	public static void main(String[] args)
	{
		int rows=3;
		int cols=3;
		
		int table[][] = new int[rows][cols];
		table[0][0]=10;
		table[0][1]=20;
		table[0][2]=30;
		
		table[1][0]=40;
		table[1][1]=50;
		table[1][2]=60;
		
		table[2][0]=70;
		table[2][1]=80;
		table[2][2]=90;
		
		//Row length
		System.out.println(table.length);
		
		
		//Col length
		System.out.println(table[0].length);
		
		
		//Print data in rectangular format
	
		for(int i=0;i<table.length;i++)
		{
			for(int j=0;j<table.length;j++)
			{
				System.out.print(" "+table[i][j]);
			}
			System.out.println();
		} 
		

	}

}
