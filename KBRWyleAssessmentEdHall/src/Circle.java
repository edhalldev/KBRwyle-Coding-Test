
public class Circle implements Shape {
	private double radius;
	public Circle(double radius){
		this.setRadius(radius);
	}
	
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	@Override
	public double getArea() {
		return Math.PI*(Math.pow(radius, 2));
	}

	@Override
	public double getPerimeter() {
		return Math.PI*2*radius;
	}
	
}
