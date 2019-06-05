
class Class2 implements Data{
	public void Display(){
		System.out.println("This is another version of Data Interface implementation");
	}
}

public class InterfaceExample2 {

	public static void main(String[] args) {
	Data intfacevar = new Class1(); // interface type variable reference
	intfacevar.Display(); // accessing Interface implementation using interface variable
	
	/*intfacevar.ClassDisplay();*/ // interface variable and only access its implementation as t has no knowledge 
	                               // its class where its implementation is (just like superclass has no
								// knowledge of subclass methods
	
	Class2 obj = new Class2();
	intfacevar = obj; // interface reference variable refer to Class2 object
	intfacevar.Display();
	}

}
