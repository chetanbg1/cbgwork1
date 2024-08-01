package com.gfarm.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Stream {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(5,50,75,40,25, 10, 15, 35, 20);

//		 filter --> used to filter the data from Stream.
//		 creates a new stream,
//		 it takes a predicate as an argument which returns boolean value
//		 it is intermediate operation

		List<Integer> filteredList = list.stream().filter(i -> i % 2 == 0).toList();
		System.out.println(filteredList);

//		 Map
//		 is used to transform each element of stream and return new stream
//		 map takes function as an argument, the return type is based on the type of data
//		 it is intermediate operation

		List<Integer> mapededList = list.stream().map(i -> i * 2).toList();
		System.out.println(mapededList);
		
		// filter out passed students and give grace of 5 marks
		List<Integer> passedList = list.stream().filter(i -> i>35).map(i -> i+5).toList();
		System.out.println(passedList);
		
		//count -> to count the number of elements in stream return long value
		//find the number of failed student
		Long elementCount = list.stream().filter(i -> i <35).count();
		System.out.println(elementCount);
		
		//sort 
		//to sort the order of elements in the stream
		//sorted according to natural order
		List<Integer> sortedList = list.stream().sorted().toList();
		System.out.println(sortedList);
		
		//if want to sort in descending order
		// then we use comparator
		//comparator is functional interface having compare(obj1,obj2) method
		// if return -ve obj1 is greater than obj2
		// if return +ve obj2 is greater than obj1
		// 0 then objects are equal
		//(a,b) -> (a<b) ? 1 :(a>b) ? -1 :0
		
		List<Integer> sortedListDes = list.stream()
										//.sorted((a,b)->(a<b)?1:(a>b)?-1:0).toList();
										//.sorted((a,b)-> b.compareTo(a)).toList();
				.sorted((a,b)-> -b.compareTo(a)).toList();
		System.out.println(sortedListDes);
		
		//comparable is interface having method compareTo(obj1) 
		//method have only one argument
		
		
		//sort on the basis of length of string
		
		List<String> list1 = Arrays.asList("a","aaa","aa","aaaa");
		
		Comparator<String> c= (a,b)-> {
			int l1 = a.length();
			int l2 = b.length();
//			if(l1<l2) return -1;
//			else if (l1>l2) return 1;
//			else return 0;
			return Integer.compare(l1, l2);
		};
		//List<String> sortAccordingToLength = list1.stream().sorted(c).toList();
//		List<String> sortAccordingToLength = list1.stream()
//				.sorted((a,b)-> Integer.compare(a.length(), b.length())).toList();
		List<String> sortAccordingToLength = list1.stream()
				.sorted(Comparator.comparing(String::length)).toList();
		System.out.println(sortAccordingToLength);
		
		
		//min() max()
		//both method takes the comparator as an argument
		//and based on comparator result it will return the value
		//min will return first element of the result
		//max will return last element of the result
		
		String minElement = list1.stream()
				.min(c).get();
		System.out.println(minElement);
		
		String maxElement = list1.stream()
				.max(c).get();
		System.out.println(maxElement);
		
		
		//forEach
		//to perform an action for each element of the stream
		//it is terminal operation
		
		list.stream().forEach(i -> System.out.println(i));
		list.stream().forEach(System.out::println);
		list.forEach(System.out::println);
		
		//convert stream of objects into arrays
		//toArray()
		//it returns an array containing elements of the stream
		//it is terminal operation
		
		Integer [] arr = list.stream().toArray(Integer[]:: new);
		for(int a :arr) {
		System.out.print(a+" ");
		}
		
		//convert array to stream
		//Arrays.stream(arr)  or Stream.of(arr);
		
		//Stream.of(args)
		//argument should be any type either arrays or any group of elements
		
		
		Integer [] array = {10,13,14,16,24};
		Arrays.stream(array).filter(i -> i%2==0).forEach(System.out::println); //method reference
		
		//Stream<?> item = Strem.of(1,4,34,"a","asd");
		//item.map(i -> i+":vv").forEach(System.out::println);
		
		//skip()
		//findFirst()
		
		
 	}

}
