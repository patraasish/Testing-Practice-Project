package CollectionDemo;

import java.util.HashSet;

public class HashsetDemo {

	//it implements set interface
	//it store value in key value pair
	//it does not store value in indexing format
	//it store in hash table format
	
	public static void main(String[] args) {
	
		HashSet<String> cities=new HashSet<>();
		cities.add("london");
		cities.add("newyork");
		cities.add("Delhi");
		cities.add("hyderabad");
		//print the hash set
		
		for(String t:cities) {
			System.out.println(t);
		}
		
		System.out.println(cities.size());
		System.out.println(cities.contains("Tokyo"));
		
		
	}

}
