package Second;

public abstract class GeometricObject implements Comparable<GeometricObject> {
	
	private boolean isFill = false;
	private String Color = "white";
	private double side ;

	protected GeometricObject() {
	}

	protected GeometricObject(boolean fill, String color) {
		this.setFill(fill);
		this.setColor(color);
	}

	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}

	public boolean isFill() {
		return isFill;
	}

	public void setFill(boolean isFill) {
		this.isFill = isFill;
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}
	
	public abstract String toString();
}