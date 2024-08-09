import java.util.Scanner;

class FirstClass{

   
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String name =sc.next();
        //next() only single word
        //nextLine() whole line
        System.out.println(name);
        System.out.println("hello world");    
    }
}


//How java code runs

//compilation 
//source code.java --> byte code.class -->
//+ execution
// JVM converts the byte code into native code == byte code --> native code (binary 0 and 1)

//JDK
//JRE java runtime environment  = JVM + libraries 
//JVM java virtual machine

JIT just in time compiler
	java source code --> JDK (javac.exe) --> byte code -->JRE(interpreter + JIT compiler) --> machine code
 	JIT is used to optimise the performace of java code at run time - its helps code to fastly compile 
	

//varible value keeps changing if we change  ,reference to the address of memery where we store the data
// constants value do not change

//java is typed language, meaning we can not define variable without data type
//Data type 
//primitive data types
//byte  == 8 bits 1 byte
//shortv =2byte
//char  == 2bytes
//boolean ==1byte
//int  = 4 byte
//long  = 8 byte
//double =8  byte
//float =4 byte
java is not completly 100% object - oriented language due to premitive data types
we use Wrapper classes for primitive data type

-- pointers not allowed in java
	they are unsafe
 	increase complexity
  	JVM does the implicit memory allocation, to avoide the direct access to memory by user 

Pass by value - we dont pass the original memory address, value is copied at another memory location and that is passed so original value can not be modified  --java is pass by value 
Pass by reference - actually sending the memory object / pointer of the varible to a function , if someone modifies that varible in function we may lost the original variable 
		    changing the real address of the variable 
//Non-primitive data type
//Array
//String
//Class
//Object
//Interface

//conditional statement
//if 
//else
//else if
//switch
Scanner sc = new Scanner(System.in);
int button = sc.nextInt();

switch(button){
    case 1: System.out.println("hello");
            break;
            case 2: System.out.println("Namaste");
            break;
            case 3: System.out.println("ram ram");
            break;
            default: System.out.println("no hello");
}


//Loops
//for loop
for(int counter = 0; counter <=10; counter++){
    System.out.println("cbg the great");
}
//while loop
int i =0;
while(i <= 10){
    System.out.println("cbg the great");
    i++;
}
//do while loop
int i=0;
do{
    System.out.println("cbg the great");
}while(i<10);

object class
--
is parent class to all the classes in java 
java.lang.Object 
protected Object clone();  --> throws cloneNotFoundException , create and retruns a copy of this object
public boolean equals(Object obj) --> indicates whether some objects are equal to this one
protected void finalize() --> throws throawble called by garbage collector on an object when there is no more reference to object
public final Class getClass() --> returns the runtime class of an object 
public int hashCode() --> return hashCode value of object 
public String toString() --> returns string representation of object 
public final void notify()
public final void notifyAll()
public final void wait()
public final void wait(long timeout)
public final void wait(long timeout, int nanos)

how to make class immutable 
	declare class final
 	make all fields private 
  	do not provide setter's
   	make all mutable fields final
    	initialize fields via constructor performing a deep copy
     	perform cloning of objects in the getter method to return a copy rather than retruning the actual object reference 

Singletone
--
	singleton class is class whose only one instance can be created at any given time, in one jvm 

 	public class Animal{
  		private static Animal single_instance = null;  //create private static instance of same class 
    			private Animal(){    //make constructor private
     
			}
   		public static Animal getInstance(){
     			if(single_instance == null){		//if null
				single_instance = new Animal(); // create new 
			}
   			return single_instance;        //else return the instance it self 
		}
	}
patterns
--
//solid rectangle
// *****
// *****
// *****
// *****
for(int i =0; i<=4;i++){
    for(int j =0;j<=5;j++){
        System.out.print("*");
    }
    System.out.println();
}

//
// ******
// *    *
// *    *
// ******
int n=4;
int m=5;
for(int i =1;i<=n;i++){
    for(j=1;j<=m;j++){
        if(i==1 || j ==1 ||i==n || j==m){
            System.out.printl("*");
        }else{
            System.out.print(" ");
        }
    }
    System.out.println();
}

//half peramid
// *
// **
// ***
// ****
int n =4;
for(int i=0;i<n;i++){
    for(int j=0;j<i;j++){
        System.out.print("*");
    }
    System.out.println();
}

//
//*****
//****
//***
//**
//*

int n =5
for(int i =n; n>0;n--){
    for(int j =0;j<i;j++){
        System.out.println("*");
    }
}


//
//    *
//   **
//  ***
// ****
int n=4
for(int i=0;i<n;i++){
    //space
 for(int k=0;k<n-i;k++){
    System.out.println(" ");
 }
 for(int j=0;j<i;j++){
    System.out.println("*");
 }
    System.out.println();
}

//1
//12
//123
//1234
//12345
int n=5;

for(int i=1;i<=n;i++){
    for(int j=1;j<=i; j++){
        System.out.print(j+" ");
    }
    System.out.println();
}

//12345
//1234
//123
//12
//1

for(int i=n;i>=1;i--){
    for(int j=1;j<=i; j++){
        System.out.print(j+" ");
    }
    System.out.println();
}

//or
for(int i=1;i<=n;i++){
    for(int j=1;j<=n-i+1; j++){
        System.out.print(j+" ");
    }
    System.out.println();
}


//1
//2 3
//4 5 6
//7 8 9 10
int a =1;
			for(int i =1; i<=4;i++) {
				for(int j =1; j<=i; j++) {
					System.out.print(a + " ");
					a++;
				}
				System.out.println();
			}


//1
//0 1
//1 0 1
//0 1 0 1
//1 0 1 0 1

int a =1;
			for(int i =1; i<=4;i++) {
				for(int j =1; j<=i; j++) {
					System.out.print(a + " ");
					if(a==1){
                        a=0;
                    }
                    else{
                        a=1;
                    }
				}
				System.out.println();
			}


//or

for(int i =1; i<=4;i++) {
    for(int j =1; j<=i; j++) {
        if((i+j)%2==0){
            System.out.print("1" + " ");
        }else{
            System.out.print("0"+" ");
        }
    }
    System.out.println();
}

//
// *      *
// **    **
// ***  ***
// ********
// ********
// ***  ***
// **    **
// *      *
int n=4;

//upper half
for(int i=1;i<=n;i++){
    //1st part
     for(int j =1;j<=i;j++){
            System.out.print("*");
        }
    //space
    for(int j =1;j<=2*(n-i);j++){
        System.out.print(" ");
    }
    //2nd half
    for(int j =1;j<=i;j++){
        System.out.print("*");
    }
    System.out.println();
}
//lower half
for(int i=n;i>=0;i--){
     for(int j =1;j<=i;j++){
            System.out.print("*");
        }
    for(int j =1;j<=2*(n-i);j++){
        System.out.print(" ");
    }
    for(int j =1;j<=i;j++){
        System.out.print("*");
    }
    System.out.println();
}

