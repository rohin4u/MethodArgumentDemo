package spiders;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Animal {
	
	
	public <T extends Map<Integer, String>> T process(T ob){
		
		System.out.println(ob);
		Set<Integer> keySet = ob.keySet();
		Iterator<Integer> itr = keySet.iterator();
		
		while(itr.hasNext()) {
			Integer next = itr.next();
			System.out.println(next);
			
		}
		Collection<String> values = ob.values();
		System.out.println(values);

		return ob;
	
	}

}
