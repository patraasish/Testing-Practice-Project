package shapes;

public class Rectangle extends ParentShape{
	
	public double length;
	public double width;
	
	Rectangle(double length , double width){
		this.length=length;
		this.width=width;
	}
	
	public void display_the_area() {
		 double area = length * width;
	        System.out.println("Area of the rectangle: " + area);
	}
	
}