//    *****
//   *****
//  *****
// *****

int n =5;
for(int i=1;i<=n;i++){
     //space
     for(int j =1;j<=n-i;j++){
        System.out.print(" ");
    }
     for(int j =1;j<=n;j++){
            System.out.print("*");
        }
        System.out.println();
   
    }


//    1
//   2 2
//  3 3 3
// 4 4 4 4
//5 5 5 5 5
int n=5;
for(int i=1;i<=n;i++){
    for(int j=1;j<n-i;j++){
        System.out.print(" ");
    }
    for(int j =1;j<=i;j++){
        System.out.print(i+" ");
    }
    System.out.println();
}

//        1
//      2 1 2
//    3 2 1 2 3
//  4 3 2 1 2 3 4
//5 4 3 2 1 2 3 4 5 

int n=5;
for(int i=1;i<=n;i++){
    //spaces
    for(int j=1;j<n-i;j++){
        System.out.print(" ");
    }
    //1st half
    for(int j =i;j>=1;j--){
        System.out.print(j);
    }
    for(int j =2;j<=i;j++){
        System.out.print(j);
    }
    System.out.println();
}


//    *
//   ***
//  *****
// *******
// *******
//  *****
//   ***
//    *


int n=4;
for(int i =1;i<=n;i++){
    for(int j =1;j<=n-i;j++){
        System.out.println(" ");
    }
    for(int j =1;j<=2*i-1;j++){
        System.out.println("*");
    }
    System.out.println();
}
for(int i =n;i>=1;i--){
    for(int j =1;j<=n-i;j++){
        System.out.print(" ");
    }
    for(int j =1;j<=2*i-1;j++){
        System.out.print("*");
    }
    System.out.println();
}

//function called directly  / method = called with class

//Time complexity
//relation between input size and running time(operation)

//Arrays
//continuous memory allocation with fixed size
//2D Arrays
//type[][] arrayName = new type[rows][cols];
//int [][] nums = new int[3][5];

Strings
--

string pool requires string to be immutable otherwise shared reference can be changes from anywhere
security because string is shared on different are like file system, network coonection, database connection, passwords, having string immutable allows us to be secure ans safe 

//String.class
//length();
//charAt(index);
//compare == str1.compareTo(str2);
//      s1  > s2  : +ve value   eg = hello  > cello
//      s1  == s2  : 0          eg = hello == hello
//      s1  < s2  : -ve value   eg = hellow < wello
//subString(begining index , ending index(not included));
//parseing

//Strings are immutable - can not be modified
//data stored in java in two parts  stack(reference) heap(actual data)
//str = h  , h+e;
//str =he;   str will point to "he", "h" will be deleted
//str = he  , he+l;
//str =hel;   str will point to "hel", "he" will be deleted  and so on..

//StringBuilder

StringBuilder sb = new StringBuilder("cbg");
sb.append("bb");

//sets the char at given index, delete the char and insert new
sb.setCharAt(int index,'new char');  sets the char at given index
//insert  = insert and shift the remaining chars
sb.insert(int index,'char');
//delete
sb.delete(int start, int end);

//reverse string
StringBuilder sb = new StringBuilder("helloasd");
		
		for(int i=0; i<sb.length()/2;i++){
		    int front = i;
		    int back = sb.length()-1-i;

		    char frontChar =sb.charAt(front);
		    char backChar = sb.charAt(back);

		    sb.setCharAt(front, backChar);
		    sb.setCharAt(back, frontChar);
		}
		System.out.println(sb);

//operstors
//Bianry ==  +,-,*,/,%
//Unary  ==  ++, --
//relational operator  == ==, !=, >, < , >=, <= 
//logical operator  == &&(logical and),||(logical or), !(logical not)
//Bitwise Operators --> &(binary and) == 0101 & 0110 = 0100, 
//                      |(binary or) == 0101 & 0110 = 0111,
//                      ^(binary XOR) ==0101 & 0110 = 1011,similar vales--> false, diff value -->true, 
//                      ~(Binary one component)==0-->1, 1-->0 = gives the complement of binnary value,
//                      << (binary left shift) == 0101<<1 = 1010,
//                      >> (binary right shift) == 0101>>1 ==0010

//Assignment Operators
// =, +=, -=, *=, /=

//Bit Manupulation
//get
//Q - get the 3rd bit (postion=2) of a number n.(n=0101)?
//Bit mask : 1<<2 (postion) = 0100
// operation AND = n & bit mask = 0101 & 0100 =0100
// ans is non zero, so the 3rd bit is 1;
int n=5;
int position =2;
int bitMask = 1<<position;
if((bitMask & number)==0){
    System.out.println("bit was 0");
}else{
    System.out.println("bit is 1");
}
//set
//Q - set the 2nd bit (position=1) of a number n(n=0101)
//Bit mask : 1<< 1 (postion) = 0001  << 1 = 0010
// operation OR = n & bit mask = 0101 | 0010 = 0111

int n=5;
int position =1;
int bitMask = 1<<position;
int newNumber = bitMask | n;
System.out.println(newNumber);

//clear
//Q - Clear the 3rd bit(position 2) of a number n(n=0101)?
//Bit mask : 1<< 2 (postion) = 0001  << 2 = 0100 --> NOT 1011
// operation AND with NOT = n & NOT of bit mask = 0101 & 1011 = 0001
int n=5;
int position =2;
int bitMask = 1<<position;
int notBitMAsk =~(bitMask);
int newNumber = notBitMAsk & n;
System.out.println(newNumber);

//update
//Q - Update the 2nd bit(position 1) of a number n to 1 (n=0101)?
//for 0
//Bit mask : 1<< 1 (postion) = 0001  << 1 = 0010 --> NOT 1101
// operation AND with NOT = n & NOT of bit mask = 0101 & 1101 = 0101
//for 1
//Bit mask : 1<< 1 (postion) = 0001  << 1 = 0010 --> NOT 1011
// operation OR = n |bit mask = 0101 & 0010 = 0111

int n=5;
int position =2;
Scanner sc = new Scanner(System.in);
int operation = sc.nextInt();
int bitMask = 1<<position;
//operation = 1 : set
//operation = 0 : clear 
if(operation==0){
    int notBitMAsk =~(bitMask);
    int newNumber = notBitMAsk & n;
    System.out.println(newNumber);
} else{
    int newNumber = bitMask | n;
    System.out.println(newNumber);
}


//Sorting
//bubble sort
//biggest element goes to the end after each iteration
//in every itheration we are swapping pair wise
//time complexity O(n^2)
public static void bubbleSort(int [] arr) {
    boolean isSwapped;
    int n = arr.length;
    //bubble sort
    //iteration
    for(int i=0 ; i< n-1; i++) {
        isSwapped = false;
        //swapping
        for(int j =0; j< n-1-i;j++) {
            if(arr[j]> arr[j+1]) {
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
                isSwapped = true;
            }
        }
        if(isSwapped == false)
            break;
    }
    
}

