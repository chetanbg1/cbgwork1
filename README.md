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

//patterns
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

//Strings
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

//OOPs
// this kewaord = tells us which object call the fuction or varible --refers to current object
//Constructor argument / no - argument / default   
//copy constructor -->passing constructor in the argument of other constructor 

//Polymorphism
//method overloading --> complile time polymorphism
//method overriding -->  runTime Polymorphism

//Inheritance
//once class can inherite properties of other class
//single level
//multilevel
//hirarchial inheritance one class extended by many classes
//hybrid 
// multiple inheritance is not supported in java

//Encapsulation -->combining data and method / data hiding
//package -- > all related classes we put it in package
//access modifiers
//public  --> any one can access across all the classes and packages
//default --> can access within the package
//protected --> can access in same package plus other packages having subclasses
//privtae -->access only with in class

//Abstraction -->only importent things user can see/ hide all unneccessary things from user
//Abstract class -->just a concept --only method declaration no defination
//now we can have abstract or normal methods
//we can not create the object of abstact class
//can have constructors and static methods--> constructor chaining
//can have final method which will force subclass not to change the body of method


//Interface  --> pure abstraction
//no constructor
//no method implementations
//all fields bydefault public, static and final
//all methods are public and abstract
//class that implements an interface must implement all the methods declared in the interface
//support the functionality of multiple inheritance

//static --> common property of class accessible to all
//properties , method, block , nested class
//memory allocate only once



//ArrayList
//ArrayList<Integer> list = new ArrayList<>();
//can store element in non continuous way with no fix size
//can store only objects
//gets created in heap memory
//method - add(), set(),get(),remove(),size(),sort()->(Collection.sort(arrayList))


//Collection Framework
//Iterable Interface --->Collection Interface --> List Interface
//                                            --> Set Interface
//                                            --> Queue Interface
//methods --> add, size, remove, iterate, allAll, removeAll, clear
//List Interface --> ArrayList Class
//               --> LinkedList Class
//               --> Vector Class  (same as LinkedList threadsafe) --> Stack

//Queue interface --> PriorityQueue class
//                --> LinkedList class
//                --> Deque Interface --> ArrayQueue class

//Set interface --> HashSet class
//              --> LinkedHashSet class
//              --> SortedSet -->TreeSet class

//Map Interface --> key-value pair
//              --> HashMap
//              --> LinkedHashMap
//              --> HashTable
//              --> SortedMap -->TreeMap

//DSA
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





