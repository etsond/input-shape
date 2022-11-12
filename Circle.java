
//Etson Dorival

public class Circle extends Shape{
	private int radius;
	
	Circle(String color, int radius){
		this.color = color;
		this.radius = radius;
		isCircle = true;
	}
	public String toString(){
		StringBuilder circleString = new StringBuilder();
		circleString.append("Color: " + this.getColor() + "\n");
		circleString.append("Radius: " + this.radius + "\n");
		circleString.append("Area: " + this.calculateArea());
		return circleString.toString();
	}
	public double calculateArea(){
		double area;
		area = 3.14159 * this.radius * this.radius;
		return area;
	}
	
}
