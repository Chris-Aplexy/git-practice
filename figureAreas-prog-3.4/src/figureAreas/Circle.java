package figureAreas;

public class Circle {
	
	final private double radius;

	Circle(double radius){
		this.radius = radius;
	}
	
	public double computeArea() {
		return Math.PI*radius*radius;
		
	}
}
