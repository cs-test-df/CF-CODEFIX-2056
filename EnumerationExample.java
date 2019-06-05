
public class EnumerationExample {

	enum workLocation{
		Pune,Mumbai,Hyderabad,Bangalore,Chennai,Kolkata
	}
	
	public static void main(String[] args) {
		
		workLocation work;
		System.out.print("Work Locations are : ");
		for(workLocation w : workLocation.values()){
			
			System.out.print(" "+w+" ");
		}
		System.out.println();
		work = workLocation.Kolkata;
		System.out.println("My current Location :" + work);
		
		work = workLocation.valueOf("Pune");
		System.out.println("Prefered WorkLocation : "+work);

	}

}
