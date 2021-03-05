package First;

import java.util.ArrayList;

public class GenericStack2<E> extends ArrayList{
	

	public GenericStack2() {
		
	}
	
	public int getSize() {
		return super.size();
	}

	public E peek() {
		return (E) super.get(getSize() - 1);
	}

	public void push(E o) {
		super.add(o);
	}

	public E pop() {
		E o = (E) super.get(getSize() - 1);
		super.remove(getSize() - 1);
		return o;
	}

	@Override
	public boolean isEmpty() {
		return !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!super.isEmpty();
	}

	@Override
	public String toString() {
		return "stack: " + super.toString();
	}
}