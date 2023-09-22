package shapes;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Circle circle=new Circle(12.3);
		Square square=new Square(32);
		Rectangle rectangle=new Rectangle(12.6,4.8);
		
		ArrayList<ParentShape> list=new ArrayList<>();
		
		list.add(circle);
		list.add(square);
		list.add(rectangle);
		
		try {
		for(ParentShape shape:list) {
			shape.display_the_area();
		}
		}
		
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		finally {
			System.out.println("Program ended");
		}
	}

}
