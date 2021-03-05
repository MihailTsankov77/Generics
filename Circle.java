package Second;

public class Circle extends GeometricObject{

	
	private double side = 0;
	
	public Circle() {
	}
	
	public Circle(boolean fill, String color) {
		super(fill, color);
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
		return "Circle";
	}
	
	
}
