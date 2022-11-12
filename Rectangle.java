//Noah Greene
//Etson Dorival

public class Rectangle extends Shape{
	private int height;
	private int width;

	Rectangle(String color, int height, int width){
		this.color = color;
		this.height = height;
		this.width = width;
		isRectangle = true;
	}
	public String toString(){
		StringBuilder rectangleString = new StringBuilder();
		rectangleString.append("Color: " + this.getColor() + "\n");
		rectangleString.append("Height: " + this.height + "\n");
		rectangleString.append("Width: " + this.width + "\n");
		rectangleString.append("Area: " + this.calculateArea());
		return rectangleString.toString();
	}
	public double calculateArea(){
		double area;
		area = this.height * this.width;
		return area;
	}
}
