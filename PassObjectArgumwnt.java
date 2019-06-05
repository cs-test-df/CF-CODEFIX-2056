
public class PassObjectArgumwnt {

	int a, b;

	PassObjectArgumwnt(int i, int j) {
		a = i;
		b = j;
	}

	// return true if o is equal to the invoking object
	boolean equalTo(PassObjectArgumwnt obj) {

		if (obj.a == a && obj.b == b)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {

		PassObjectArgumwnt ob1 = new PassObjectArgumwnt(100, 22);
		PassObjectArgumwnt ob2 = new PassObjectArgumwnt(100, 22);
		PassObjectArgumwnt ob3 = new PassObjectArgumwnt(-1, -1);

		System.out.println("ob1 == ob2: " + ob1.equalTo(ob2));
		System.out.println("ob1 == ob3: " + ob1.equalTo(ob3));
	}

}
