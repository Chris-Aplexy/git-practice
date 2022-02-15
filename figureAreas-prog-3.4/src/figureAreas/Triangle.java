package figureAreas;

final public class Triangle {
	 final private double base;
	 final private double height;

	Triangle( double base, double height){
		 this.height = height;
		 this.base = base;
		 
		//computeArea();
	}
	
	public double computeArea() {return 0.5*base*height;}
	
}
