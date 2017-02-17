
public class Triangle implements Shape{
	private double sideA;
	private double sideB;
	private double sideC;
	public Triangle(double sideA, double sideB, double sideC){
		this.sideA = sideA;
		this.sideB = sideB;
		this.sideC = sideC;
	}

	@Override
	public double getArea() {
		double s = (sideA+sideB+sideC)/2;
		double area = Math.sqrt(s*(s-sideA)*(s-sideB)*(s-sideC));
		return area;
	}

	@Override
	public double getPerimeter() {
		return sideA+sideB+sideC;
	}
}
