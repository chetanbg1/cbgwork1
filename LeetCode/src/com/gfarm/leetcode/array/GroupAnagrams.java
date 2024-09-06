package com.gfarm.leetcode.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Q - given an array of strings, group the anagrams together
//anagram - string having same characters / number of characters eg - listen and silent
public class GroupAnagrams {

//thought 1 O(n * log k) n - number of strings k= length of each string 
	// take a string sort it put it in map 
	// go for next string sort it if map contains it add the string with existing value
	//if map does not contain sorted string add it as new key - value pair
//thought 2 O(n *k ) k- length of largest string , n-no of words
	//create a map 
	// if two string are same in char and its frequency 
	
	public static List<List<String>> groupAnagrams(String [] strs){
		//null check
		if(strs == null || strs.length ==0) {
			return new ArrayList<>();
		}
		
		Map<String, List<String>> frequencyStringMap = new HashMap<>(); //create map 
		
		for(String str : strs) {
			String frequencyString = getfrequencyString(str);//method to check char frequency 
			
			//if frequency string is present ,add the string in the list
			if(frequencyStringMap.containsKey(frequencyString)) {
				frequencyStringMap.get(frequencyString).add(str);
			}else {
				//else create a new list
				List<String> strList = new ArrayList<>();
				strList.add(str);
				frequencyStringMap.put(frequencyString, strList);
			}
		}
		return new ArrayList<>(frequencyStringMap.values());
	}
	private static String getfrequencyString(String str) {
		//frequency bucket
		int [] freq = new int[26];
		
		//Iterate over each character
		for(char c : str.toCharArray()) {
			freq[c -'a']++;
		}
		
		//start creating a frequency string
		StringBuilder frequencyString = new StringBuilder();
		char c ='a';
		for(int i : freq) {
			frequencyString.append(c);
			frequencyString.append(i);
			c++;
		}
		return frequencyString.toString();
	}
	public static void main(String[] args) {
		String arr[] = {"aab","bba","baa","abbccc"};
		
		List<List<String>> listOfLists =groupAnagrams(arr);
		
		listOfLists.forEach(innerList -> {
	        String line = String.join(", ", innerList);
	        System.out.println(line);
	    });

	}

}
