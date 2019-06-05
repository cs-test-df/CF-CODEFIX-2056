class SuperDispatch{
	
	void Display(){
		System.out.println("This is from SuperDispatch");
	}
}
class SubDispatch extends SuperDispatch{
	
	
	void Display(){
		System.out.println("This if from SubDispatch");
	}
}
class Sub_SubDispatch extends SuperDispatch{
	
	
	void Display(){
		System.out.println("This if from Sub_SubDispatch");
	}
}


public class DynamicMethodDispatch {

	public static void main(String[] args) {
	
		SuperDispatch one  =new SuperDispatch();
		SubDispatch two  =new SubDispatch();
		Sub_SubDispatch three = new Sub_SubDispatch();
		SuperDispatch referenceVariable;
		
		referenceVariable = one; // refer to the one object
		referenceVariable.Display();
		
		referenceVariable = two; // refer to the two object
		referenceVariable.Display();
		
		referenceVariable = three; // refer to the three object
		referenceVariable.Display();
		

	}

}
