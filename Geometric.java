
public class Geometric {
	
	protected double perimeter,area;
	private boolean filled;
	private String color = "";
	
	
	public Geometric() {}
	
	public Geometric(String color,boolean filled) { 
		this.setColor(color);
		this.setFilled(filled);	
	}

	public boolean isFilled() {
		System.out.println("Filled?: "+filled);
		return filled;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	public String getColor() {
		System.out.println("Color: "+color);
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public void printPerimeter() {
		System.out.println("Perimeter of object: "+perimeter);
	}
	
	public void printArea() {
		System.out.println("Area of object: "+area);
		
	}
}
