package com;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;



public class GenericMethod {
	
	public static <T extends Collection<Integer>> void sampleMethod(T ob) {
		Iterator<Integer> itr = ob.iterator();
		
		
		
		while(itr.hasNext()) {
			
			Integer next = itr.next();
			System.out.println(next);
		}
		
	}
	
	

	public static void main(String[] args) {
		
		ArrayList<Integer> l = new ArrayList<Integer>();
		
		l.add(34);
		l.add(11);
		l.add(89);
		l.add(21);
		l.add(54);
		l.add(100);
		Collections.sort(l);
		GenericMethod.sampleMethod(l);
		
		
	}

}
