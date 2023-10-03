package CollectionDemo;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapDemo {

	//Hash Map is implementing Map interface
	//its underlying data structure  is hash table
	//storing value in key value pair
	//store always unique key for values
	//it allow only one key as null
	//can store any kind of data
	//does not store data in index
	public static void main(String[] args) {
		
		HashMap<Integer,String> td=new HashMap<>();
		td.put(21, "Asish");
		td.put(215, "Asish");
		
		//Every key and value inserted in the map is of type Entry
		
		for(Entry m:td.entrySet())
		{
			System.out.println(m.getKey()+" - "+m.getValue());
		}
		
		
		System.out.println(td.containsKey(21));
		System.out.println(td.containsValue("Asish"));
		
		td.remove(21);
		
		for(Entry m:td.entrySet())
		{
			System.out.println(m.getKey()+" - "+m.getValue());
		}
	}

}
