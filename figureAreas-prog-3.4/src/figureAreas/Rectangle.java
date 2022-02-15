package figureAreas;

public class Rectangle {
	
	final private double length;
	final private double width;

	Rectangle(double length,double width){
		this.length = length;
		this.width = width;
	}
	
	public double computeArea() {return length*width;}
}
