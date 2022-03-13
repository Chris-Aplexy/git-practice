package aetoTechs_3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		/* System.out.println("hello word"); */
		/*
		 * interfaces implemented by the ArrayList class 
		 * -
		 * -
		 * -
		 * -
		 * -
		 * -
		 * class implemented by the ArrayList 
		 * -
		 */
		
		List<String> string = new ArrayList<>();
		
		string.add("hello");
		string.add("yellow");
		string.add("chris");
		string.add("cwesi");
		string.add("wian");
		string.add("ceff");
		string.add("kats");
		
		System.out.println(string);
		
		List<String> strings =
			string.stream()
			.filter(d -> d.contains("chris")	)
			.collect(Collectors.toList());
		
		System.out.println(strings);
		
		//streams implementation
		
		IntStream.of(3,8,5,8,46,7).filter(f -> f<34).forEach(System.out::println);
		
		Predicate<Object> pre = r -> (r instanceof Bst);
		Bst b = new Bst();
		
		String h = string.stream().filter(j -> j.contains("hello")).toString();
		System.out.println(h);
		
		
		//finding maximum using compareTo method.
		
		String max = strings.get(0);
		
		for(String s : strings) {
			if(s.compareTo(h)>0) {
				max = s;
				
			}
		}
		System.out.println(max);
		
		//aggregation practice
		Employee e = new Employee("Christopher",new Address(34,"texas"));
		System.out.println(e.getAd().getStreetname());
		System.out.println(e.getAd());
	}
}
/*
 * #iclude<stdio.h> int main() { printf("hello world"); }
 */