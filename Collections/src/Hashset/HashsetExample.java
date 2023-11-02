package Hashset;

import java.util.HashSet;
import java.util.Iterator;

public class HashsetExample
{
	public static void main(String[] args) {
		
		HashSet<String> set=new HashSet<String>();
		set.add("Raman");
		set.add("Vijay");
		set.add("WaY2Automation");
		set.add("Selenium");
		System.out.println(set);
		
	
		//If get next value in number of data
		
		Iterator<String> itr=set.iterator();
		while(itr.hasNext())
		{
			if(itr.next().equals("Raman"))
			{
	           System.out.println(itr.next());  

			}			
		}
		
		// If get only specific value in number of data
		
		Iterator<String> itr1=set.iterator();
		while(itr1.hasNext())
		{
			String var=itr1.next();
			if(var.equals("Raman"))
			{
	           System.out.println(var);  

			}			
		}
		
	}
}
