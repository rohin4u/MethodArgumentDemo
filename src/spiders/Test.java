package spiders;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Test {

	public static void main(String[] args) {
		
//		ArrayList<Integer> al = new ArrayList<>();
//		
//		al.add(89);
//		al.add(34);
//		al.add(98);
//		al.add(12);
//		al.add(432);
		
		Map<Integer, String> map = new HashMap<>();
		
		map.put(101, "delhi");
		map.put(29, "bareily");
		
		Animal animal = new Animal();
		
		animal.process(map);
		
		
		
	}

}
