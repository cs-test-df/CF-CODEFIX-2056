class constA{
	public constA() {
		System.out.println("This is constructor of ConstA class");
	}
}
class constB extends constA{
	public constB() {
		System.out.println("This is constructor of ConstB class");
	}
}

class constC extends constB{
	public constC() {
		System.out.println("This is constructor of ConstC class");
	}
}


public class ConstructorExecutionSequence {

	public static void main(String[] args) {
		constC ob1 = new constC();

	}

}
