import java.util.*;
public class SpeedOfSound {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = ""; //for storing user input
		double distance = 0; //for storing distance traveled
		System.out.println("Enter the distance (in feet) your sound wave will travel.");
		distance = scan.nextDouble();
		scan.nextLine();
		
		System.out.println("Is your sound wave traveling through air, water, or steel?");
		input = scan.nextLine();
		double time = 0;
		
		switch(input) {
			case "air":
				time = distance / 1100;
				System.out.printf("It will take your sound wave %.2f seconds to travel %.2f feet through the air.\n", time, distance);
			break;
			case "water":
				time = distance / 4900;
				System.out.printf("It will take your sound wave %.2f seconds to travel %.2f  feet through water.\n", time, distance);
			break;
			case "steel":
				time = distance / 16400;
				System.out.printf("It will take your sound wave %.2f seconds to travel %.2f feet through steel.\n", time, distance);
			break;
			default:
				System.out.println("Invalid input.");
			break;
		}
	}
}