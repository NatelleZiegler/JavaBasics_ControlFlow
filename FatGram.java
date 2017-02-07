import java.util.*;
public class FatGram {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double calories = 0; //for storing number of calories
		double fatGrams = 0; //for storing number of fat grams 
		double percentFat = 0;
		final int NUM_CALORIES = 9;
		
		System.out.println("Enter the number of calories in your food item.");
		calories = scan.nextDouble();
		scan.nextLine();
		
		System.out.println("Enter the number of fat grams in your food item.");
		fatGrams = scan.nextDouble();
		scan.nextLine();
		
		double calFat = 0; //used to store number of calories from fat so we can more easily calculate fat percentage
		calFat = fatGrams * NUM_CALORIES;
		percentFat = calFat / calories;
		
		if(percentFat <= .3) {
			percentFat = percentFat *100;
			System.out.printf("Your food item contains %.2f", percentFat);
			System.out.println("%" + " fat.");
			System.out.println("This is a low fat food item.");
		}
		else if(percentFat >= 1) {
			System.out.println("Error. Please check input is correct and try again.");
		}
		else {
			percentFat = percentFat *100;
			System.out.printf("Your food item contains %.2f", percentFat);
			System.out.println("%" + " fat.");
		}
		
	}
}