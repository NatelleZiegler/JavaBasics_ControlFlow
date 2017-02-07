import java.util.*;
public class InternetService {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = ""; //for grabbing user input
		double addHours = 0;
		double addHoursPrice = 0;
		double hours = 0;
		double total = 0;
		char plan = 'a';
		
		System.out.println("How many hours did you use the Internet this month?");
		hours = scan.nextDouble();
		scan.nextLine();
		
		System.out.println("What plan do you have? Please enter A, B, or C.");
		input = scan.nextLine();
		plan = input.charAt(0);
		
		switch(plan) {
			case 'a':
			case 'A':
				if(hours > 10) {
					addHours = hours - 10;
					addHoursPrice = addHours * 2;
					total = 9.95 + addHoursPrice;
					System.out.printf("Your total is $%.2f.\n", total);
				}
				else {
					total = 9.95;
					System.out.println("Your total is $" + total + ".");
				}
			break;
			case 'b':
			case 'B':
				if(hours > 20) {
					addHours = hours - 20;
					addHoursPrice = addHours;
					total = 13.95 + addHoursPrice;
					System.out.printf("Your total is $%.2f.\n", total);
				}
				else {
					total = 13.95;
					System.out.println("Your total is $" + total + ".");
				}
			break;
			case 'c':
			case 'C':
				total = 19.95;
				System.out.println("Your total is $" + total + ".");
			break;
			default:
				System.out.println("Please enter A, B, or C.");
			break;
		}
	}
}