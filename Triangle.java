
//Etson Dorival

public class Triangle extends Shape{
	private int base;
	private int height;

	Triangle(String color, int height, int base){
		this.color = color;
		this.height = height;
		this.base = base;
		isTriangle = true;
	}
	public String toString(){
		StringBuilder triangleString = new StringBuilder();
		triangleString.append("Color: " + this.getColor() + "\n");
		triangleString.append("Height: " + this.height + "\n");
		triangleString.append("Base: " + this.base + "\n");
		triangleString.append("Area: " + this.calculateArea());
		return triangleString.toString();
	}
	public double calculateArea(){
		double area;
		area = 0.5 * base * height;
		return area;
	}

}