//selection sort
//smallest element goes to the begining 
//in every iteration we sawp only once
//we find the smallest element and put it first
//time complexity O(n^2)
public static void selectionSort(int [] arr) {
    int n = arr.length;
    for(int i = 0; i<n-1;i++) {
        int min =i;
        for(int j = i+1;j<n;j++) {
            if(arr[j]< arr[min]) {
                min = j;  // find the smallest element
            }
        }
        //put the smallest at the beginning 
        int temp = arr[min];
        arr[min] = arr[i];
        arr[i] = temp;
    }
}

//insertion sort
//divide the array in two parts sorted and unsorted
//pick the element from unsorted part and pu it in sorted part at correct sorted position
//time complexity O(n^2)
public static void insertionSort(int [] arr) {
    int n = arr.length;
    for(int i =1;i<n; i++){ //unsorted part
        int temp = arr [i]; //first element of unsorted array
        int j = i-1; // sorted part
        while(j>=0 && arr[j] > temp) {
            arr[j+1] = arr[j]; //shifting larger element to temp by 1 position
            j = j-1;
        }
        arr[j+1] = temp;//placing in sorted array at corrected position 
    }
}


//Recursion
//function that calls itself until base condition reached
//recursive calls stored in stack
for(int i =0;i<5;i++){
    System.out.println(i);
}

public static void printNumber(int n){
    while (n==0) { //base condition
        return;
    }
    System.out.println(n);
    printNumber(n-1); //recursion
}

//BackTracking
//find all possible solutions and use the one you want
//all possible arrangement total permutation = n!

//Merge Sort
//divide and conquer
// mid = s + (e-s)/2 
//time complexity O(nlogn)

//QuickSort
//Pivot 
//Partition part the array based on pivot
//elements smaller than pivot will come before pivot and elements bigger than pivot comes after pivot
//pivot selection ramdom , median , 1st element , last element
//time complexity worst = o(n^2)  average = O(nlogn)
//worst case occurs when pivot is always the smallest or largest element

Exception Handling 
--
abnormal condition which can disrupt the normal flow of program, if not handled properly program can terminate abruptly 
try - enclose the set of statements which can throw exception , heance required to be monitored. can not use try block alone, must be followed by catch or finally 
Catch - when exception occurs block catches the exception and work accordingly to handle it or to throw it as required
Finally - this block get executed always regardless of exception occurence , hence clean up is done 

Throwable  --> Exception -->checked exception / compile time   --> eg - sql exception , classnnotfound
			 --> unchecked exception / runtime exception --> eg - nullpointer, number format , indexoutofbound 
    	   --> Error --> stack overflow 
			 out of memory 
    			 virtual machine error 
Throw - use to throw exception
	checked exception can not be propagated using throw only
 	used with in method
  	can not throw multiple exception
Throws - used to declare exception
	 checked exception can be propagated with throws
  	 used in method signature
    	 can declare multiple exceptions
when exception is thrown by main() method , java runtime terminates the program and prints the exception message and teh stack trace is shown in-system console 
unreachable catch block -when we keep super class first and sub classes later like Exception first and then nullpointer ..in multi catch block 


Final - keyword used to  apply restrictions on the class, method and variables
	the final class can not be inherited, final method can not be override, final variable can not be changed
finally - keyword used with try catch block to provide statement that will always get executed if some exception arises, used to close resources
Finalize - used to perform clean up processing just before the object is garbage collected 

OOPs
--
// this kewaord = tells us which object call the fuction or varible --refers to current object
//Constructor argument / no - argument / default   
//copy constructor -->passing constructor in the argument of other constructor 

Polymorphism
--
//method overloading --> complile time polymorphism
//method overriding -->  runTime Polymorphism
Covarient return type means return type may vary during overriding 

Inheritance
--
//once class can inherite properties of other class
//single level
//multilevel
//hirarchial inheritance one class extended by many classes
//hybrid 
// multiple inheritance is not supported in java

Association
--
Has-A realtion 
Aggregation - weak association  - one object can exist without other object,  eg Car has - A driver
Composition - strong association - one object can not exist without other object  eg Car has - a engine 

Encapsulation -->combining data and method / data hiding
--
//package -- > all related classes we put it in package
access modifiers
//public  --> any one can access across all the classes and packages
//default --> can access within the package
//protected --> can access in same package plus other packages having subclasses
//privtae -->access only with in class
what if the method in child class is more restricted than parent  -- > compile time error , can not reduce the visibility of the method 

Abstraction -->only importent things user can see/ hide all unneccessary things from user
--
//Abstract class -->just a concept --only method declaration no defination
//now we can have abstract or normal methods
//we can not create the object of abstact class
//can have constructors and static methods--> constructor chaining
//can have final method which will force subclass not to change the body of method


Interface  --> pure abstraction
--
//no constructor
//no method implementations
//all fields bydefault public, static and final
//all methods are public and abstract
//class that implements an interface must implement all the methods declared in the interface
//support the functionality of multiple inheritance

marker interface - interface having no data members and functions , empty interface 
	eg - serializable , clonable 
to sort the custom object we need 
Comparable - Comparable<generic object> has one mehod --> public int compareTo(Employee o){   // can sort only integer value
								return this.id -o.id;    //compare given object id with current object id 
											 // will return 0 if both are same
	    										 // 1 if 
											 // -1 if 						
      									 }
Comparaotr - public static comparator<Employee> nameComp = new Comparator<Employee>();
			public int compare(Employee e1, Employee e2){
   				return e.getName().compareTo(e2.getName());
			}
shallow comparision (e1 == e2) --> compare the memory addresses of e1 and e2 --> comapre the references 
deep comparision (e1.equals(e2)) --> compare the internal details --> actual values inside the object
		public boolean equals(Object o){
  			if(o == null){
     				return false;
			}
   			if(o == this){
      				return true;
			}
   			Employee e = (Employee) o ; //typecast
      			return (this.getId() == e.getId());
		}
  if two objects are saame  according to Equals(Object o) then the hashcode are same 

default methods - is a way of adding new methods to the interfaces without affecting the implementing classes
		  so no error arises due to unimplemeted methods fo interface 
    		  default method have dummy implemetation
		  implementing classes if ok with dummy implementation then use dummy impl, if not can override and provide their own implementation 
    		  while overriding we use public access modifiers in implementing classes
		  we can face the diamand problem due to default method while inheriting the interface, to avoid this we call method by interface name 
    
static methods are introduce in interface in java 8 so we can call these methods with just interface name. no need to create class and then its objects , as we can not create the objects of interface 

Predicate 
	predefine functional interface 
 	only one abstract method is--> public boolean test(T t);  --> always return boolean value 
Functional 
	apply(T t)  --> takes 1 input and gives 1 output
 	andThen , compose --> chaining
Consumer 
 	never return anything
  	public void accept(T t)
   	andThen --> chaining
