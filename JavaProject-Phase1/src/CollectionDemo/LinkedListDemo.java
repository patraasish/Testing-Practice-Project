package CollectionDemo;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		LinkedList<String> cities=new LinkedList<>();
		
		cities.add("jajpur");
		cities.add("puri");
		cities.add(1,"kdp");
		cities.add("kjre");
		
		System.out.println(cities.size());
		Iterator itr=cities.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

		
		System.out.println(cities.get(2));
		System.out.println(cities.contains("puri"));
	}

}
