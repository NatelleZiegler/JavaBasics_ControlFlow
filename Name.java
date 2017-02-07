import java.util.*;
public class Name {
	public static void main(String[] args) {
		String nameA = "";
		String nameB = "";
		String nameC = "";
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter a name.");
		nameA = scan.nextLine();
		
		System.out.println("Please enter another name.");
		nameB = scan.nextLine();
		
		System.out.println("Please enter a third name.");
		nameC = scan.nextLine();
		
		if(nameA.compareTo(nameB) < 0) {
			if(nameA.compareTo(nameC) < 0) {
				if(nameB.compareTo(nameC) < 0) {
					System.out.println(nameA + " " + nameB + " " + nameC);
				}
				else if(nameC.compareTo(nameB) < 0) {
					System.out.println(nameA + " " + nameC + " " + nameB);
				} 
			}
			else if(nameC.compareTo(nameA) < 0) {
				System.out.println(nameC + " " + nameA + " " + nameB);
			}
		}
		else if(nameA.compareTo(nameB) > 0) {
			if(nameA.compareTo(nameC) < 0) {
				System.out.println(nameB + " " + nameA + " " + nameC);
			}
		}
		else if(nameC.compareTo(nameA) < 0) {
			if(nameB.compareTo(nameC) < 0) {
				System.out.println(nameB + " " + nameC + " " + nameA);
			}
			
			else if(nameC.compareTo(nameB) < 0) {
				System.out.println(nameC + " " + nameB + " " + nameA);
			}	
		}
	}
}