import java.util.*;

public class TimeCalc {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double input = 0;
		
		System.out.println("Please enter a number of seconds.");
		input = scan.nextDouble();
		scan.nextLine();
		
		if(input >= 60 && input < 3600) {
			double minutes = 0;
			minutes = input / 60;
			System.out.println("There are " + minutes + " minutes in the seconds you entered.");
		}
		
		else if (input >= 3600 && input < 86400) {
			double hours = 0;
			hours = input / 3600;
			System.out.println("There are " + hours + " hours in the seconds you entered.");
		}
		
		else if (input >= 86400) {
			double days = 0;
			days = input / 86400;
			System.out.println("There are " + days + " days in the seconds you inputed.");
		}
		
		else {
			System.out.println("You entered " + input + " seconds.");
		}
	}
}