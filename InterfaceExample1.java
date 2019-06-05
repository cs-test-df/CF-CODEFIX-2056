
interface Data{
	
	int x = 100; // variable are always static and final
	
	// private modifiers are not allowed 
	/*private void Display(){
		
	}*/
	
	public void Display();
}

class Class1 implements Data{
	
	//interface implementation
	public void Display(){
		System.out.println("Implementation of Data interface . Value from Interface : "+ x);
	}
	// class' own method
	public void ClassDisplay(){
		System.out.println("This method is of the Class");
	}
	
}
public class InterfaceExample1 {

	public static void main(String[] args) {
	Class1 ob = new Class1();
	ob.Display(); // implemented method
	
	ob.ClassDisplay();   //class method

	}

}
