package basics;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StarterMisc {

	public static void main(String[] args) {
		System.out.println("Testing the PRoject ");
		List<Integer> l =  IntStream.range(0, 10).boxed().collect(Collectors.toList());
		System.out.println(l); 
	}
	
	
}
