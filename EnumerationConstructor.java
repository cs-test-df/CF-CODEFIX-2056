
public class EnumerationConstructor {
	
	enum MyMarks{
		English(80),Maths(80),Physics(87),Chemistry(94),MultiMedia(70);
		
		private int  marks;
		//constructor
		MyMarks(int a){
			marks = a;
		}
		MyMarks(){
			marks = 0;
		}
		
		int getMarks(){
			return marks;
		}
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(MyMarks m : MyMarks.values()){
			System.out.println(" My Marks in "+ m+ " "+ m.getMarks());
		}

	}

}
