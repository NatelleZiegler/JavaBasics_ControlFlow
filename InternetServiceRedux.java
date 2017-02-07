import java.util.*;
public class InternetServiceRedux {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = "";
		double addHours = 0; //for holding additional hours
		double addHoursPrice = 0; //total dollar charge for additional hours used
		double hours = 0; //hours of Internet used in total
		double total = 0; //total charge for month
		double potSavings = 0; //potential savings
		char plan = 'a';
		
		System.out.println("How many hours of Internet did you use this month?");
		hours = scan.nextDouble();
		scan.nextLine();
		
		while (hours < 0) {
			System.out.println("Please enter a valid number of hours.");
			hours = scan.nextDouble();
			scan.nextLine();
		}
		
		System.out.println("What plan do you have (please enter A, B, or C)?");
		input = scan.nextLine();
		plan = input.charAt(0);
		
		while (plan != 'A' && plan != 'a' && plan != 'B' && plan != 'b' && plan != 'C' && plan != 'c') {
			System.out.println("Please enter a valid Package (A, B, or C)");
			input = scan.nextLine();
			plan = input.charAt(0);
		}
		
		switch(plan) {
			case 'a':
			case 'A':
				if(hours > 10) {
					addHours = hours - 10;
					addHoursPrice = addHours * 2;
					total = 9.95 + addHoursPrice;
					System.out.printf("Your total is $%.2f", total);
					System.out.println();
				}
				
				else {
					total = 9.95;
					System.out.println("Your total is $" + total + ".");
				}
				
				//now let's calculate the potential savings
				
				if (hours > 20) {
					addHours = hours - 20;
					addHoursPrice = addHours;
					potSavings = 13.95 + addHoursPrice;
				}
				
				else {
					potSavings = 13.95;
				}
				
				if(potSavings < total) {
					double savingsB = 0;
					savingsB = total - potSavings;
					System.out.printf("You could save $%.2f if you switched to Package B.", savingsB);
					System.out.println();
				}
				
				potSavings = 19.95;
				
				if(potSavings < total) {
					double savingsC = 0;
					savingsC = total - potSavings;
					System.out.printf("You could save $%.2f if you switched to Package C.", savingsC);
					System.out.println();
				}
				
			break;
			
			case 'b':
			case 'B':
				if(hours > 20) {
					addHours = hours - 20;
					addHoursPrice = addHours;
					total = 13.95 + addHoursPrice;
					System.out.printf("Your total is $%.2f", total);
					System.out.println();
				}
				
				else {
					total = 13.95;
					System.out.println("Your total is $" + total + ".");
				}
				
				//now let's calculate potential savings
				
				potSavings = 19.95;
				
				if(potSavings < total) {
					double savingsCForB = 0;
					savingsCForB = total - potSavings;
					System.out.printf("You could save $%.2f if you switched to Package C.", savingsCForB);
					System.out.println();
				}
				
			break;
			
			case 'c':
			case 'C':
				total = 19.95;
				System.out.println("Your total is $" + total + ".");
				
				//now let's calculate potential savings
				
				if(hours < 20) {
					potSavings = 19.95 - 13.95;
					if(potSavings < total) {
						System.out.printf("You could save $%.2f if you switched to Package B.", potSavings);
						System.out.println();
					}
				}
					
				else if (hours > 20) {
					double savingsBForC = 0;
					addHours = hours - 20;
					total = 13.95 + addHoursPrice;
					savingsBForC = total - potSavings;
					if (savingsBForC < total) {
						System.out.printf("You could save $%.2f if you switched to Package B.", savingsBForC);
						System.out.println();
					}
				}
				
				if (hours < 10) {
					potSavings = 19.95 - 9.95;
					if (potSavings < total) {
						System.out.printf("You could save %.2f if you switched to Package A.", potSavings);
						System.out.println();
					}
				}
				
				else if (hours > 10) {
					double savingsAForC = 0;
					addHours = hours - 10;
					addHoursPrice = addHours * 2;
					total = 9.95 + addHoursPrice;
					savingsAForC = total - potSavings;
					if (savingsAForC < total) {
						System.out.printf("You could save $%.2f if you switched to Package A.", savingsAForC);
						System.out.println();
					}
				}
			break;
			
			default:
				System.out.println("Invalid input. Please enter A, B, or C.");
			break;
		} //close switch
	}
}