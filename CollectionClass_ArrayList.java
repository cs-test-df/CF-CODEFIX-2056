import java.util.ArrayList;
import java.util.Scanner;

public class CollectionClass_ArrayList {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter no of item to be entered in the Array List");
		int itemNo = scan.nextInt();
		// to use nextLine() after nextInt(),we need to use one extra nextLine()
		// as decimal part of previous int gets occupied by the nextInt(which is
		// simply blank space)
		System.out.println("Enter the item to be added to the ArrayList");
		scan.nextLine();
		while (itemNo > 0) {
			try {
				// to add items in the Arraylist
				al.add(scan.nextLine());
			} catch (Exception e) {
				System.out.println("Exception : " + e.getMessage());
			}
			itemNo--;
		}
		// print the Items of Array List
		for (String a : al) {
			System.out.println(a);
		}
		// add items at any particular index of the array list
		System.out.println("Enter String and Index to added new item in the ArrayList");
		try{
			String s =  scan.nextLine();
			int index = scan.nextInt();
		al.add(index,s);
		}
		catch(Exception e1){
			System.out.println("Exception :"+e1.getMessage());
		}
		//convert ArrayList into Array
		String alarray[] = new String[al.size()];
		alarray = al.toArray(alarray);
		for(String a : alarray){
			System.out.println(a);
		}
	}

}
