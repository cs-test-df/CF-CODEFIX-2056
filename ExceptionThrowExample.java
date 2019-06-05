
public class ExceptionThrowExample {
	
	 void ThrowException(){
		try{
			throw new NullPointerException("Exception Thrown Explicitly"); //exception thrown explicitly with message to be displayed is entered 
		}
		catch(NullPointerException e){
			System.out.println("Exception caught in ThrowException method "+ e);
			throw e;
		}
		
	}
	
	

	public static void main(String[] args) {
		ExceptionThrowExample ob = new ExceptionThrowExample();
		try{
			ob.ThrowException(); 
		}catch(Exception e1){
			System.out.println("Rethrown Exception Caught : "+e1);
		}

	}

}
