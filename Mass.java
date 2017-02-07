import java.util.*;
public class Mass {
	public static void main(String[] args) {
		double mass = 0;
		double weight = 0;
		final double CONSTANT = 9.8;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter the object's mass.");
		mass = scan.nextDouble();
		scan.nextLine();
		
		weight = mass * CONSTANT;
		
		if (weight > 1000) {
			System.out.println("This is too heavy!");
		}
		else if (weight < 10) {
			System.out.println("This is too light!");
		}
		else {
			System.out.println("This is just right.");
		}
	}
}