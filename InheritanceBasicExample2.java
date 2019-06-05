
class SuperClassA{
	int a ;
	 int b;
	
	 SuperClassA(int length, int breadth){
		 a = length;
		 b = breadth;
		
	}
	 SuperClassA(){
		 a =-1;
		 b=-1;
	 }
	 void area_rectangle(){
		 System.out.println("Area of Rectangle :"+(a*b ));
	 }
}

class SubClassB extends SuperClassA{
	int h;
	SubClassB(int x,int y ,int z){
		a = x; // this is from parent class
		h = z;
		b= y;
		
		// b= width; not accessible as it is private to super class
	}
	SubClassB(){
		a = -1;
		h = -1;
		b = -1;
	
	}
	void area_Square(){
		System.out.println("Area of Square :"+(a*a));
	}
	void area_Cuboid(){
		System.out.println("Area of Cuboid :"+(a*h*b));
	}
	
}


public class InheritanceBasicExample2 {

	public static void main(String[] args) {
		SuperClassA ob = new SuperClassA();
		SubClassB ob1 = new SubClassB();
		SubClassB ob2 = new SubClassB(12,23,34);
		System.out.println("Value of a when constructor with no parameter called "+ob1.a);
		System.out.println("Value of a when constructor with  parameter called "+ob2.a);
		System.out.println("Value of h when constructor with no parameter called "+ob1.h);
		System.out.println("Value of h when constructor with  parameter called "+ob2.h);
		System.out.println("Value of b when constructor with no parameter called : "+ob1.b);
		System.out.println("Value of b when constructor with  parameter called "+ob2.b);
		
ob1.area_rectangle();
ob1.area_Square();
ob1.area_Cuboid();

ob2.area_rectangle();
ob2.area_Square();
ob2.area_Cuboid();
	}

}
