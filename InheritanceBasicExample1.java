
public class InheritanceBasicExample1 {
	public static void main(String[] args) {
		Superclass ob1 = new Superclass();
		SubClass ob2 = new SubClass();
		ob1.a = 100;
		ob1.b = 200;
		ob1.s = "Super";
		ob1.Display();
		ob1.Sum();
		ob2.a = 350;  // superclass member
		ob2.b = 500;    // superclass member
		ob2.c = 620;
		ob2.s = "Sub";
		ob2.Display();
		ob2.sum();
		ob2.Check();   // superclass member
		ob2.Display1();
	}

}

 class Superclass{
	String s;
	int a,b;
	void Display(){
		System.out.println("This is "+s+"Class");
	}
	void Sum(){
		System.err.println("Sum of a and b: "+(a+b));
	}
	void Check(){
		System.out.println("Method of Superclass");
	}
}
 // SunClass is inheriting Superclass
 class SubClass extends Superclass{
	 int c;
	 void Display(){
		 
		 System.out.println("This extends "+ s + " class");
	 }
	 void sum(){
		 System.out.println("Sum of a b and c is : "+ (a+b+c));
	 }
	 void Display1(){
		 System.out.println("Method od subclass");
	 }
	 
 }