Supplier 
	it will just supply required objects and will not take any input 
 	public R get()
 	no chaining 
BiFunction, BiPredicate, BiConsumer --> when there are two argumennts

static --> common property of class accessible to all
--
//properties , method, block , nested class
//memory allocate only once
we can not override private and static methods in java 

finally block always execute in java except "System.exit()" called or system crashes 


ArrayList
--
//ArrayList<Integer> list = new ArrayList<>();
//can store element in non continuous way with no fix size
//can store only objects
//gets created in heap memory
//method - add(), set(),get(),remove(),size(),sort()->(Collection.sort(arrayList))


Collection Framework
--
java.util.Collection is root of collection framework except Map interface

//Iterable Interface --->Collection Interface --> List Interface
//                                            --> Set Interface
//                                            --> Queue Interface
//methods --> add, size, remove, iterate, allAll, removeAll, clear
//List Interface --> ArrayList Class
			dynamic resizing 50% of original size
   			not synchronized
//               --> LinkedList Class
			implements list and deque interface
   			maintain insertion order
      			does not support accessing elements ramdomly
	 		use listIterator to iterate list 
//               --> Vector Class  (same as LinkedList threadsafe) --> Stack
			is synchronized
   			maintain insertion order
      			thread safe
	 		increase size by doubling the array size

	contains ordered elements
 	may include duplicates
  	support index base search, random access 
   	elemets can be easily inserted irrespective of the position 

//Queue interface --> PriorityQueue class
			priority associated with each element
   			high priority elements served before a low priority irrespective of insertion order
//                --> LinkedList class
//                --> Deque Interface --> ArrayQueue class
			elements can be added and remove from both the ends
//Set interface --> HashSet class
			implicitly implements the hashtable
   			contain only unique elements
      			only one null is allowes
	 		unorder set
//              --> LinkedHashSet class
			orereed verion of hashset - maintain doubly-linnked list accross all elements
   			preserves the insertion order
//              --> SortedSet(interface) -->TreeSet class
			all elements of sorted set implements the comparable interface
   			sorted in ascending order
      			tree-set - uses tree for storage - self balancing tree -red - black 
	 			   sorted and ascending order 
      
	does not define the order 
 	not support the index base search
  	do not conatin duplicates
   
//Map Interface --> key-value pair
//              --> HashMap
			non synchronize 
   			allows only one null key but multiple null values
//              --> LinkedHashMap
//              --> HashTable
			synchronized
   			does not allow any null key or value
//              --> SortedMap -->TreeMap
			entries are maintained in ascending key order
   			tree map - implicitly implements the red-black tree , can not store null key 
	does not extend collection interface as have a key value pair rest only have the collection of objects which are sorted in a structured manner put(K,V) rest have add(E e) 
	can only conatin a unique key
 	can have duplicate values

HashMap
works on hasing principle, where hash function is used to link key and values in hashMap, the hashcode method will give us the index that is the bucket location where we can strore value 
and to retrieve object we use key get(key) 
if two keys return same hash index collision occurs - then linked list is formed at that location 
in case of collision to search correct value from linked list we use equals() method

fail fast - iterator throws ConcurrentModificationException when one thread is iterating over a collection and other thread structuralyy modify collection either by adding, removing or modifiing the object on underlying collection
	    immediaately throw exception 
fail safe - does not throw the exception if collection is modified while one thread is iterating over it because they word on clone of collection instead of original collection 
Blocking queue - thread safe queue to put or take elements 
		 multiple threads can work simultaniously 
   		 if a thread tries to take elemet form queue and there is none left, the thread can be block untile there is an element to take 
 
Lambda Expression
--
//why lambda --> enable function programing
//               redable and concise code
//               easier to use APIs and libraries
//               Enable support for parallel processing

//functional programing --> 
//in OOPs every thing is an object
//all code blocks are associated with classes and objects / we can not have function in isolation 
//lambda allows to assign method to varible


greetingFunction = public void perform(){  // assigning method to varible
    System.out.println("hello word");
}
greetingFunction = void perform(){ //removed public(access modifier) as function is not part of class 
    System.out.println("hello word");
}
greetingFunction = void (){ //no need of name as it will be refered by the variable name  = greetingFunction
    System.out.println("hello word");
}
greetingFunction =  (){ //no need of return type java compiler will figure out by looking at the code
    System.out.println("hello word");
}
greetingFunction = () -> { // add arrow -> /syntax of lambda expresion
    System.out.println("hello word");
}
greetingFunction =()-> System.out.println("hello word");//no need of parenthesis {} if one line of code /inline function

doubleNUmberFucntion = (int a) -> return 2*a; 
doubleNUmberFucntion = (int a) ->  2*a; // we can also remove return
doubleNUmberFucntion = a ->  2*a;//remove paranthesis if there is only one argument
addFunction = (int a , int b) -> a+b;

//in order to declair lambda function create interface
//interface method defines the return type of lambda function
//lambda expression signature should match the method signature of interface method

// we are implementing the interface without creating a class 
// we are using method / function to implement the interface
// lambda expresion is other way / shortcut to create anonymous inner class in java  / not exactly same

interface MyLambda{  //this interface is going to be the return type of greetingFunction variable
    void function();
}
MyLambda greetingFunction =()-> System.out.println("hello word");

//functional interface - have only one abstract method
interface AddLambda{
    int add(int a, int b);
}
AddLambda addFunction = (int a , int b) -> a+b;

AddLambda addFunction = (a,b) -> a+b; //we can remove the arguments type complier will pick it from interface

//TypeInterference
interface StringLength{
    int getLength(String s)
}
StringLength slambda = s -> s.length();
System.out.println(slambda.getLength("hello world"));

//function interface
// interface having one abstract method
// we use annotation @FunctionalInterface to mark interface as functional interface

List<Person> people = Arrays.asList(
            new Person(String"firstName", String "lastName" ,int age),  
            new Person("charls", "Dickens" ,60)
            new Person("lewis", "carroll" ,42)
            new Person("thomas", "bronte" ,51)  
             new Person("matthew", "arnold" ,39));

//sort the list by last name
Collections.sort(people, (p1,p2) -> p1.getLastName().compareTo(p2.getLastName()));

//print all people from list last name start with letter "C"
printAll = (people , p -> p.getLastName().startsWith("c"));
 

//print all

printConditionally (people , p -> true,  p ->System.out.println(p) );
//print conditionally
public void printConditionally(List<Person> people , Predicate<Person> condition,Consumer<Person> consumer){
    for(Person p : people){
        if(condition.tets(p)) // condition which return boolean
        consumer.accept(p);
    }
}

//java.util.functions  -- look into  it 

//exception inlambdas
lambda (a , b) -> {
    try{
        //function 
       System.out.println(5 / 0);
    }catch(Exception e){
        System.out.println(e.getMessage());
    }
}

