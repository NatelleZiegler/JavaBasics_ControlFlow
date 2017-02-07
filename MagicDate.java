import java.util.*;
public class MagicDate {
	public static void main(String[] args) {
		int month = 0;
		int day = 0;
		int year = 0;
		int monthDay = 0; //to place the value of the month times the day
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the number of a month (1-12)");
		month = scan.nextInt();
		scan.nextLine();
		
		System.out.println("Enter a day in the month.");
		day = scan.nextInt();
		scan.nextLine();
		
		System.out.println("Enter a two digit year (19--)");
		year = scan.nextInt();
		scan.nextLine();
		
		monthDay = month * day;
		
		if(monthDay == year) {
			System.out.println("This date is magic!");
		}
		else {
			System.out.println("This date is not magic.");
		}
	}
}