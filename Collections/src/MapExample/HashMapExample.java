package MapExample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		HashMap<String,String> map = new HashMap<String,String>();
		
		
		// add items in hashmap // Multiple keys with multiple value assign with each of them
		map.put("FirstName", "Sharad"); 
		map.put("LastName", "Khairnar"); 
		map.put("Sub", "Selenium"); 
		map.put("Location", "Ahmedabad"); 
		System.out.println(map);
		System.out.println(map.size());
		
		Set<String> keys= map.keySet();
		
		for(String key:keys)
		{
			System.out.println("Key is-- "+key+" Value is--- "+map.get(key));
		}
		
	
		//Only one column name Email and multiple value in one key
		
		HashMap<String,List<String>> map1 = new HashMap<String,List<String>>();

		List<String> lisofemails = new ArrayList<String>();
		lisofemails.add("test@gmail.com");
		lisofemails.add("Xyz@gmail.com");
		lisofemails.add("abc@gmail.com");
		map1.put("Email",lisofemails);

	}

}
