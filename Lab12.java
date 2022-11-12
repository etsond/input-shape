//Noah Greene

import java.util.Scanner;
public class Lab12 {
	static int circleNum = 1;
	static int rectangleNum = 1;
	static int triangleNum = 1;
	public static void main(String[] args){
		Scanner console = new Scanner(System.in);
		System.out.println("How many shapes do you want to create?");
		int numShapes = Integer.parseInt(console.nextLine());
		Shape[] myShapes = new Shape[numShapes+10];
		int index = 0;
		for (int j = 0; j < numShapes; j++){
			myShapes[j] = addNewShape(myShapes[j], console);
			index++;
		}
		int i = 0;
		while(i == 0){
			System.out.println("Select an option:");
			System.out.println("1. Display info for circles");
			System.out.println("2. Display info for rectangles");
			System.out.println("3. Display info for triangles");
			System.out.println("4. Add another shape");
			System.out.println("5. Exit");
			
			int choice = Integer.parseInt(console.nextLine());
			switch(choice){
			case 1: 
				for (int a = 0; a < index; a++){
					if (myShapes[a].isCircle){
						print(myShapes, a);
						circleNum++;
					}
				}
				circleNum = 1;
				break;
			case 2: 
				for (int a = 0; a < index; a++){
					if (myShapes[a].isRectangle){
						print(myShapes, a);
						rectangleNum++;
					}
				}
				rectangleNum = 1;
				break;
			case 3:
				for (int a = 0; a < index; a++){
					if (myShapes[a].isTriangle){
						print(myShapes, a);
						triangleNum++;
					}
				}
				triangleNum = 1;
				break;
			case 4: 
				myShapes[index] = addNewShape(myShapes[index], console);
				index++;
				break;
			case 5: 
				System.out.println("Good bye");
				System.exit(0);
			}
		}
		console.close();
	}
	public static Shape addNewShape(Shape s, Scanner console){
		System.out.println("What shape do you want to make (1=circle, 2=rectangle, 3=triangle)?");
		int choice = console.nextInt();
		console.nextLine();
		String colorChoice;
		switch(choice){
		
		case 1: System.out.println("What color is this circle?");
				colorChoice = console.nextLine();
				System.out.println("What's the radius?");
				int radiusChoice = Integer.parseInt(console.nextLine());
				System.out.print("");
				Circle newCircle = new Circle(colorChoice, radiusChoice);
				s = newCircle;
				break;
				
		case 2: System.out.println("What color is this rectangle?");
				colorChoice = console.nextLine();
				System.out.println("What's the height?");
				int recHeightChoice = Integer.parseInt(console.nextLine());
				System.out.println("What's the width?");
				int widthChoice = Integer.parseInt(console.nextLine());
				Rectangle newRec = new Rectangle(colorChoice, recHeightChoice, widthChoice);
				s = newRec;
				break;
				
		case 3: System.out.println("What color is this triangle?");
				colorChoice = console.nextLine();
				System.out.println("What's the height?");
				int triHeightChoice = Integer.parseInt(console.nextLine());
				System.out.println("What's the base?");
				int baseChoice = Integer.parseInt(console.nextLine());
				Triangle newTri = new Triangle(colorChoice, triHeightChoice, baseChoice);
				s = newTri;
				break;
		}
		return s;
	}
	public static void print(Shape myShapes[], int option){
		System.out.println("----------------------");
		if(myShapes[option].isCircle){
			System.out.println("Circle " + circleNum + "'s info:");
			System.out.println(myShapes[option].toString());
		}
		else if(myShapes[option].isRectangle){
			System.out.println("Rectangle " + rectangleNum + "'s info:");
			System.out.println(myShapes[option].toString());
		}
		else if(myShapes[option].isTriangle){
			System.out.println("Triangle " + triangleNum + "'s info:");
			System.out.println(myShapes[option].toString());
		}
		System.out.println("----------------------");
	}
}
