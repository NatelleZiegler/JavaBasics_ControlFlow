import java.util.*;
public class BookClub {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input = 0;
		int points = 0;
		
		System.out.println("How many books did you purchase this month?");
		input = scan.nextInt();
		scan.nextLine();
		
		if (input < 0) {
			System.out.println("Please enter a number greater than or equal to zero.");
			System.exit(0);
		}
		
		switch(input) {
			case 0:
				points = 0;
			break;
			case 1:
				points = 5;
			break;
			case 2:
				points = 15;
			break;
			case 3:
				points = 30;
			break;
			case 4:
			default:
				points = 60;
			break;
		} //end of switch statement
		
		System.out.println("You have earned " + points + " points this month.");
	}
}