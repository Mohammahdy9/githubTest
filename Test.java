import java.util.Scanner;

public class Test{
	
	
	public static void main(String[] args) {
		
		String color;
		boolean filled;
		double width,radius;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("What shape is your object?: ");
		String shape=input.nextLine();	
		
		if(shape.toUpperCase().equals("SQUARE")) {
			//hello 
			
			System.out.println("What is the color of the square object?: ");
			color=input.nextLine();
			
			System.out.println("Is your square object filled?(true/false): ");
			filled = input.nextBoolean();
			
			System.out.println("What is the width of your square object?: ");
			width = input.nextDouble();
			
			Square s1 = new Square(color,filled,width);
			s1.calcArea();
			s1.printArea();
			s1.calcPerimeter();
			s1.printPerimeter();
			s1.getColor();
			s1.isFilled();
			System.out.println("\n------\n");	
			
		}
		else if (shape.toUpperCase().equals("CIRCLE")) {
			System.out.println("What is the color of the circle object?; ");
			color = input.nextLine();
			
			System.out.println("is your circle object filled?(true/false): ");
			filled = input.nextBoolean();
			
			System.out.println("What is the radius of your circle object?: ");
			radius = input.nextDouble();
			
			Circle c1 = new Circle(color,filled,radius);
			System.out.println("\n------\n");
			c1.calcArea();
			c1.printArea();
			c1.calcPerimeter();
			c1.printPerimeter();
			c1.getColor();
			c1.isFilled();
			System.out.println("\n------\n");	
		}
		else {
			System.out.println("Invalid shape name. Please type 'Square' or 'Circle'");
			System.exit(0);
		}	
	}
	}


