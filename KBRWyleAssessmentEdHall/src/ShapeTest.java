import static org.junit.Assert.*;

import org.junit.Test;

public class ShapeTest {
	
	//all of my area and perimeter functions depend on user entering positive non-zero values for the sides
	//and radius. Will test one case where user enters 0, getArea should throw back 0 or some form of warning but doesn't for
	//testing sake
	@Test
	public void evaluateRectangleArea(){
		Rectangle rect = new Rectangle(5, 6);
		double area = rect.getArea();
		assertEquals(30, area, 0.001);
	}
	@Test
	public void evaluateCircleArea(){
		Circle circ = new Circle(5);
		double area = circ.getArea();
		assertEquals((25*Math.PI), area, 0.001);
	}
	@Test
	public void evaluateTriangleArea(){
		Triangle tri = new Triangle(5, 5, 7);
		double area = tri.getArea();
		assertEquals(12.497, area, 0.001);
	}
	@Test
	public void evaluateRectanglePerimeter(){
		Rectangle rect = new Rectangle(5, 6);
		double perimeter = rect.getPerimeter();
		assertEquals(22, perimeter, 0.001);
	}
	@Test
	public void evaluateCirclePerimeter(){
		Circle circ = new Circle(5);
		double perimeter = circ.getPerimeter();
		assertEquals((Math.PI*10), perimeter, 0.001);
	}
	@Test
	public void evaluateTrianglePerimeter(){
		Triangle tri = new Triangle(5, 5, 7);
		double perimeter = tri.getPerimeter();
		assertEquals(17, perimeter, 0.001);
	}
	//failure example
	//when entering negative or 0 for a side/radius, implementation should throw error or in this case return 0
	@Test
	public void evaluateRectangleNegativeValue(){
		Rectangle rect = new Rectangle(5, -6);
		double area = rect.getArea();
		assertEquals(0, area, 0.001);		
	}
}
