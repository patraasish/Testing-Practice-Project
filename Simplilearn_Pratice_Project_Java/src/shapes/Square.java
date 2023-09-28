package shapes;

public class Square extends ParentShape{
	double side;
	Square(double side ){
		this.side=side;
	}
	
	public void display_the_area() {
		 double area = side * side;
	     System.out.println("Area of the Square: " + area);
	}
}
