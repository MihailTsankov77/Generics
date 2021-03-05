package First;

public class GenericStack <E> {
	
	 E[] arr = (E[]) new Object [3];
	 int max = 3;
	 int br = 0;

	public GenericStack() {
		
	}
	
	public int getSize() {
		return arr.length;
	}

	public E peek() {
		return arr[br-1];
	}

	public void push(E o) {

		if(br==max) {
			expandArr();
		}
		arr[br] = o;
		br++;
	}
	
	public void expandArr() {
		max*=2;
		E[] temp = (E[]) new Object[max];
		System.arraycopy(arr, 0, temp, 0, arr.length);

	    arr = temp;
	}

	public E pop() {
		if(!isEmpty()) {
			E o = peek();
			arr[--br]=null;
			return o;
		}
		return null;
	}

	public boolean isEmpty() {
		return br==0;
	}

	@Override
	public String toString() {
		return "stack: " + arr.toString();
	}
}