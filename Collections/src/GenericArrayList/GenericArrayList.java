package GenericArrayList;

import java.util.ArrayList;
import java.util.List;

public class GenericArrayList 
{
	public static void main(String[] args) 
	
	{
		
		// This is not type casting because Only integer values are consider.
		
		List<Integer> list=new ArrayList<Integer>();
		list.add(10);
		
		int i=list.get(0);
		System.out.println(i);

	}

		
	
}
