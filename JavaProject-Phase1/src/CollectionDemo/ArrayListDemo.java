package CollectionDemo;

import java.util.ArrayList;

public class ArrayListDemo {
	
	public static void main(String args[]) {
		//create an object of the ArrayList Class which is implements methods of  List class
		ArrayList<String> cities=new ArrayList<String>();
		cities.add("jajpur");
		cities.add("puri");
		cities.add(1,"kdp");
		cities.add("kjr");
		
		System.out.println(cities.size());
		
		//for each
		for(String temp:cities) {
			System.out.print(temp+" ");
		}
	}

}
