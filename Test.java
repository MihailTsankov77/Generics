package First;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GenericStack<Double> a = new GenericStack<>();
		a.push(64444.5);
		a.push(10.0);
		a.push(9.5);
		a.push(8.0);
		a.push(7.5);
		a.push(6.0);
		a.push(5.5);
		a.push(4.0);
		while(!a.isEmpty()) {
			System.out.println( a.pop());
		}
		
	}

}
