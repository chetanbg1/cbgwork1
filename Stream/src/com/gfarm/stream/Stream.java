package com.gfarm.stream;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;


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
		
		//group by
		List<Employee> emp =  Arrays.asList(new Employee(1, "aaa", 10),
				new Employee(2, "bbb", 20),
				new Employee(3, "ccc", 30),
				new Employee(4, "bbb", 40),
				new Employee(5, "ddd", 45));
		
		Map<Integer, List<Employee>> emp2 = emp.stream().collect(Collectors.groupingBy(emp1 -> emp1.getAge()));
		System.out.println(emp2);
		//Set<Integer> age3 = emp2.entrySet().stream().map(entry -> entry.getValue()).collect(Collectors.toSet());
		List<Integer> ages = emp.stream().map(emp1 -> emp1.getAge()).toList();
		//summary statistics can only be performed on int(have to call maptoint()) = sum , count, max, min, avg 
		int minAge = ages.stream().mapToInt(x -> x).summaryStatistics().getMin();
		System.out.println("min age is :" + minAge);
		System.out.println(ages);
		int maxAge = ages.stream().mapToInt(x -> x).summaryStatistics().getMax();
		System.out.println("max age is :" + maxAge);
		int avgAge = (int) ages.stream().mapToInt(x -> x).summaryStatistics().getAverage();
		System.out.println("avg age is :" + avgAge);
		List<Integer> twoandthree =ages.stream().sorted().skip(1).limit(2).toList();
		System.out.println(twoandthree);
		
		
		//names
		List<String> nameslist = emp.stream().map(name -> name.getName()).toList();
		System.out.println(nameslist);
		String names =nameslist.stream().map(name -> name.toUpperCase()).collect(Collectors.joining(", "));
		System.out.println(names);
		
		//find duplicate element in stream
		Set<String> uniqueNames = new HashSet<>();
		 Set<String> duplicateNames = nameslist.stream().filter(name -> !uniqueNames.add(name)).collect(Collectors.toSet());
		System.out.println(duplicateNames);
		
		Map<String, Long> mapOfNames = nameslist.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		System.out.println(mapOfNames);
		
		Set<String> name1 =mapOfNames.entrySet().stream().filter(entry -> entry.getValue() > 1).map(entry -> entry.getKey()).collect(Collectors.toSet());
		System.out.println(name1);
		
		//frequency
		
		Set<String> name9 = nameslist.stream().filter(name -> Collections.frequency(nameslist, name)>1).collect(Collectors.toSet());
		System.out.println(name9);
		
		
		//sort the employee based on there age in desc order
		List<Employee> sortedEmp =emp.stream().sorted((o1,o2)-> (int)(o2.getAge()-o1.getAge())).toList();
		System.out.println(sortedEmp);
		
		//top 3 emp with high age
		List<Employee> highAge =emp.stream().sorted((o1,o2)-> (int)(o2.getAge()-o1.getAge())).limit(3).toList();
		System.out.println(highAge);
		
		//3rd oldest
		List<Employee> thirdAge =emp.stream().sorted((o1,o2)-> (int)(o2.getAge()-o1.getAge())).limit(3).skip(2).toList();
		System.out.println(thirdAge);
		
		//orElse()
		//String name = Optional.ofNullable(nullNmae).orElse("Anonymous");
		
		//orElseGet()
		//String name = Optional.ofNullable(nullName).orElseGet(()-> "Anonymous");
		
//		for(Map.Entry<Integer, List<Employee>> entiy : emp2) {
//			System.out.println(entiy.getKey() +" "+ entiy);
//		}
		//convert stream of objects into arrays
		//toArray()
		//it returns an array containing elements of the stream
		//it is terminal operation
		
		//Integer [] arr = list.stream().toArray(Integer[]:: new);
		Object [] arr = list.stream().toArray();
		for(Object a :arr) {
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
