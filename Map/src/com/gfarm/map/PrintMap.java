package com.gfarm.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class PrintMap {

	public static void main(String[] args) {
		HashMap<Integer, String> companies = new HashMap<Integer, String>();
		
		companies.put(1, "hsbc");
		companies.put(2, "city");
		companies.put(3, "info");
		companies.put(4, "amazon");
		
		
		//for each 
		for(Integer key : companies.keySet()) {
			System.out.println(key + ": "+ companies.get(key));
		}
		//itrator + key set
		System.out.println("---------------------------");
		Set<Integer> keyset = companies.keySet();
		Iterator<Integer> keyIterator  = keyset.iterator();
		
		while(keyIterator.hasNext()) {
			Integer key = keyIterator.next();
			System.out.println(key + " : "+  companies.get(key));
		}
		
		//entryset + for each
		System.out.println("-------------------------");
		Set<Map.Entry<Integer, String>> entrySet = companies.entrySet();
		
		for(Entry<Integer, String> entry : entrySet) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		
		// entry set + iterator
		System.out.println("-------------------------");
		Set<Map.Entry<Integer, String>> entrySet1 = companies.entrySet();
		
		Iterator<Entry<Integer, String>> entryItertor = entrySet1.iterator();
		while(entryItertor.hasNext()) {
			Entry<Integer, String> entry = entryItertor.next();
			System.out.println(entry.getKey() +" : "+ entry.getValue());
		}
	}

}
