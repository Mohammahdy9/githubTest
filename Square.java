
public class Square extends Geometric {

	private double width;
	
	public Square() {}
	
	public Square(String color,boolean filled, double width) {
		super(color,filled);
		this.width=width;	
	}
	
	public void calcPerimeter() {
		perimeter= width*4;
		
		
	}
	
	public void calcArea() {
		area=width*width;
		
	}


}

	

