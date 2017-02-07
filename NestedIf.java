import java.util.*;

public class NestedIf {
	public static void main(String[] args) {
	int amount1 = 0;
	int amount2 = 0;
	Scanner scan = new Scanner(System.in);	
	
	System.out.println("Please enter a number.");
	amount1 = scan.nextInt();
	scan.nextLine();
	System.out.println("Please enter another number.");
	amount2 = scan.nextInt();
	scan.nextLine();
	
		if (amount1 > 10) {
			if (amount2 > 100) {
				if (amount1 > amount2) {
					System.out.println("Amount one was the greater value at " + amount1);
				}
				else {
					System.out.println("Amount two was the greater value at " + amount2);
				}
			}
		}
	}
}