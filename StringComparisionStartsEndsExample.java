import java.util.Scanner;

public class StringComparisionStartsEndsExample {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your first string");
		String s1=scan.nextLine();
		System.out.println("Enter your second String");
		String s2= scan.nextLine();
		System.out.println("Comparing start of the string s1");
		if(s1.startsWith(s2,7)){
			System.out.println("String starts with same string");
		}
		else{
			System.out.println("String does not starts with same string");
		}
		System.out.println("Comparing start of the string s1");
		if(s1.endsWith(s2)){
			System.out.println("String starts with same string");
		}
		else{
			System.out.println("String does not starts with same string");
		}

	}

}
