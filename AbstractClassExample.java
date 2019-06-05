
abstract class SuperAbstract{
	
	void Display(){
		System.out.println("This is concrete method of the superclass");
	}
	abstract void show();
}

// if you do not implement the abstract method of the super class you must define the sub class as abstract
abstract class subAbstract extends SuperAbstract{
	
	  void showmeToo(){
		  System.out.println("This is concrete method of sub class ---> SubAbstract");
	  }
}

class sub_subAbstract extends subAbstract{
	
	void show(){
		System.out.println("This is the implementation of superclass abstract method");
	}
	void DisplayChild(){
		System.out.println("This is method of sub-sub Class");
	}
}

public class AbstractClassExample {

	public static void main(String[] args) {
		// SuperAbstract ob1 = new SuperAbstract(); object cannot be created for abstract method
		// subAbstract ob2 = new subAbstract();  object cannot be created as subAbstract is abstract class
		sub_subAbstract ob3 = new sub_subAbstract();
		ob3.Display(); // concrete method of super class
		ob3.showmeToo();
		ob3.show(); // implementation of the abstract method
		
		SuperAbstract ob1;  // object reference variable of Abstract class can be created
		ob1 = ob3;
		ob1.Display();
		ob1.show();
		
		 subAbstract ob2;
		 ob2 = ob3;
		 ob2.Display();
		 ob2.show();
		 ob2.showmeToo();
		
	}

}
