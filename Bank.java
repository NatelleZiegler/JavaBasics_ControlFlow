import java.util.*;
public class Bank {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		final double BASE_FEE = 10;
		double numChecks = 0;
		double total = 0;
		double checkTotal = 0;
		
		System.out.println("How many checks did you write this month?");
		numChecks = scan.nextDouble();
		scan.nextLine();
		
		if(numChecks < 20) {
			checkTotal = numChecks * .10;
		}
		else if(numChecks >= 20 && numChecks < 40) {
			checkTotal = numChecks * .08;
		}
		else if(numChecks >= 40 && numChecks < 60) {
			checkTotal = numChecks * .06;
		}
		else if(numChecks >= 60) {
			checkTotal = numChecks * .04;
		}
		else {
			System.out.println("Please enter a valid number of checks.");
		}
		
		total = checkTotal + BASE_FEE;
		System.out.printf("Your total service fees for this month are $%.2f", total);
		System.out.println();
	}
}