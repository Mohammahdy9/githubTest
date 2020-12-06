
public class Circle extends Geometric{
 
	private double radius;
	
	public Circle() {}
	
	public Circle(String color,boolean filled, double radius) {
		super(color,filled);
		this.radius=radius;
	}
	
	public void calcPerimeter() {
		
		perimeter=(2*3.14*radius);// hello
		
	}
	
	public void calcArea() {
		
		area = (3.14*(radius*radius));
	}
}
