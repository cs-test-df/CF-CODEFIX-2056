final class SuperFinal{
	
	int x ;
	int y;
	public SuperFinal(int x,int y) {
		this.x = x;
		this.y =y;
	}
	
	void AddSuperFinal(){
		System.out.println("Sum of x an y :" + (x+y));
	}
}

// Final class cannot be inherited
/*class subSuper extends SuperFinal{
	
}
*/

class SuperFinal1{
	final int x = 100;
	int y;
	int z;
	public SuperFinal1(int a ,int b) {
	 //  x = a; this is invalid because x has already been made final and cannot be changed as it is constant
		y =a;
		z = b;
	}
	final void sumFinal(){
		System.out.println("This is final method. Sum is :" + (x+y+z));
	}
}
class subsubFinal1 extends SuperFinal1{
	
	int a;
	public subsubFinal1(int i,int j,int k) {
		super(i, j);
		a = k;
	}
	// this is invalid as final method of super class  cannot be overridden
	/*void sumFinal(){
		
	}*/
	void sum(){
		System.out.println("Sum: "+(y+z+a+x));
		
	}
	
}




public class FinalKeywordExample {

	public static void main(String[] args) {
		SuperFinal ob1 = new SuperFinal(90, 100);
		SuperFinal1 ob2 = new SuperFinal1(20, 30);
		subsubFinal1 ob3 = new subsubFinal1(30, 65, 63);
		ob1.AddSuperFinal();
		ob2.sumFinal();
		ob3.sum();
		ob3.sumFinal();

	}

}
