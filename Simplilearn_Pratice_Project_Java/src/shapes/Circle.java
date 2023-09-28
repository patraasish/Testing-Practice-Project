package shapes;

public class Circle extends ParentShape {

	double radius;
	Circle(double radius ){
		this.radius=radius;
	}
	
	public void display_the_area() {
		 double area = Math.PI * radius * radius;
	     System.out.println("Area of the circle: " + area);
	}
	
}
