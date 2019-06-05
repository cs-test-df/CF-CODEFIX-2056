class Superclass3{
	int a,b,c;
	
	public Superclass3(int x,int y, int z) {
		a =x;
		b = y;
		c = z;
	}
	public Superclass3(){
		a=b=c=0;
	}
	void actionSuper(){
		System.out.println("Add : "+(a+b+c));
	}
}
class Subclass3 extends Superclass3{
	public Subclass3(int x,int y, int xx) {
		a=x;
		b=y;
		c=xx;
	}
	void actionAdd(){
		System.out.println("Add : "+(a+b+c));
	}
	
}



public class InheritanceBasicExample3 {

	public static void main(String[] args) {
		Superclass3 ob1 = new Superclass3();
		Subclass3 ob2 = new Subclass3(50,15,25);
		ob1.actionSuper();
		System.out.println("Value of a : " + ob1.a);
		System.out.println("Value of b : " + ob1.b);
		System.out.println("Value of c : " + ob1.c);
		
		// reference of superclass assigned to subclass reference
		ob1 = ob2 ;
		// now ob1 refres to ob2
		
		ob1.actionSuper();
		System.out.println("Value of a : " + ob1.a);
		System.out.println("Value of b : " + ob1.b);
		System.out.println("Value of c : " + ob1.c);

	}

}
