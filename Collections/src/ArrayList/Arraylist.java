package ArrayList;

import java.util.ArrayList;

public class Arraylist 
{

	public static void main(String[] args) {
		
		ArrayList list=new ArrayList();
		System.out.println(list);
		System.out.println(list.size());
		
		// This is type casting .when you assign a value of one primitive data type to another type. In array list number of data type auto define.
		list.add(10);
		list.add(50.40);
		list.add("Sharad");
		list.add('c');
		list.add(true);
		list.add(null);
		list.add("Raman");
		System.out.println(list);
		
		//How to fetch the values from a list
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println("List of size"+" "+list.size());

		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
		
		
	}
}

