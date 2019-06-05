


public class ExceptionThrowsExample1 {
	
	
	// following method throws an exception is not handled 
	/*public static void UnhandledException(){
		System.out.println("This methods throw  exception,but is not handled");
		throw new IllegalAccessException("Exception thrown in UnhandledException method");
	}*/
	
	public static void HandledException() throws NullPointerException{
		throw new NullPointerException("This method is handled");
	}

	public static void main(String[] args) {
		
		/*try{
		UnhandledException();
		}
		catch(IllegalAccessException e){
			System.out.println("Exception handled "+ e);
		}
*/
		// HandledException();  since no try-catch block is used, default exception handler halts the program and prints the stack trace. 
	
		try{
			HandledException();
		}
		catch (Exception e) {
			System.out.println("Exception: "+ e);
		}
		
	}

}
