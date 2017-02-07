import java.util.*;
public class BMI {
	public static void main(String[] args) {
		final double CONSTANT = 703;
		double bmi = 0;
		double weight = 0;
		double height = 0;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter your weight(in pounds).");
		weight = scan.nextDouble();
		scan.nextLine();
		
		System.out.println("Please enter your height (in inches).");
		height = scan.nextDouble();
		scan.nextLine();
		
		bmi = weight * CONSTANT/(height*height);
		System.out.println("Your BMI is " + bmi);
		
		if(bmi > 18.5 && bmi < 25) {
			System.out.println("You are at an optimal body weight.");
		}
		else if (bmi < 18.5) {
			System.out.println("You are underweight.");
		}
		else {
			System.out.println("You are overweight.");
		}
	}
}