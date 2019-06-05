
public class StaticUse {

	public static void main(String[] args) {
		meth(10);
		StaticDemo.callme(); // static method called using classname
		// Static variables called using classname
		int aa = StaticDemo.a;
		int bb = StaticDemo.b;
		System.out.println("sum = " +  (aa+bb));
	}

	// Static Variable
	static int a = 3;
	static int b;
	int c =10;

	// Static Method
	static void meth(int x) {
		System.out.println("x = " + x);
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		//Non Static Variable can not be used
		//System.out.println("c = " + c);
	}

	// Static Block
	static {
		System.out.println("Static block initialized.");
		b = a * 4;
		// non static variable can not be used directly
		// c++;   
	}

}

class StaticDemo {   
	static int a = 42;   
	static int b = 99; 

static void callme() {     
	System.out.println("a = " + a);  
	} 
} 
