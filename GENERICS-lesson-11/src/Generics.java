import java.util.ArrayList;

public class Generics {

	public static void main(String[] args) {
		Generics2<Double> g = new Generics2<Double>();
		g.Generic(34.7, 87.89);
		
		Generics2<String> s = new Generics2<String>();
		s.Generic("We are on it", "Generating Generics");
		
		/*ArrayList<Generics2> d = new ArrayList<>();
		d.add(new Generics2());
		*/
		System.out.println();
	}

}
