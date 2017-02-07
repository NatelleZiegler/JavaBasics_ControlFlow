import java.util.*;
public class Shipping {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		final int MILES = 500; //since rate is by every 500 mi
		int weight = 0; //for storing product's weight
		double total = 0; //total cost of shipping
		int mileTotal = 0; //for number of miles shipped
		int milesMultiplier = 0;
		double rate = 0.0;
		
		System.out.println("Please enter the weight of the package."); //grabbing the weight of the package from the user
		weight = scan.nextInt();
		scan.nextLine();
					
		if (weight <= 2 && weight > 0) { //if-else to determine rate per 500 miles
			rate = 1.10;
		}
		else if (weight > 2 && weight < 6) {
			rate = 2.20;
		}
		else if (weight > 6 && weight < 10) {
			rate = 3.70;
		}
		else if (weight > 10) { 
			rate = 3.80;
		}
		else {
			System.out.println("Please enter a valid number.");
			System.exit(0);
		}
		
		System.out.println("Enter the number of miles the package is traveling."); //grabbing the number of miles traveled from the user
		mileTotal = scan.nextInt();
		scan.nextLine();
		
		milesMultiplier = mileTotal / MILES;
		total = rate * milesMultiplier;
		System.out.printf("Your total is $%.2f", total);
		System.out.println();
		
		}
	}