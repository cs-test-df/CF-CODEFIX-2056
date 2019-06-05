
class Super_A{
	int i;
	public Super_A(int x) {
		i =x;
	}
	void Display(){
		System.out.println("Value of i : "+i);
	}
}
class Sub_B extends Super_A{
	int j;
	public Sub_B(int x , int y) {
		super(x);
		j=y;
		}
		void Area_rect(){
			System.out.println("Area of Rectangle: "+(i*j));
		}
}
class Sub_Sub_c extends Sub_B{
	int k;
	public Sub_Sub_c(int x,int y,int z) {
		super(x,y);
		k=z;
		
	}
	void Area_Cuboid(){
		System.out.println("Area of Cuboid: "+ (i*j*k));
	}
	
}


public class MultiLevelHierarchy {

	public static void main(String[] args) {
		Super_A ob1 = new Super_A(15);
		Sub_B ob2 = new Sub_B(56, 95);
		Sub_Sub_c ob3 = new Sub_Sub_c(92, 56, 89);
		ob1.Display();
		ob2.Display();// sub class access superclass
		ob3.Display(); // sub class access superclass--->superclass method
		ob2.Area_rect();
		ob3.Area_rect(); // sub class access super class method
		ob3.Area_Cuboid();

	}

}
