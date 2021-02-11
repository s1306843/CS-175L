import java.util.Scanner;

public class housePainting_Code {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int lengthNumber = 0;
		int widthNumber = 0;
		int heightNumber = 0;
		
		int windowNumber = 0;
		int windowLength = 0;
		int windowWidth = 0;
		int doorNumber = 0;
		int doorLength = 0;
		int doorWidth = 0;
		
		double costpersqft = 0;
		double sqftTotal = 0; 
		double costTotal = 0;
		
		System.out.println("Please enter the cost to paint 1 square foot: ");
		costpersqft = in.nextDouble();
		
		System.out.println("Please enter the length of the house: ");
		lengthNumber = in.nextInt();
		System.out.println("Please enter the width of the house: ");
		widthNumber = in.nextInt();
		System.out.println("Please enter the height of the house: ");
		heightNumber = in.nextInt();
		
		System.out.println("Please enter the number of windows: ");
		windowNumber = in.nextInt();
		System.out.println("Please enter the length of each window: ");
		windowLength = in.nextInt();
		System.out.println("Please enter the width of each window: ");
		windowWidth = in.nextInt();
		
		System.out.println("Please enter the number of doors: ");
		doorNumber = in.nextInt();
		System.out.println("Please enter the length of each door: ");
		doorLength = in.nextInt();
		System.out.println("Please enter the width of each door: ");
		doorWidth = in.nextInt();
		
		
		sqftTotal = ((4*(lengthNumber*widthNumber)) + (lengthNumber*(heightNumber - widthNumber))) - ((windowNumber*(windowLength*windowWidth)) + (doorNumber*(doorLength*doorWidth)));
		costTotal = sqftTotal*costpersqft;
		
		System.out.print("Your total cost to paint is " + sqftTotal + " sqft: $" + costTotal);
	}

}
