package com.gfarm.leetcode.string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;


public class FreqofCharinDescOrder {

	public static void main(String[] args) {

		String str = "banana";

		Map<Character, Integer> map = new HashMap<>();

		for (char c : str.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}
		Set<Entry<Character, Integer>> set = map.entrySet();
		List<Entry<Character, Integer>> list = new ArrayList<>(set);
		Collections.sort(list, new Comparator<Map.Entry<Character, Integer>>() {

			@Override
			public int compare(Entry<Character, Integer> o1, Entry<Character, Integer> o2) {
				
				return o2.getValue().compareTo(o1.getValue());
			}
		});
		
		for(Entry<Character, Integer> entry : list) {
			System.out.println(entry.getKey() +" "+ entry.getValue());
		}
	}

}
