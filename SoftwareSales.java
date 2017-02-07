import java.util.*;
public class SoftwareSales {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double packages = 0; //to store number purchased
		final double PRICE = 99; //price of one package
		double totalDiscount = 0;
		double discount = 0; //to store the percent discount offered
		double total = 0;
		
		System.out.println("How many packages did you purchase?");
		packages = scan.nextDouble();
		scan.nextLine();
		
		if(packages >= 10 && packages < 20) {
			discount = .2;
		}
		else if(packages >= 20 && packages < 50) {
			discount = .3;
		}
		else if(packages >= 50 && packages < 100) {
			discount = .4;
		}
		else if (packages >= 100) {
			discount = .5;
		}
		else {
			discount = 0;
		}
		
		System.out.println("Your discount is " + (discount * 100) + "%");
		totalDiscount = (PRICE * packages) * discount;
		total = (PRICE * packages) - totalDiscount;
		System.out.printf("Your total is %,.2f", total);
		System.out.println();
	}
}