//method references
public class MethodReference {
	public static void printMessage() {
		System.out.println("hello");
	}
	public static void main(String[] args) {
		//Thread t = new Thread(()-> printMessage()); //we are calling a method with no args/params
		Thread t = new Thread(MethodReference::printMessage);//method reference expression same as lambda expresstion
		t.start();
	}
}

//foreach
people.forEach(p -> System.out.println(p));
people.forEach(System.out::println);



stream
--
//A sequence of elements supporting sequential and parallel aggregate operation.
if we want to process the bulk objects of collection then we use stream
it is special iterator class that allows processing collection of objects in functional manner 
java io streams are related to files 

Stream s = collectionObject.stream();
public class Stream {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(5,50,75,40,25, 10, 15, 35, 20);

//		 filter --> used to filter the data from Stream.
//		 creates a new stream,
//		 it takes a predicate as an argument which returns boolean value
//		 it is intermediate operation

		List<Integer> filteredList = list.stream().filter(i -> i % 2 == 0).toList(); / collect(Collectors.asList());
            System.out.println(filteredList);
        //people list is above in lambda
        List<Person> FilerPeople = people.strem().filter(p -> p.getLastname().startWith("C"))
                                                 .forEach(p -> System.out.println(p.getFirstName()));
		

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
        .count()
		
		
 	}

}

MultiTreading 
--
//multitasking allows several activites to accur concurrently on the computer
//process-base multitasking -->
// allow processes (i.e programs) to run concurently
//thread-base multitasking -->
//allow part of the same program to run concurrently on the computer
//two threads share the same address space , os switching between threads is less expensive than between processes
//cost of communication is also low in thread

//why multiTreading
//in a single threaded env, only one task at a time can be performed
//CPU cycles are weasted .eg when waiting for user inout
//multitasking allows idle CPU time to be put to good use

//Thread
//is an independent sequential path of execution with in a program
//many threads can run concurrently
// threads in program exist in common memory sapce, so shares the same data and code

//Main thread
//when a stand alone apllication us run. a user thread is automatically created to execute the main() method of 
// the application-- called main thread
//program ends when main() thread finishes executing 
//all other threads are child threads

//the run time env distinguished between user threads and daemon threads
//user thread given a preference over a deamon
//when user thread finish executing program ends whether deamon is finished or not

//creation
java.lang.Thread class
java.lang.Runnable interface

//Synchronisation
//thread share the same memory space i.e they can share same resources/objects
//however, there are critical situations where it is desirable that only one thread at a time has access to shared
//resources


Object lock = new Object();
public boolean push(int data){
    //Synchronized block
    Synchronized(lock){  //until lock is relese by perticuler thread other will not get the access to resources
        if(isFull){
            reutrn false;
        }
        ++top;
        try{
            Thread.sleep(1000);
        }catch(Exception e){}
        array[top] = data;
        return true;

    }
}
//or we can make method synchronized
public synchronized int pop(){
    Synchronized(lock){
        if(isEmpty){
            reutrn -1;
        }
        int top = array[top];
        try{
            Thread.sleep(1000);
        }catch(Exception e){}
        top--;
        return top;

    }
}

//while the thread is inside a synchronized method of an object, 
//all other thread wish to execute the same synchronized methos have to wait
//thread must have the object lock

//Volatile keyword
// directly update the resouce in main memory instead of cache

//producer consumer

public class BlockingQueue {
	
	private Queue<Integer> q;
	private int capaciry;
	
	public BlockingQueue(int cap) {
		this.q = new LinkedList<>();
		this.capaciry = cap;
	}
	
