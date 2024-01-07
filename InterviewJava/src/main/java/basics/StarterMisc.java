package basics;

import java.util.*;

public class StarterMisc {

	public static void main(String[] args) {
		System.out.println("Testing the PRoject  4 ");

		testLinkedHashMap();


	}

	private static void testDeque(){
		Deque<Integer> deque = new LinkedList<>();
		deque.addFirst(2);
	}




	private static void testLinkedHashMap() {
		LinkedHashMap<Integer,Integer> map = new LinkedHashMap<Integer,Integer>(4);
		map.put(2,4);
		map.put(3,9);
		map.put(4,16);
		map.put(5,25);

		System.out.println("First Entry "+map.entrySet());

		System.out.println("Last Entry "+map.entrySet());
		map.put(6,36);

		System.out.println("Last Entry "+map.entrySet());

		System.out.println(map.get(4));
		System.out.println("Last Entry "+map.entrySet());
	}


}
