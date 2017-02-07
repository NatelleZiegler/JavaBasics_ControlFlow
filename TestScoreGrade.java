import java.util.*;
public class TestScoreGrade {
	public static void main(String[] args) {
		int testA = 0;
		int testB = 0;
		int testC = 0;
		int average = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter the first test score.");
		testA = scan.nextInt();
		scan.nextLine();
		
		System.out.println("Please enter the second test score.");
		testB = scan.nextInt();
		scan.nextLine();
		
		System.out.println("Please enter the third test score.");
		testC = scan.nextInt();
		scan.nextLine();
		
		average = (testA + testB + testC) / 3;
		
		System.out.println("The average test score was " + average);
		
		//now let's test what letter grade the average is
		
		if (average >= 90 && average <= 100) {
			System.out.println("The class average was an A.");
		}
		else if (average >=80 && average <= 89) {
			System.out.println("The class average is a B.");
		}
		else if (average >= 70 && average <= 79) {
			System.out.println("The class average is a C.");
		}
		else if (average >= 60 && average <= 69) {
			System.out.println("The class average is a D.");
		}
		else {
			System.out.println("The class average was an F.");
		}
	}
}