	public boolean add(int item) {
		synchronized (q) {
			//while over if loop if there are more than 1 threads are in waiting state
			while(q.size() == capaciry) {
				try {
					q.wait(); //waiting for remove() to notify
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				//return false;
			}
			q.add(item);
			 // notify all(particularly remove method) that item has been added 
			//so they can start the exexution
			q.notifyAll(); // notify all(particularly remove method) that item has been added 
			return true;
		}
	}
	public int remove() {
		synchronized (q) {
			while(q.size() ==0) {//if no items in queue remove operation has to wait
				try {
					q.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				//return -1;
			}
			int item = q.poll();
			//notifies to add method that it has some space to add item 
			q.notifyAll();
			return item;
		}
	}
}

//Thread state

// new --> ready-->running --> dead
//                    |
//                     -> non runable state (sleeping /waiting / blocked) -> again goes to ready ->running ->dead

//thread joining  .join()
//thread priority  setPriority()  / getPriority();

//deadLock
// thread waiting for other thread to relinquish the lock -- both remain waiting forever

String lock1 = "aaa";
String lock2 = "bbb";

Thread thread1 = new Thread(()->{
    synchronized(lock1){

    }
});

Thread t1 = new Thread( ()->{
    synchronized(lock1){
        try{
            Thread.sleep(1);
        }catch(Exception e){
            e.printStackTrace();
        }
        synchronized(lock2){
            System.out.println("lock acquired");
        }
    }
}   , "thread1");
Thread t2 = new Thread( ()->{
    synchronized(lock2){
        try{
            Thread.sleep(1);
        }catch(Exception e){
            e.printStackTrace();
        }
        synchronized(lock1){
            System.out.println("lock acquired");
        }
    }
} , "thread2");

Design Pattern
--

Creational pattern - 
Behavioural pattern
Structural pattern
J2EE pattern - 

DSA
--
//LinkList -->
//variable size
//non contiguous memory
//insert in O(1)
//Search in O(n)
//structure --> node --> data + next node address
//Types -->Singular  , Double,  Circular

//Stack
//last in first out
// push(), pop(), peek()  -->O(1)


//queue
//first in first out
//enque(), dequeue(), peek()/front -->O(1)

//tree / binary tree
//hirarchical data structure
//preOrder --> root - left - right
//inOrder --> left - root - right

//Binary Search Tree
//left subtree Nodes < root
//right subtree nodes > root
// left and right subtree are also BST if there is no duplicates
//inorder traverdsal of BST is always sorted 
//skewed tree -- all nodes on either left side or right side


//HashSet
//set --> not duplicate allowed / unordered
//insert - O(1)
//search - O(1)
//delete - O(1)
HashSet<Integer> set = new HashSet<>();
//insert
set.add(1);
set.add(2);
set.add(3);
set.add(1);  // will not be stores - duplicate
//search
set.constants(1);
//delete
set.remove(1);
//print all
System.out.println(set);

//Iterator
java.util.Iterator;   //hasNext() , next()
Iterator it = set.iterator();
while(it.hasNext){
    System.out.println(it.next());
}


//HashMap --> key-value pair

HashMap<String , Integer> map = new HashMap<>();
//insert
map.put("india", 120); 
map.put("china", 110); 
map.put("usa", 100); 

//print
System.out.println(map);
map.put("china", 115); //--> china value will be updated

//search
map.containsKey("china");

//get
map.get("china");

//iteration
for(Map.Entry<String , Integer> e : map.entrySet()){
    System.out.println(e.getKey() + " " + e.getValue());
}

Set<String> keys = map.keySet();
for(String key : keys){
    System.out.println(key +" "+ map.get(key));
}

//delete
map.remove("china");

//Trie 
//prefix , digital search, retrievel tree


//Graphs
//vertex -- node / data
//edges -- connection between nodes  --> gives direction
//uni-directional  --
//Bi-directional / Unidirectional 

//edges Weight - 
//Weighted - 
//un-Weighted -

//types
//eg - undirected - weighted graph ...

//storing graph
//Adjecency List
// -- list of Lists 
//Adjecency Matrix
//--space o(v2) neighbore O(v)
//Edge list
//--Edges = {{0,2},{1,2},{1,3},{2,3}}
//2D Matrix(implicit graph)
//

//graph traversals
//BFS
//DFS

//topological sorted
//directed acyclic graph is a directed graph with no cycles
//topological sorting used for only DAGs
//it is a linear order of vertices such that every directed edge u->v, the vertex u comes before v in the order


//Cycle in graph
//undirected graph --> can detect cycle using dfs , bfs, disjoint set union(dsu)
//directed graph --> dfs, bfs , topological sort(kahn's), graph colouring 

//Dijkstra's Algorithm
//shortest distance from the source to all vertices
//relaxation
//do not work for negative weight cycle

//Bellman Ford algorithm
//weight having -ve values


//Minimum Spannig Tree  -- undirected + connected + weighted + no-cycle
//MST or minimum weight spanning tree is a subset of the edges of a connected, edge-weighted undirected
// graph that connects all the vertices together, without any cycles and with the minimum possible 
//total edge weight

//Prim's algorithm --
//MST Set

//Strongly connected Component
// SSC is a component in which we can reach every vertex of the component from every other vertex

//Kosaraju's Algorithm
// get all nodes in stack(topological sort)
//transepose the graph
//do DFS according to stack nodes on the transpose graph

//Bridge in graph  --undirected graph mostly
//bridge is an edge whose deletion increases the graphs number of connected components
//Tarjan's algorithm

//Articulation point --remove vertex graph disconnects 
//A vertex in an undirected connected graph is an articulation point (or cut vertex) if removing it
//(and edges through it) disconnects the graph.



## SQL
--

Subset of SQL

DDL - Data Defination Language
- consist of the commands that can be used to define the database schema
- create , alter, rename, truncate, drop 

DQL - Data Query Language 
- select 

DML - Data Manipulation Language
- consists of the commands that deals with the Manipulation of data present in database
- insert, update, delete 

DCL - Data Control Language
- includes commands which deals with rigths, permission and other controls of the database
  eg - user permissions

TCL - Transaction Control Language
- includes the commands which deals with the transaction of database


DBMS - Database Management system
- is software application that interacts with the user, applications and database itself to capture
 and analyse data the data stored in the database can be modified, retrieved and deleted,
can be of any type like strings, numbers, images etc

SQL and MySQL 
sql - is a standard language Structure Query Language based on the english language
      it is a core of relational database which is used for accessing and managing database

MySQL - open source relational database management system that work on many platforms.
        provide multi-user access to support many storage engine and backup by oracle


SQL - query language that allows you to issue a single query or execute a single insert / update / delete

PL/SQL - Procedural language / SQL which allows you to right full program (loops/ variables) 
         to accomplish operations such as select/insert/update/delete

Data Integrity - defines accuracy of the data
                 consistency of the data
                 integrity constrains to enforce business rules on data

Table - collection of data in an organised manner in the form of rows and columns
field - number of columns in database

Char - char is used for strings of fixed length.
    eg char(10) - can store 10 characters and will not be able to store a string of any other length

VarChar2 - used for character strings of variable length.
           eg varchar(10) can store any length i.e 6,8,2 in this variable

Primary Key - a set of attributes that can be used to uniquely identify every tuple is a primary key.
             if there are 3-4 candidate keys present in a relationship, one can be chosen as primary key

Unique Key - uniquely identifies the single row in the table
             multiple values allowed per table
             null values are allowed
             duplicate values are not allowed

Foreign key - maintains referential integrity by enforcing a link between the data in two table.
              foreign key in child table references the primary key in the parent table.
              foreign key constrain prevents actions that would destriy the link between the child and parent tables.

Index - performance tuning method, allows faster retrieval of records from the table 
        create an entry for each value

Unique Index - index does not allow the field to have duplicate values if the column is unique indexed
               if a primary key is defined, a unique index can be applied automatically

Clustered Index - used for easy retrieval of data from database ans is faster
                  reorder the physical order of table and search on the basis of key value
                  alters the way records are stored in database as it sorts out rows by the column which is set to be clustered Index
                  one table can have only one clustered Index

Non Clustered Index - used for easy retrieval of data from database ans is slower
                      does not alter the way it was stored but it create seperate object within a table which point back to
                      the original table rows after searching 
                      one table can have many non-clustered Index


Constrains - are used to specify the limit on the data type of the table 
             it can be specified while creating or altering the table statement
    eg - 
        NOT NULL -ensure that a null value can not be stored in column
        UNIQUE - makes sure that all the values in table are unique 
        CHECK - ensure all the values in column satisfy a specific condition
        DEFAULT - consists of a set of default values for a column when no value is specified
        INDEX - used to create and retrieve data from the database vrey quickly

    levels of constrains - column level 
                           Table level

delete --> delete command use to delete a row in a table
           we can rollback the data after using delete command
           it is a DML command Data Manipulation Language
           slower than truncate statement

Drop --> removes the table and it con not be rolled back from the database  //table

truncate --> used to delete all the rows from a table //rows of table
             can not rollback the data
             it is a DDL command Data Defination Language
             it is faster

joins - a join clouse is used to combine rows from two or more tables, based on a related column between them.
 it is used to merge two tables or retrieve data from them

join types
Inner join - returns those records which have matching values in both tables

Full join - returns all those records which either have a match in the left or right table.

Left join - returns records from the left table, and also those records which satisfy the condition from right table

Right join - returns records from the right table, and also those records which satisfy the condition from left table

Cross join - produces the cross product or cartesian product of two tables

Natural join - based on all columns having the same name and data types in both  the tables

Common records from two tables - 
    select column1, cloumn2  .. from table_names where condition ...
      intersect
       select column1 , column2 .. from table_name where condition ..
    eg select studentID from student Intersect select studentID from Exam 

Manipulation functions in SQL - 
    lower  - return string in lowercase
    lower('string');
    upper - return string in uppercase
    upper('string')
    initcap - first letter in upper and rest in lower case
    InitCap('string')

Set operators - 
    left query 
    right query - 
    result - 

    union  - combine unique rows

    interset - return only common rows

    minus - will get only those rows which are not included on right query 

SubQuery - is a query inside query where query is defined to retrieve data or information back from database
           subqueries always executed first and the result of subquery is passed on to the main query
           eg = select lastname, fisrtname from employees where addressCode in(
            select addressCode from office where country ="india"
           )

Alias - name can be given to any table or a column. 
        the alias name can be referred in where clause to identify a perticular table or a column
        eg - select emp.empID, dept.result from employee emp, department as dept where 
        wmp.wmpID = dept.deptID


Aggregate Function - 
        use to evaluate the methemarical calculation and retrun a single value.
        these calculations are done from the columns in a table.
        eg - max() , count() 

Scalar Function  -return a single value based on the input value.
        eg UCASE() , NOW()

Alternate records from Table - 
    to display the even number 
    select studentID from (select rowNo, studentId from student) where mod(rowNo,2) = 0;

    to display odd number 
    select studentID from (select rowNo, studentId from student) where mod(rowNo,2) = 1;

Operators used in pattern matching - 
    % - it matches zero or more characters 
    select * from student where studentName like '%a';

    _ - it matches exactly one character 
    select * from student where studentName like 'ABC_'

unique record from table -  Distinct keyword 
    select Distinct studentID from student;

first 5 chars from string - 
        subString - 
        select subString(studentName ,1,5) as studentName from student ;

        Right()
        select right(studentName , 5) as studentName from student ;

count the number of records in table

select * from table;
select count(*) from table;
select rows from sysindexes where id = object_id(table1) indid < 2;

Entity - a person, place ,or a thing in the real world about which data can be stored in a database.
         table store data that represent one type of Entity
         eg bank database has customer table

Relationships- relation or links between the entities that have somthing to do with each other.
               eg - customer name has relation with account number

ACID properties
A - Atomicity 

C - Consistency

I - Isolation

D - Durability 

Trigger 
are a special type of stored procedures that are defined to execute automatically
 in place or after data modification it allows you to execute a batch of code when an insert,
  update or any other query is executed against a specific table

Before insert - activated before data is inserted into the table
After Insert - activated after insert
Before update - 
after upadte - 
before delete - 
after delete - 

Operators available in SQL - 
Arithmetic -
Bitwise - 
Comparison - 
Compound - 
Logical - 

Null value - represents a value which is unavilable ,unknown, assigned or not applicable 
             whereas a zero is number and blank space is character


View - is a virtual table which consist of a subset of data contained in a table.
       since view are not present, it takes less space to store. view can have data from one or more tables
       combined and it depends on the relationship 
       view refers to a logical snapshot based on a table or another view 

    used for - restricing access to data
               making complex queries simple
               ensuring data independence
               providing different views of same data 

Denormalization - refers to a technique which is used to access data from higher to lower forms of database
                  increase the performance of the entire infrastructure as it introduces redundancy into a table
                  Adds the redundant data into a table by incorporating database queries that combine data 
                  various table into a single table 

Normalization  - is the process of organizing the data to avoid duplication and redendency
    advantages - better database organization
                 more table with smaller rows
                 efficient data access
                 greater flexibility for queries 
                 quickly find the information
                 easier to implement sequrity
                 allows easy modification
                 reduction of redundant and duplicate data
                 more compact database
                 ensure consistent data after modification

Types of Normalization -
1 NF - each table cell should have a single value , all records must be unique

2 NF - database should be 1 NF and should also have single column primary key 

3 NF - should be 2 NF and must have any transitive functional dependencies.

BCNF - if database 3 NF, there would be some scenarios where anamalies would be present, if you have more than 
       one candidate key. then BCNF comes into role, where you divide your tables furthre so that there would be
       only ine candidate key present

Group functions 
group functions work on the set of rows and retruns one result per group 

Avg  - 
count 
max
min 
sum 
variance


Relationships - relation or links are between entities that have something to do with each other.
    One to one 
    One to many
    Many to One 
    self- referencing relationship

Null values can be inserted in following ways - 
    implicitly by omitting column list
    Explicitly by specifying null keyword in the value clause  

Between  -> used to display rows based on a range of values in a row
            eg - select * from student where rollNo between 10 and 50;

In -> used to check for values contained in a specific set of values
      eg - select * from student where rollNo in (8,15,25);

SQL function - are used for 
    to perform some calculation on data
    to convert the data type
    to modify individual data items
    to maintain the output
    to format dates and numbers

Merge functions - allows conditional update or insertion of data into a table
                  it performs an update if a row exists or an insert if row does not exists

Recursive stored procedure - refers to a stored procedure which calls by itself 
                  until it reaches some boundary condition 
                  helps the programmers to use the same set of code n number of times.

Clause in SQL - helps to limit the result set by providig a condition to the query.
                a clause helps to filter the rows from the entire set of records 
                eg where , having clause
            
Having clause - can be only use with select statement 
                usually used in a Group By clause 

Where clause - where clause is applied to each row before they are part of the Group By Function in a query.

Auto-increment - allows user to create unique number to get generated whenever a new record is inserted in table
                 the key is usually required whenever primary key is used

Datawarehouse - refers to a central repository of data where the data is assembled from multiple sources 
                those data are consolidated , transformed and made available for the mining as well as online processing
                warehouse data also have a subset of data called data marts 

Stuff function - used to overwrite the existing character ot insert a string into another string
                 Stuff(string_expression, start, length, replacement_characters)

replace function - this function is used to replace the existing characters of all the accurrences. 
                 replace(string_expression, search_String, replacement_string)
      


Stored Procedure 
    - a function which consist of many SQL statements to access the database system
      several SQL statements are consolidated into a stored procedure 
      and are executed whenever and whenever required  
      saves time and avoid writing code again and again 

    advantages - used as modular programming which means create once
                 can call for several times whenever it is required 
                 support faster execution 
                 reduce network traffic and provide better security to the data 

    disAdvantages - it can be executed only in the database and utilizes more memory in database server 

    collation is defined as a set of rules that determines how data can be stored as well as compared
    character data is stored using the rules that define the correct character sequence along with operations for 
    specifying case-sensitivity ,character width etc. 

    Collation types- case sensitivity, kana sensitivity, width sensitivity, accent sensitivity 


#Query

genrate date 
GATEDATE();
select gatedate();
SELECT CURRENT_TIMESTAMP 

sql query to find employee with name 'A' 
select * from employee where EmpName like 'A%' ;

3rd highest
select top 1 salary from (select top 3 salary from employee_table order by salary Desc) as emp order by 
                salary ASC;


CHAR  --  string(0-255), can store characters of fixed length
VARCHAR --  string(0-255), can store characters up to given length 
BLOB -- string(0-65535), acn store binary large object 
INT -- integer (-2,147,483,648 to 2,147,483,647)
TYNYINT -- integer (-128 to  127)
BIGINT -- Integer (-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807)
BIT -- can store x-bit values. x can range from 1 to 64
FLOAT -- decimal number - with precision to 23 digits
DOUBLE -- decimal number - with 24 to 53
BOOLEAN -- boolean value 0 or 1
DATE -- date in format of YYYY-MM-DD ranging from 1000-01-01 to 9999-12-31
YEAR -- year in 4 didgits format ranging from 1901 to 2155

Queries  -
create database db_name;
create database if not exists db_name;

Drop database db_name;
Drop database if exists db_name;

show databases; 

use db_name;

create table table_name (col_n1 dataType constraint , col_n2 dataType, col_n3 dataType);

show tables;

insert into table_name (col1_name, col2_name, col3_name ..) values(col1_val1, col2_val1), (col1_val2,col2_val2);

create database college;

use college;

create table student(
	id int primary key, name varchar(50) unique, age int not null
);

insert into student values(1,"chetan",30);
insert into student values(2,"aakka",25);

select * from student;

select col_1, col_2 from student; 

select * from student where marks > 90;

using operators in where 
arithmetic  --> + ,-, * , / %
select * from student where marks+10 > 100;

comparison operators --> =, !=, >, >=, <, <=

Logical operators --> AND, OR, NOT, IN, BETWEEN,ALL ,LIKE, ANY 
select * from student where marks > 80 AND city ="pune";
select * from student where marks between  80 AND 90;  -- select in given range
select * from student where city in ("delhi", "mumbai");
select * from student where city not in ("delhi", "mumbai");

Bitwise operators --> & , | 

select * from student where marks+10 > 100; 

select * from student where marks >75 limit 3;  -- > only first 3 records 


Order by 

select * from student order by city ASC;
select * from student order by city DESC limit 3;


Aggregate - perform a calculation on a set of values, and return a single value.

select max(marks) from student
select avg(marks) from student 


Group By - group rows that have the same values into summary rows
           it collects data from multiple records and groups the result by one or more column
           generally we use group by with some aggregation function 

select city , count(name) from student group by city;

Having clause --
similar to where ie applies some condition on rows
used when we want to apply any condition after grouping 
select count(name) , city from student group by city having max(marks) > 90;

general order -->
select columns
from table_name 
where condition 
group by column 
having condition 
order by column asc ; 

update 
update table_name set cal_1 = val1 , col_2 = val2 where condition.. ;

update student set grade = "O" where grade = "A"; 

delete --> delete from existing rows 
delete from table_name where condition ..

delete from student where marks < 33;

ALTER TABLE dept ADD deptId int;

Foreign Key -- > 
create table dept(
	id int primary key, name varchar(50)
);

create table teacher(
	id int primary key, name varchar(50), deptId int, foreign key(deptID) references dept(id)
);
create table teacher(
	id int primary key, name varchar(50), deptId int, 
    foreign key(deptID) references dept(id) on update cascade on delete cascade
);


Alter --> changes the schema

ALTER TABLE student ADD age int;

ALTER TABLE student DROP age;

ALTER TABLE student RENAME TO new_student;

ALTER TABLE student CHANGE id student_id int;

ALTER TABLE student MODIFY marks DOUBLE ;

Truncate table studnet;   


Joins 
select * from emp inner join salary on emp.id = salary.id;
select * from emp as e left join salary as s on e.id = s.id; 
select * from emp right join salary on emp.id = salary.id;
full join 
select * from emp as e left join salary as s on e.id = s.id 
Union 
select * from emp right join salary on emp.id = salary.id;

self join 
select a.name as manager_name, b.name from emp as a join emp as b on a.id = b.managerId;

subquery 
select * from student where marks > (select avg(marks) from student);

Views 
create view view1 as select id , name from student;
select * from view1;


SQL 
data is represented in tables
predifined schema
vertically scalable
support automic operations
support join operations


##
MongoDB
is NoSQL (not only query) database that stores large volumes of data inthe form of documents .this offers the developers teh flexibility to work with evolving data models.
alternative NOSQL DBs - Cassandra, Amazon DynamoDB, redis, Apache Hbase , neo4j

the schema of a database describes the structure of the data to be stored , schema is defined by tables, fields, and relation between them 
mongoDb facilitates flexibility  into schema design thereby organizing storage of data as key value pairs into lightweight json document 

MongoDB
data is represented in documents
Dynamic schema
horizontal and vertically scalable
no proper support for transaction
does not support join

database  - 
collection  -- >  same as table in sql but donts have fixed structure
document  -->  dont have fixed schema , one document can be different than other document in same collection
field 

mongodb replication   -
duplicating same data across multiple server

shrading - distributing data across multiple database 
Shard key - is used by MongoDb to distribute the documnet of a collection across shards

Aggregation in MongoDB - 
acts on group of values from multiple documents, perform operations on teh grouped values and retrun a single computed result
aggresion pipeline - 
map reduce operation - is data processing paradigm for condensing large volumes of data into useful aggregated results
single purpose aggregation - 

match 
group 
sort

$SUM
$AVG
$MIN
$MAX
$PUSH

_id  - auto created unique value 


BAckup and Restoring in MongoDB 
- Mongoimport
- Mongoexport
- MongoDump
- MongoRestore

DataBase Profiler - is used to collect information regarding the queries which are executed on an individual database instance.


regex --
db.collection.find({$regex:/pattern/})
to open in a local terminal - mongosh

commands -

show dbs

use database 

insertOne - 
db.inventory.insertOne(
   { item: "canvas", qty: 100, tags: ["cotton"], size: { h: 28, w: 35.5, uom: "cm" } }
)

insertmany - 
db.inventory.insertMany([
   { item: "journal", qty: 25, size: { h: 14, w: 21, uom: "cm" }, status: "A" },
   { item: "notebook", qty: 50, size: { h: 8.5, w: 11, uom: "in" }, status: "A" },
   { item: "paper", qty: 100, size: { h: 8.5, w: 11, uom: "in" }, status: "D" },
   { item: "planner", qty: 75, size: { h: 22.85, w: 30, uom: "cm" }, status: "D" },
   { item: "postcard", qty: 45, size: { h: 10, w: 15.25, uom: "cm" }, status: "A" }
]);

db.inventory.find()  --> fetch all
db.inventory.find( {} )

db.inventory.find( { status: "D" } )

db.inventory.find( { status: { $in: [ "A", "D" ] } } )

db.inventory.find( { status: "A", qty: { $lt: 30 } } )  -- and

db.inventory.find( { $or: [ { status: "A" }, { qty: { $lt: 30 } } ] } ) --or 

db.inventory.find( {
     status: "A",
     $or: [ { qty: { $lt: 30 } }, { item: /^p/ } ]
} )  and + or


update --

db.inventory.updateOne(
   { item: "paper" },
   {
     $set: { "size.uom": "cm", status: "P" },
     $currentDate: { lastModified: true }
   }
)

db.inventory.updateMany(
   { "qty": { $lt: 50 } },
   {
     $set: { "size.uom": "in", status: "P" },
     $currentDate: { lastModified: true }
   }
)

db.inventory.replaceOne(
   { item: "paper" },
   { item: "paper", instock: [ { warehouse: "A", qty: 60 }, { warehouse: "B", qty: 40 } ] }
)



