package figureAreas;

public class Main {

	public static void main(String[] args) {
		
		Triangle tri = new Triangle(3.8,8.6);
		Rectangle rec = new Rectangle(4.56,2.4);
		Circle cir = new Circle(1.9);
		
		System.out.printf(
				"The area of the Triangle is %.2f\nThe area of the Rectangle is %.2f\nThe area of the Circle is %.2f",
				tri.computeArea(),rec.computeArea(),cir.computeArea()
				
				);

	}

}
