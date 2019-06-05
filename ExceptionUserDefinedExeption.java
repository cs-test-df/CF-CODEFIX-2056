class MyException extends Exception{
	
	String error ;
	MyException(String x){
		error = x;
	}
	
	public String toString(){
		return "Excption " + error + " thrown";
	}
}

class UserDefinedExceptionHandling{
	
	 void MethodWithException() throws MyException{
		System.out.println("User defined exception is thrown");
		throw new MyException("Check Exception");
	}
}

public class ExceptionUserDefinedExeption {

	public static void main(String[] args) {
	
		UserDefinedExceptionHandling ob = new UserDefinedExceptionHandling();
		try{
			ob.MethodWithException();
		}
		catch(MyException e){
			System.out.println(e);
		}
		

	}

}
