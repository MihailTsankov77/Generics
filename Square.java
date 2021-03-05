package Second;

public class Square extends GeometricObject {
	
	private double side = 1;
	
	public Square() {
	}
	
	public Square(double side) {
		this.setSide(side);
	}
	
	public Square(boolean fill, String color) {
		super(fill, color);
	}
	
	public Square(boolean fill, String color, double side) {
		super(fill, color);
		this.setSide(side);
	}



	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}




	@Override
	public int compareTo(GeometricObject o) {

		if(this.side- o.getSide()>0) {
			return 1;
		}else if(this.side- o.getSide()<0) {
			return -1;
		}
		
		return 0;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Square";
	}

}
