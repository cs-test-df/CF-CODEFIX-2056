import java.util.Scanner;

public class StringClassComprision {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter first string");
		String str1 = scan.nextLine();
		System.out.println("Enter second String");
		String str2 = scan.nextLine();

		// string comparison
		System.out.println("Equals Method");
		if (str1.equals(str2)) {
			System.out.println("Both Strings are same");

		} else {
			System.out.println("String not same");
		}
		// string comparison ignore case
		System.out.println("Ignore Case");
		if (str1.equalsIgnoreCase(str2)) {
			System.out.println("Both Strings are same");

		} else {
			System.out.println("String not same");
		}
		
		//regionMatches()
		System.out.println("Please enter first string");
		String str3 = scan.nextLine();
		System.out.println("Enter second String");
		String str4 = scan.nextLine();
		System.out.println("Region Match -- Case Sensitive");
		if(str3.regionMatches(5, str4, 0, 6)){
			System.out.println("Regions Matches");
		}
		else{
			System.out.println("Regions not Matches");
		}
		System.out.println("Regions Matches -- Igonre Case");
		if(str3.regionMatches(true,5, str4, 0, 6)){
			System.out.println("Regions Matches");
		}
		else{
			System.out.println("Regions not Matches");
		}
	}

}
