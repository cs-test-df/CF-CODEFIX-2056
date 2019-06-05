


public class ExceptionChainedExceptiom {
	
	public static void ChainedExceptionMethod() throws NullPointerException{
		
		//create throwable object
		NullPointerException e  =  new NullPointerException("This is Excption");
		
		e.initCause(new ArrayIndexOutOfBoundsException("This is cause for the exception"));
		throw e;
	}
	public static void ChainedExc(){
		// create Throwable object
		NullPointerException e = new NullPointerException("This is Excption");
		
		// cause for the exception
		e.initCause(new ArithmeticException("This is cause for the exception"));
		throw e;
	}

	public static void main(String[] args) {
		try{
		ChainedExceptionMethod();
		}catch(Exception e){
			System.out.println("Exception Caught "+e.getCause());
		}
		try{
		ChainedExc();}
		catch(Exception e){
			System.out.println("Exception Caught "+ e.getCause());
		}
		

	}

}
