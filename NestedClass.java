
public class NestedClass {

	int outer_X;

	public NestedClass(int series) {
		outer_X = series;
	}

	public void displayFiboSeries() {
		InnerClass display = new InnerClass();
		display.fibonaci();
	}

	public void CannotDisplay() {

		// System.out.println("Try to display inner class member : " + display);
		// // this gives error
	}

	class InnerClass {
		private void fibonaci() {
			int sum = 0;
			String display = "Enclossing class doen not have access to member of nested class";
			int first = 0;
			int second = 1;
			System.out.print("Fibonaci Series for "+outer_X+ " : ");
			for (int x = 0; x <= outer_X; x++) {
				if (x <= 1) {
					if (x == 0) {
						System.out.print(0);
					} else {
						System.out.print("\t" + x);
					}
				} else {
					sum = first + second;
					first = second;
					second = sum;
					System.out.print("\t"+sum );
				}
			}
			System.out.println("");
		}

	}

	public static void main(String[] args) {

		NestedClass display = new NestedClass(0);
		NestedClass display1 = new NestedClass(1);
		NestedClass display2 = new NestedClass(9);
		NestedClass display3 = new NestedClass(15);
		display.displayFiboSeries();
		display1.displayFiboSeries();
		display2.displayFiboSeries();
		display3.displayFiboSeries();
		// InnerClass innerdisplay = new InnerClass(); this will give error
		// because inner class does not exist independently and its scope is
		// bounded by the enclossing class

	}

}
