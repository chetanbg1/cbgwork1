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
	it is a platform
	runtime environment in which java byteCode(.class files) can be executed 
 	java's platform independence mostly consist of JVM 
  	JVM is aware of OS thats why JVM is platform dependent 
   	it provides environment based on operating system to run .class file 
 	.java --> compiler --> .class(Bytecode)  --> 
  			       jvm (machinecode)--> classLoader --> 3 types of class loader
       						is part of JVM that dynamically loads the java classes into the JVM
       						-> bootstrape classloader -- lib/rt.jar --> conatins existing .java classes given by java people
	     					-> extension classloader -- jre/lib/ext --> loads the class from JDK extensions 
	   					-> application classloader -- our own code class path 
       						byteCode verifier --> 
							JVM memory(main memory) --> 5 parts 
       								class /method area -> class structure
	       							heap -> objects
	       							stcak -> object reference
	       							PC register  -> conatins which perticular instruction is running in jvm
	       							native memory -> rearly used as stack contains all the native maehtods 

	       						--> Execution Engine -->
	      								JIT --> if code is large interpreter will take more time, to increase efficiency JIT is introduced, it read the chunck of code not line by line 
	  								Interpreter --> interprite the .class file  line by line - > convert it into machine code 
									Garbage Collector --> clears the memory 
JIT just in time compiler
	java source code --> JDK (javac.exe) --> byte code -->JRE(interpreter + JIT compiler) --> machine code
 	JIT is used to optimise the performace of java code at run time - its helps code to fastly compile 
	
 1. What is the Java memory model?
Answer:
The Java Memory Model (JMM) defines how Java threads interact through memory and what behaviors are allowed in concurrent execution. It ensures consistency and visibility of variables across threads.
🔹 2. What are the different memory areas allocated by the JVM?
Answer:
Heap – Stores objects and class instances.
Stack – Stores method calls and local variables.
Method Area – Stores class metadata and static variables.
PC Register – Stores address of current instruction.
Native Method Stack – For native (non-Java) method calls.
🔹 3. What is the difference between Heap and Stack memory?
Answer:
Heap: Shared memory for all threads, stores objects.
Stack: Thread-specific, stores method calls and primitives.
Heap is slower but flexible; stack is faster but limited.
🔹 4. What is garbage collection in Java?
Answer:
Garbage collection is the process by which the JVM automatically removes unused or unreachable objects from the heap to free memory.
🔹 5. What is finalize() in Java?
Answer:
The finalize() method is called by the garbage collector before an object is removed. It's used for cleanup, but it's not guaranteed to run and is largely deprecated in modern Java.
🔹 6. What are strong, weak, soft, and phantom references?
Answer:
Strong: Default reference type; prevents GC.
Soft: Cleared only when memory is low.
Weak: Cleared during GC if no strong refs.
Phantom: Used to track object lifecycle, but can't access the object.
🔹 7. What are Young and Old generations in the JVM heap?
Answer:
Young Gen: Stores short-lived objects. Has Eden and Survivor spaces.
Old (Tenured) Gen: Stores long-lived objects. GC here is less frequent but heavier.
🔹 8. How do you avoid memory leaks in Java?
Answer:
Release unused object references.
Avoid static references for large objects.
Use WeakReference for caches.
Use memory profiling tools like VisualVM or Eclipse MAT.
🔹 9. What is OutOfMemoryError and how do you handle it?
Answer:
It's thrown when the JVM can't allocate memory.
Handle it by:
Increasing heap size (-Xmx).
Optimizing memory usage.
Fixing memory leaks.
🔹 10. What are common JVM memory tuning options?
Answer:
-Xms: Initial heap size
-Xmx: Maximum heap size
-Xss: Stack size
-XX:+UseG1GC: Use G1 Garbage Collector

Variable -
	varible value keeps changing if we change, reference to the address of memery where we store the data

constants value do not change

java is typed language, meaning we can not define variable without data type
Data type 
	primitive data types
	byte  == 8 bits 1 byte    -128 to 127
	short =2byte		  -32768 to 32767              
	char  == 2bytes
	boolean ==1byte
	int  = 4 byte		  -2147483648 to -2147483667
	long  = 8 byte		  -9223372036854775808 to 9223372036854775807
	double =8  byte
	float =4 byte
java is not completly 100% object - oriented language due to premitive data types
we use Wrapper classes for primitive data type

Autoboxing - converts a primitive data type to its corresponding wrapper class
Unboxing - converts the wrapper class into the primary data type

-- pointers not allowed in java
	they are unsafe
 	increase complexity
  	JVM does the implicit memory allocation, to avoide the direct access to memory by user 

Pass by value - we dont pass the original memory address, value is copied at another memory location and that is passed so original value can not be modified  --java is pass by value 
Pass by reference - actually sending the memory object / pointer of the varible to a function , if someone modifies that varible in function we may lost the original variable 
		    changing the real address of the variable 


public static void main(Strings[] args)
public makes this method accessible from anywhere
static - we dont need to create object to call this method, indicates that the method belongs to class rather than instance of the class
void - means does not return anything 
main - name of the mathod - entry point method to jvm
String[] args - accepts the array of strings as parameter, array that hold command-line arguments passed to the program

Non-primitive data type
	//Array
	//String
	//Class
	//Object
	//Interface

conditional statement
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
        if(i==1 || ||j ==1 i==n || j==m){
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
     //2nd half
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
security because string are used in file system, network coonection, database connection, passwords, having string immutable allows us to be secure and safe 
security --> strings in java can be used to access data sources like files, database or objects found across the network also stores password and username -which can not be modified once created

Strign s1 = "abcd"; --> create a string in string constant pool
	string constant pool is memory space allocated in the heap memory to store the string literals / no duplicate strings 
 	it provide the facility to reuse the object 
String s2 = new String("abcd); --> create object in heap + object in string constant pool  == two objects will be created 

intern() --> this method id used to put the string in string constant pool

//String.class
//length();
//charAt(index);
//compare == str1.compareTo(str2);
//      s1  > s2  : +ve value   eg = hello  > cello
//      s1  == s2  : 0          eg = hello == hello
//      s1  < s2  : -ve value   eg = hellow < wello
//subString(begining index , ending index(not included));
//parsing

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

operstors
--
//Bianry ==  +,-,*,/,%
//Unary  ==  ++, --
//relational operator  ->  ==, !=, >, < , >=, <= 
//logical operator  == &&(logical and),||(logical or), !(logical not)
//Bitwise Operators --> &(binary and) == 0101 & 0110 = 0100, 
//                      |(binary or) == 0101 | 0110 = 0111,
//                      ^(binary XOR) ==0101 ^ 0110 = 1011,similar vales--> false, diff value -->true, 
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
// operation OR = n | bit mask = 0101 | 0010 = 0111

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

Serialization and Deserialization
--
	Serialization -
	is conversion of java objects into a stream (sequence) of bytes, which we can then store to a database and transfer over the network
 	class that are eligible for serialization need to implement a special marker interface Serializable 
  	byte stream is platform independent. this means we can convert it into an object and run on any envirnment 
   	conditions to be serialize -
    		implement serializable interface
      		all of the fields in class must be serializable, if not, it must be mark as transient or static 
		static fields are not serializable -as they belong to class

		// serialization of employee object
  
    		Employee e = new employee();
      			e.setId(1);
	 		e.setName("cbg");

    		FileOutputStream fileOutputStream = new FileOutputStream("D:\\serializationDemo\\cbg.ser");
      		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
		objectOutputStream.writeObject(e);
  		fileOutputStream.close();
    		objectOutputStream.close();

      Deserialization
      convert the byte stream into object we previously serialized

 	FileInputStream fileInputStream = new FileInputStream("D:\\serializationDemo\\cbg.ser");
      		ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
		Employee e = (Employee) objectInputStream.readObject();
  		System.out.println(e.getName());
  		fileInputStream.close();
    		ObjectInputStream.close();

	deserialize vulnerability 
 		malicious user tries to insert a modified serialized object into the system 

      Serial Version UID
      	the JVM associates a version (long) number with each serializable class
        we use serialVersionUID attribute to remember version of a serializable class to verify that a loaded class and the serialized object are compatible 

 	Externalization
  	 is used whenever you need to customize the serialization mechanism 
    	 JVM does the default serialization, it does not protect the sensitive information such as password and credentials 
      	 externalization give full control to the programmer in reading and writing the objects during serialization 

 		implements Externalization 
   		override two methods 
     			writeExternal(ObjectOutput out) --> add only those fields which needs to be serialize
			readExternal(ObjectInput in) --> same as above

   Transient variable - 
   	is a variable modifier used in serialization
    	if we dont want to save value of perticular variable in a file, then we use transient keyword
     	JVM come accross the transient keyword - it ignores the original value of the variable and save default value of that variable data type
      

Sorting
--
bubble sort
biggest element goes to the end after each iteration
in every iteration we are swapping pair wise
time complexity O(n^2)
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

selection sort
smallest element goes to the begining 
in every iteration we sawp only once
we find the smallest element and put it first
time complexity O(n^2)
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

insertion sort
divide the array in two parts sorted and unsorted
pick the element from unsorted part and put it in sorted part at correct sorted position
time complexity O(n^2)
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


Recursion
--
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

BackTracking
find all possible solutions and use the one you want
all possible arrangement total permutation = n!

Merge Sort
divide and conquer
 mid = s + (e-s)/2 
time complexity O(nlogn)

QuickSort
Pivot 
Partition part the array based on pivot
elements smaller than pivot will come before pivot and elements bigger than pivot comes after pivot
pivot selection ramdom , median , 1st element , last element
time complexity worst = o(n^2)  average = O(nlogn)
worst case occurs when pivot is always the smallest or largest element

Exception Handling 
--
abnormal condition which can disrupt the normal flow of program, if not handled properly program can terminate abruptly 
try - enclose the set of statements which can throw exception , hence required to be monitored. can not use try block alone, must be followed by catch or finally 
Catch - when excepti
on occurs block catches the exception and work accordingly to handle it or to throw it as required
Finally - this block get executed always regardless of exception occurence , hence clean up is done.
	  the finally block executes even if a retrun statement is used in the try catch block
   	  ensuring cleanup runs.
try-catch-finally can affect performance slightly due to overhead of managing exceptions but is generally
minimal unless exception are thrown frerquently.

we can handle multiple exceptions by seperating them with a pipe( | ) 

Throwable  --> Exception -->checked exception / compile time   --> eg - sql exception , classnotfound
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
when exception is thrown by main() method , java runtime terminates the program and prints the exception message and the stack trace is shown in-system console 
unreachable catch block -when we keep super class first and sub classes later like Exception first and then nullpointer ..in multi catch block 

Exception Propagation 
	an exception is thrown from the top of the stack and if it is not cought, it drops the stack to the previous mehtod, if not cought there, the exception again drops down to the previous method and so on unit it get cought
 	or reach the bottom of the call stack 

Final - keyword used to  apply restrictions on the class, method and variables
	the final class can not be inherited, final method can not be override, final variable can not be changed
finally - keyword used with try catch block to provide statement that will always get executed if some exception arises, used to close resources.
	finally block will not execute if the JVM exits via System.exit() during try catch execution
 	we can not write multiple try finally block in java, each try can only have one finally block 
Finalize - used to perform clean up processing just before the object is garbage collected 

OOPs
--
 this kewaord = tells us which object call the fuction or varible --refers to current object
Constructor argument / no - argument / default   
copy constructor -->passing constructor in the argument of other constructor 

Polymorphism
--
method overloading --> complile time polymorphism
	the name of method is same but they should have different number or type of parameters or order of parameters
 	the return type is not the part of method overloading ,so just changing the return type will not overload method in java  -compile time error 
  	
method overriding -->  runTime Polymorphism
	a method can only be override in sud-class, not in same class
 	Visibility - override method can not reduce the access of overridden method meaning - if method is public we can not make it protected or private while overriding 
  	Accessibility - overridiing method can increase the access of overridden method - if method is protected we can make it protected or public while overriding 
   	private, static , final method can not be overridden 
    	if super-class does not declare an exception then sub-class can only declare unchecked exception but not the checked exceptions

Dynamic method dispatch is a way java decides which method to use at runtime when method are overridden in subclass. it ensure the correct method is used based on the type of object

Covarient return type means return type may vary during overriding 

Inheritance
--
once class can inherite properties of other class
single level
multilevel
hirarchial inheritance one class extended by many classes
hybrid 
multiple inheritance is not supported in java

Association
--
Has-A realtion 
Aggregation - weak association  - one object can exist without other object,  eg Car has - A driver
Composition - strong association - one object can not exist without other object  eg Car has - a engine 

Encapsulation -->combining data and method / data hiding
--
package -- > all related classes we put it in  same package
		help in organizing code
  		prevents the naming conflict
    		support modularity by allowing developers to seperate the program
      		makes easier to locate related classes
      		
    
Access modifiers
-
public  --> any one can access across all the classes and packages
default --> can access within the package
protected --> can access in same package plus other packages having subclasses
privtae -->access only with in class
what if the method in child class is more restricted than parent  -- > compile time error , can not reduce the visibility of the method 

Abstraction -->only importent things user can see/ hide all unneccessary things from user
--
Abstract class -->just a concept --only method declaration no defination
now we can have abstract or normal methods
we can not create the object of abstact class
can have constructors and static methods--> constructor chaining
can have final method which will force subclass not to change the body of method
have instance variables - need constructor to initialize them , no such thing in interfaces

Interface  --> pure abstraction
--
abstract methods + static constants 
no constructor
no method implementations
all fields bydefault public, static and final
all methods are public and abstract
class that implements an interface must implement all the methods declared in the interface
support the functionality of multiple inheritance

marker interface - interface having no data members and functions , empty interface 
	eg - serializable , clonable 

Inner class
-
types
Member inner class
Static inner class
Local inner class
Anonymous Inner Class

In Java, an inner class is a class that is defined within another class. Inner classes are used to logically group classes that are only used in one place, increase encapsulation, and can access members (including private ones) of the outer class.

🔹 Types of Inner Classes in Java
Java supports four types of inner classes:

Non-static Nested Class (Regular Inner Class)

Static Nested Class

Local Inner Class (inside a method)

Anonymous Inner Class

✅ 1. Non-static Nested Class (Regular Inner Class)
Can access all members (including private) of the outer class.

Requires an instance of the outer class to be instantiated.


public class Outer {
    private String msg = "Hello from Outer!";

    class Inner {
        void display() {
            System.out.println(msg);  // Accessing outer class member
        }
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner(); // Creating instance
        inner.display();
    }
}
✅ 2. Static Nested Class
Does not need an instance of the outer class.

Can only access static members of the outer class.


public class Outer {
    static String msg = "Hello from Static Nested Class!";

    static class StaticInner {
        void display() {
            System.out.println(msg);  // Only static members can be accessed
        }
    }

    public static void main(String[] args) {
        Outer.StaticInner inner = new Outer.StaticInner();
        inner.display();
    }
}
✅ 3. Local Inner Class (Inside a Method)
Defined inside a method, constructor, or block.
Has access to local variables (only if they are final or effectively final).

public class Outer {
    void outerMethod() {
        int num = 10;  // effectively final

        class LocalInner {
            void print() {
                System.out.println("Value: " + num);
            }
        }

        LocalInner inner = new LocalInner();
        inner.print();
    }

    public static void main(String[] args) {
        new Outer().outerMethod();
    }
}
✅ 4. Anonymous Inner Class
Used to create a class with a method implementation on the fly, usually for interfaces or abstract classes.
Does not have a name.


abstract class Animal {
    abstract void sound();
}

public class Test {
    public static void main(String[] args) {
        Animal dog = new Animal() {
            void sound() {
                System.out.println("Bark!");
            }
        };
        dog.sound();
    }
}

Type			Static?		Can Access Outer’s Private Members				Usage Context
Regular Inner Class	No		Yes								Grouping logic,tight coupling
Static Nested Class	Yes		Only static members						Utility/helper classes
Local Inner Class	No		Yes (only final/effectively final)				Temporary use inside a method
Anonymous Inner Class	No		Yes								Quick override of methods

✅ Why Use Inner Classes in Java – Summary
Inner classes are used in Java to:

Logically group related classes – Keep helper classes close to where they’re used.
Improve encapsulation – Can access private members of the outer class.
Enhance code readability – Keeps related logic together.
Simplify event handling – Especially useful in GUI apps (e.g., Swing, JavaFX).
Avoid namespace pollution – Prevents unnecessary top-level class declarations.
Create quick, short-lived classes – Useful for implementing interfaces or abstract methods on the fly (e.g., anonymous classes).


to sort the custom object we need 
Comparable -
The Comparable interface in Java is part of the java.lang package and is used to define the natural ordering of objects. When a class implements the Comparable interface, it must override the compareTo() method, which is used to compare the current object with another object of the same type.
Comparable<generic object> has one mehod --> 
public int compareTo(Employee o){   // can sort only integer value
					return this.id -o.id;    						
    				}
	
Comparator Interface
--
compare - compare two object of same type
given object id with current object id 
public int compare(Integer o1, Integer o2)
	return o1 - o2; (Ascending order ) / return o2 - o1; (descending order)
 will return 0 if both are same
 1 if 1st parameter is > 2nd parameter  -> o2 will be first and o1 is second
 -1 if 1st parameter is  < 2nd parameter -> o1 will be first and o2 is second

Comparator - public static comparator<Employee> nameComp = new Comparator<Employee>();
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
		  so no error arises due to unimplemeted methods of interface 
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
this and super keyword cannot be used in static methods.
static method belong to class not instances, and super refers to the superclass object context which does not exist in static context

static block can throw a exception but if it does the exception must be handled within the block itself or declared using throws clause in the class 

finally block always execute in java except "System.exit()" called or system crashes 


Garbage collection 
--
is an automatic process of looking at heap memory, identifying which objects are in use and which are not, and delete the unused objects 
unused object is no longer refered by any part of program
advantage is it remove the burden of manual memory allocation or deallocation from us 
garbage collection is done in heap memory 
object is alway stored in heap memory and stack memory contains the reference to it
JVM controls the garbage collection , when it realizes that the memory is running low
we can request the garbage collection from java program but there is no guarantee that this requets will be taken care by JVM   --> System.gc()
garbage collector is demon / background thread , demon thread runbehind application ,started by JVM

ArrayList
--
//ArrayList<Integer> list = new ArrayList<>();
//can store element in non continuous way with no fix size
//can store only objects
//gets created in heap memory
//method - add(), set(),get(),remove(),size(),sort()->(Collection.sort(arrayList))


Collection Framework
--
an object that represent a group of objects, know as its elements

java.util.Collection is root of collection framework except Map interface

Iterable Interface --->Collection Interface --> List Interface
                                            --> Set Interface
                                            --> Queue Interface
methods --> add, size, remove, iterate, allAll, removeAll, clear
List Interface - an ordered collection that can contain duplicate elements
		contains ordered elements
 		may include duplicates
  		support index base search, random access 
   		elemets can be easily inserted irrespective of the position 
		--> ArrayList Class
			dynamic resizing 50% of original size , initial capacity is 10
   			not synchronized
      			time complexity 
	 			Access by index(get) is O(1)
     				add element O(n) worst case if resizing occurs
	 			remove O(n) shifting elements
     				iteration O(n)
      			Arraylist <Integer> list = new Arraylist<>();
	 		list.add(10); , list.get(0); , list.contains(10); list.remove(0); , list.add(2 , 20);(insert inbetween the index) , list.set(2 , 30);(element at 2nd index will get replaced)
               --> LinkedList Class
			implements list and deque interface
   			maintain insertion order
      			does not support accessing elements ramdomly
	 		use listIterator to iterate list 
               --> Vector Class  (same as LinkedList threadsafe) --> Stack
			is synchronized
   			maintain insertion order
      			thread safe
	 		increase size by doubling the array size
	       --> Stack
	       --> CopyonWriteArrayListList
			cpoy on write means that whenever a write operation like adding or removing an element, instead of directly modifying the existing list a new copy of the list is created and the modification is applied on that copy. This ensures that other thread reading the list while its being modified are unaffected. 
   			read operation - fast and direct, since they happn on a stable list without interference from modification
      			write operation - A new copy of the list is created for every modification.
	 				  the reference to list is then updated so that subsequent reads use this new list.
	

Queue interface collectoin designed for holding elements prior to processing
		--> PriorityQueue class
			same as queue or stack data structure 
			priority associated with each element
   			high priority elements served before a low priority irrespective of insertion order
      			the priority queue is based on the priority heap
			
    
                --> LinkedList class
                --> Deque Interface --> ArrayQueue class
			elements can be added and remove from both the ends
Set interface - can not conatin duplicate elements
		does not define the order 
 		not support the index base search
  	
		--> HashSet class
			implicitly implements the hashtable
   			contain only unique elements
      			only one null is allowes
	 		unorder set
              --> LinkedHashSet class
			orered verion of hashset - maintain doubly-linked list accross all elements
   			preserves the insertion order
              --> SortedSet(interface) -->TreeSet class
			all elements of sorted set implements the comparable interface
   			sorted in ascending order
      			tree-set - uses tree for storage - self balancing tree -red - black 
	 			   sorted and ascending order 

	     --> CopyOnWriteArraySet 
      			is a thread-safe Set implementation backed by a CopyOnWriteArrayList. It belongs to the java.util.concurrent package and is designed for use in concurrent 				applications where reads are far more frequent than writes.

✅ Key Characteristics
Feature				Description
Thread-safe			✅ Yes (no need for external synchronization)
Backed by			CopyOnWriteArrayList
Duplicates			❌ Not allowed (Set behavior)
Nulls				✅ Allows null (only one, if at all)
Performance			🚀 Fast for reads, 🐢 slow for writes (due to copying)
Use case			Ideal for read-heavy concurrent scenarios like caches, observer lists, etc.
	
   
Map Interface --> key-value pair
		does not extend collection interface as have a key value pair rest only have the collection of objects which are sorted in a structured manner put(K,V) rest have add(E e) 
		can only conatin a unique key , only one null key
 		can have duplicate values
              --> HashMap
			non synchronize 
   			allows only one null key but multiple null values
              --> LinkedHashMap
	      		LinkedHashMap is a HashMap that maintains a doubly linked list running through its entries. This allows it to preserve the insertion order (or access order, if configured).
              --> HashTable
			synchronized
   			does not allow any null key or value
              --> SortedMap(interface extend Map) -->TreeMap
			entries are maintained in ascending key order
   			tree map - implicitly implements the red-black tree , can not store null key 
      	      --> NavigableMap is an interface in the Java Collections Framework that extends SortedMap and provides navigation methods for key-value pairs. It allows retrieval of entries 		based on closest matches to given search targets.
		It is part of the java.util package, and the most commonly used implementation is TreeMap.
		does not extend collection interface as have a key value pair rest only have the collection of objects which are sorted in a structured manner put(K,V) rest have add(E e) 
		can only conatin a unique key
 		can have duplicate values
	     -->EnumMap 
      			is a specialized Map implementation designed specifically for use with enum keys. It is part of java.util and offers a high-performance, memory-efficient map when keys are from a single enum type.

✅ Key Characteristics
Feature				Description
Key type			Must be an enum type
Performance			Very fast (backed by an array internally)
Ordering			Maintains natural order of enum constants
Null keys			❌ Not allowed (throws NullPointerException)
Null values			✅ Allowed
Thread-safe			❌ Not synchronized (wrap with Collections.synchronizedMap() if needed)




how to make list read only ? 
	readOnlyArrayList = Collections.unmodifiableList(ArrayList);

HashMap
works on hasing principle, where hash function is used to link key and values in hashMap, the hashcode method will give us the index that is the bucket location where we can strore value 
and to retrieve object we use key get(key) 
if two keys return same hash index collision occurs - then linked list is formed at that location 
in case of collision to search correct value from linked list we use equals() method

Hash function
A hash function takes an input (the key) and computes an integer value called the hash code.
This hash code determines the bucket or index where the value associated with that key will be stored in the underlying array.

weakhashmap - 
	WeakHashMap is an implementation of the Map interface. WeakHashMap is almost the same as HashMap except in the case of WeakHashMap if the object is specified as the key doesn’t contain any references- it is eligible for garbage 	collection even though it is associated with WeakHashMap. i.e Garbage Collector dominates over WeakHashMap.
fail fast - iterator throws ConcurrentModificationException when one thread is iterating over a collection and other thread structuraly modify collection either by adding, removing or modifiing the object on underlying collection
	    immediaately throw exception 
fail safe - does not throw the exception if collection is modified while one thread is iterating over it because they work on clone of collection instead of original collection 
Blocking queue - thread safe queue to put or take elements 
		 multiple threads can work simultaniously 
   		 if a thread tries to take elemet form queue and there is none left, the thread can be block untile there is an element to take 

Concurrent Collection
	why - traditional collection are not thread safe, only few calsses like Vector, HashTable are threadsafe
 	      collections provide some methods like synchronizedList, synchronizedMap, synchronizedSet those provide thread safty but the problem is they capture lock on complete collection even for reading that decrease performance
	      if one thread iterates and other tries to  modify structureal changes then concurrentModificationException is thrown 
	so the concurrent collections classes do not throw this exception 
		ConcurrentHashMap -> in ConcurrentHashMap lock is acquired on bucket level so at a time multiple thread can capture lock on diff diff buckets  -> concurrencyLevel -> it create 16 buckets on collection so 16 threads can works on collection 
  		simultaneously 
  		CopyOnWriteArrayList
    		CopyOnWriteArraySet
ConcurrentSkipListMap is a concurrent, sorted, and navigable implementation of the Map interface. It is part of the java.util.concurrent package and is implemented using a skip list data structure.

✅ Key Characteristics
Feature   			Description
Thread-safe			Yes – supports concurrent access without locking the entire map
Sorted (Natural Order)		Yes – maintains keys in ascending order
Implements			ConcurrentNavigableMap<K,V>
Allows nulls			❌ No – neither null keys nor null values
Performance			Fast non-blocking reads and writes with expected log(n) time for most operations
Use Case			When you need a concurrent sorted map, e.g., priority queues, caches, or time-based data structures
  
we only use wrapper classes in collection framework as it can only hold objects and not the primitive type, wrapper class allows primitive values to be treated as objects, enabling then to stroe and manage    

An LRU (Least Recently Used) Cache is a data structure that removes the least recently used item when it reaches its capacity limit — it's commonly used in memory/caching systems.

✅ Goals of an LRU Cache
Fast get(key) and put(key, value) operations.
Automatically evicts the least recently used entry when full.
Maintains order based on access, not insertion.

🚀 Easiest Way in Java: Use LinkedHashMap
Java’s LinkedHashMap supports access-order iteration and can be customized to behave like an LRU cache.
import java.util.*;
public class LRUCache<K, V> extends LinkedHashMap<K, V> {
    private final int capacity;

    public LRUCache(int capacity) {
        super(capacity, 0.75f, true); // true = access-order
        this.capacity = capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > capacity;
    }

    public static void main(String[] args) {
        LRUCache<Integer, String> cache = new LRUCache<>(3);

        cache.put(1, "One");
        cache.put(2, "Two");
        cache.put(3, "Three");
        System.out.println(cache); // {1=One, 2=Two, 3=Three}

        cache.get(1);              // Access key 1
        cache.put(4, "Four");      // Key 2 will be evicted

        System.out.println(cache); // {3=Three, 1=One, 4=Four}
    }
}
🧠 How It Works
When capacity is exceeded, removeEldestEntry() is triggered.

Since access-order is enabled (true in constructor), get() or put() moves the key to the end (most recently used).

The eldest key (least recently used) is removed first.

🛠️ Time Complexity
get() → O(1)

put() → O(1)
Because LinkedHashMap is backed by a hash table + doubly linked list.

🔁 If You Want Manual LRU (Without LinkedHashMap)
You can also implement LRU using a combination of:

HashMap for O(1) access

Doubly Linked List for ordering
 
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
    System.out.println("hello world");
}
greetingFunction = void (){ //no need of name as it will be refered by the variable name  = greetingFunction
    System.out.println("hello world");
}
greetingFunction =  (){ //no need of return type java compiler will figure out by looking at the code
    System.out.println("hello world");
}
greetingFunction = () -> { // add arrow -> /syntax of lambda expresion
    System.out.println("hello world");
}
greetingFunction =()-> System.out.println("hello world");//no need of parenthesis {} if one line of code /inline function

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

function interface
 interface having one abstract method
 we use annotation @FunctionalInterface to mark interface as functional interface

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
        if(condition.test(p)) // condition which return boolean
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
        List<Person> FilerPeople = people.stream().filter(p -> p.getLastname().startWith("C"))
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


  //group by
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
		String names =nameslist.stream().map(name -> name.toUpperCase()).collect(Collectors.joining(",  "));
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
multitasking allows several activites to accur concurrently on the computer

process-base multitasking -->
allow processes (i.e programs) to run concurently where each task / process is independent 

thread-base multitasking -->
allow part of the same program to run concurrently on the computer
two threads share the same address space , os switching between threads is less expensive than between processes
cost of communication is also low in thread

//why multiTreading
//in a single threaded env, only one task at a time can be performed
//CPU cycles are weasted .eg when waiting for user inout
//multitasking allows idle CPU time to be put to good use

Thread - light weight process with in the process
//is an independent sequential path of execution with in a program
//many threads can run concurrently
// threads in program exist in common memory sapce, so shares the same data and code


Java Synchronization is used to make sure by some synchronization method that only one thread can access the resource at a given point in time. 

Our systems are working in a multithreading environment that becomes an important part for OS to provide better utilization of resources. The process of running two or more parts of the program simultaneously is known as Multithreading. A program is a set of instructions in which multiple processes are running and within a process, multiple threads are working. Threads are nothing but lightweight processes.

1. Process Synchronization in Java
Process Synchronization is a technique used to coordinate the execution of multiple processes. It ensures that the shared resources are safe and in order.

2. Thread Synchronization in Java
Thread Synchronization is used to coordinate and ordering of the execution of the threads in a multi-threaded program. There are two types of thread synchronization are mentioned below:

Mutual Exclusive
	Mutual Exclusive helps keep threads from interfering with one another while sharing data. There are three types of Mutual Exclusive mentioned below:
	Synchronized method.
	Synchronized block.
	Static synchronization.
	Cooperation (Inter-thread communication in Java)

//Main thread
//when a stand alone application runs. a user thread is automatically created to execute the main() method of 
// the application-- called main thread
//program ends when main() thread finishes executing   --> Thread.currentThread().getName();
//all other threads are child threads

the run time env distinguished between user threads and daemon threads
user thread created by developer / jvm create the demon thread eg GC
user thread given a preference over a deamon
when user thread finish executing program ends whether deamon is finished or not

//creation
java.lang.Thread class
java.lang.Runnable interface


t.start() a new thread will be  created which is responsible for the execution of run() method 
t.run() no new thread will be created it will be executed same as normal method 

//Synchronisation
//thread share the same memory space i.e they can share same resources/objects
//however, there are critical situations where it is desirable that only one thread at a time has access to shared resources


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
//all other thread wish to execute the same synchronized method have to wait
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

Basic Level Questions with Answers 

What is multithreading? How is it different from multiprocessing? 

Multithreading: Allows multiple threads to run within a single process. Threads share the same memory and resources. 

Multiprocessing: Involves multiple processes running independently, each with its own memory space. 

Difference: Threads are lighter and share memory, while processes are heavier and independent. 

What are the benefits of multithreading? 

Efficient CPU utilization. 

Faster execution by performing tasks concurrently. 

Simplifies modeling real-world problems like producer-consumer scenarios. 

Allows an application to remain responsive (e.g., GUI applications). 

How do you create a thread in Java? 

Using Thread class: 

 

class MyThread extends Thread { 

 
public void run() { 
      System.out.println("Thread is running..."); 

 
} 
 

} 

 
MyThread t = new MyThread(); 

 
t.start(); 
 

Using Runnable interface: 

class MyRunnable implements Runnable { 
 

  public void run() { 
 

         System.out.println("Thread is running..."); 
 

  } 

 
} 
 

Thread t = new Thread(new MyRunnable()); 

 
t.start(); 
 

What is the difference between the start() and run() methods in Java threads? 

start(): Starts a new thread and executes the run() method on that thread. 

run(): Called directly, it runs on the current thread, not a new one. 

What are daemon threads, and how do they work? 

Daemon threads: Background threads that provide support for user threads. They automatically terminate when all user threads are finished. 

Thread t = new Thread(); 

 
t.setDaemon(true); // Setting thread as daemon 
 
Feature			synchronized				Lock (e.g., ReentrantLock)
Syntax			Keyword					Object from java.util.concurrent.locks
Automatic unlocking	Yes					No (manual with unlock())
Interruptible	No	Yes 					(lockInterruptibly())
Timed try-lock	No	Yes 					(tryLock(timeout))
Fairness policy	No	Yes					 (configurable)
Multiple conditions	No					Yes (newCondition())
Use case complexity	Simple					zxcvbhl./Advanced/flexible
 

 

Intermediate Level Questions with Answers 

What is synchronization? Why is it important in multithreading? 

Synchronization: A mechanism to control access to shared resources to prevent thread interference. 

Importance: Prevents data inconsistency and race conditions when multiple threads access shared resources. 

Explain the difference between synchronized methods and synchronized blocks. 

Synchronized method: Locks the entire object. 

Synchronized block: Allows more granular locking on a specific part of the code or a specific object. 

What is a race condition, and how can you avoid it? 

Race Condition: Occurs when multiple threads access shared data simultaneously and at least one thread modifies it. 

Solution: Use synchronization, locks, or atomic variables. 

What are wait(), notify(), and notifyAll() methods? 

wait(): Makes a thread wait until another thread invokes notify() or notifyAll(). 

notify(): Wakes up a single thread waiting on the object's monitor. 

notifyAll(): Wakes up all threads waiting on the object's monitor. 

These methods must be called within a synchronized block. 

What is a thread pool? Why is it used? 

Thread Pool: A pool of pre-created threads that can be reused for executing tasks. 

Advantages: 

Reduces overhead of thread creation. 

Improves performance in a multithreaded environment. 

Example: 

ExecutorService executor = Executors.newFixedThreadPool(5); 

 
executor.execute(() -> System.out.println("Task executed")); 

 
executor.shutdown(); 
 

 

 

Advanced Level Questions with Answers 

What is the difference between synchronized and Lock interface? 

Synchronized: Implicit locking and simpler to use but less flexible. 

Lock interface: Explicit locking, supports try-locking, and provides more control. 

Example using Lock: 

Lock lock = new ReentrantLock(); 

 
lock.lock(); 
 

try { 
// Critical section 
}  

finally { 
lock.unlock(); 

 
} 
 

What is a deadlock? How do you prevent it? 

Deadlock: Occurs when two or more threads are waiting for each other’s locks, causing a standstill. 
mutual exclusion - only one thread can access a resource at a time
hold and wait - a thread holding at least one resource is waiting to acquire additionl resources held by other threads
NO Preemption - resources can not be forcibly taken from thrad holding them
circular wait - a set of thread wait for each other in a circular chain
Prevention: 

Avoid nested locks. 

Use try-lock with timeouts. 

Acquire locks in a consistent order. 

What is a volatile keyword? When should you use it? 

volatile: Ensures that changes made by one thread to a variable are visible to other threads. 

Use it for variables that are accessed and modified by multiple threads but not involved in compound actions (e.g., increment). 

Explain the ForkJoinPool framework. 

ForkJoinPool: Designed for divide-and-conquer tasks where a large task is recursively broken into smaller tasks. 

ForkJoinPool pool = new ForkJoinPool(); 
 

pool.invoke(new RecursiveTask<Integer>() { 
 

  @Override 
 

  protected Integer compute() { 

 
return 1 + 1; // Example computation 
} 

 
}); 
 

How does the ConcurrentHashMap provide thread safety? 

It uses a technique called bucket-level locking (or segment-level locking). Multiple threads can read and write concurrently as long as they operate on different buckets. 

What is a thread, and how is it different from a process? 

A thread is a lightweight subunit of a process. 

Threads share the process's memory and resources, while processes are independent and isolated. 

Explain the lifecycle of a thread in Java. 

New: Created but not started (new Thread()). 

Runnable: Ready to run but waiting for CPU (start() called). 

Running: Actively executing. 

Blocked/Waiting: Paused, waiting for resources or notifications. 

Terminated: Completed execution. 

What is the purpose of the join() method in threads? 

join(): Makes the current thread wait until the specified thread completes execution. 

Thread t = new Thread(() -> System.out.println("Child thread running")); 
 

t.start(); 

 
t.join(); // Main thread waits for t to finish 
 

System.out.println("Main thread resumes"); 

 

      

            Synchronized Methods: Locks the entire method. Only one thread can access it at a time. 

Synchronized Blocks: Locks only a portion of the method, providing finer control and better performance. 

 

Use sleep() when you need to pause execution for a certain time. 

Use wait() when you need inter-thread communication and synchronization. 

Runnable: Represents a task that doesn’t return a result. 

Callable: Represents a task that returns a result and can throw exceptions 

Synchronized: Implicit locking mechanism with automatic lock release. 

Lock Interface: Explicit locking mechanism that provides more control, e.g., try-lock, interruptible locks, etc. 

Race Conditions: Multiple threads modifying shared data simultaneously. 

Deadlocks: Two or more threads waiting on each other’s resources indefinitely. 

Livelocks: Threads keep changing states but fail to make progress. 

Starvation: A thread is perpetually denied access to resources. 

 

 

 

Design Pattern 

-- 

 

What are design patterns? Why are they important? 
Design Patterns are reusable solutions to common problems in software design. 
Importance: 
Provide best practices. 
Improve code readability and maintainability. 
Facilitate communication between developers. 
What are the types of design patterns? 
Creational Patterns: Deal with object creation (e.g., Singleton, Factory). 
Structural Patterns: Deal with object composition (e.g., Adapter, Decorator). 
Behavioral Patterns: Deal with object interaction (e.g., Observer, Strategy). 
Explain the Singleton Pattern. 
Ensures a class has only one instance and provides a global point of access to it. 
Implementation: 
public class Singleton { 
private static Singleton instance; 
private Singleton() {} 
public static Singleton getInstance() { 
if (instance == null) { 
  instance = new Singleton(); 
} 
        return instance; 
    } 
} 
 

What is the Factory Pattern? 
Provides an interface for creating objects without exposing their instantiation logic. 
public interface Shape { void draw(); } 
public class Circle implements Shape { public void draw() { System.out.println("Circle"); } } 
public class ShapeFactory { 
    public Shape getShape(String shapeType) { 
        if (shapeType.equals("Circle")) 

 return new Circle(); 
        return null; 
    } 
} 
 
What is the difference between a Factory and Abstract Factory Pattern? 
Factory: Creates objects of a single family. 
Abstract Factory: Creates objects of related families. 

Example: An Abstract Factory could create different types of UI components like Buttons and TextFields for multiple platforms (Windows, Mac). 

 
Intermediate Level Questions 
What is the Builder Pattern? 
Separates the construction of a complex object from its representation. 
public class Car { 
    private String engine; 
    private int wheels; 
    // Setters and Getters 
} 
public class CarBuilder { 
    private Car car = new Car(); 
    public CarBuilder setEngine(String engine) { car.setEngine(engine); return this; } 
    public CarBuilder setWheels(int wheels) { car.setWheels(wheels); return this; } 
    public Car build() { return car; } 
} 
 

Explain the Adapter Pattern. 
Allows incompatible interfaces to work together by providing a bridge. 
public interface MediaPlayer { void play(String audioType); } 
public class AdvancedPlayer { public void playMP4() { System.out.println("Playing MP4"); } } 
public class MediaAdapter implements MediaPlayer { 
    private AdvancedPlayer advancedPlayer = new AdvancedPlayer(); 
    public void play(String audioType) { 
        if (audioType.equals("MP4")) advancedPlayer.playMP4(); 
    } 
} 
 

What is the Observer Pattern? 
Defines a dependency between objects so that when one changes state, all dependents are notified. 
public interface Observer { void update(); } 
public class Subject { 
    private List<Observer> observers = new ArrayList<>(); 
    public void attach(Observer o) { observers.add(o); } 
    public void notifyObservers() { observers.forEach(Observer::update); } 
} 
 

What is the Strategy Pattern? 
Defines a family of algorithms, encapsulates each one, and makes them interchangeable. 
public interface PaymentStrategy { void pay(int amount); } 
public class CreditCardPayment implements PaymentStrategy { 
    public void pay(int amount) { System.out.println("Paid by Credit Card: " + amount); } 
} 
public class ShoppingCart { 
    private PaymentStrategy paymentStrategy; 
    public ShoppingCart(PaymentStrategy strategy) { this.paymentStrategy = strategy; } 
    public void checkout(int amount) { paymentStrategy.pay(amount); } 
} 
 

What is the Decorator Pattern? 
Adds behavior to objects dynamically without modifying their structure. 
public interface Car { void assemble(); } 
public class BasicCar implements Car { 
    public void assemble() { System.out.println("Basic Car"); } 
} 
public class SportsCarDecorator implements Car { 
    private Car car; 
    public SportsCarDecorator(Car car) { this.car = car; } 
    public void assemble() { 
        car.assemble(); 
        System.out.println("Adding Sports Car Features"); 
    } 
} 

Advanced Level Questions 
What is the Prototype Pattern? 
Creates new objects by copying an existing object (a prototype). 
public class Prototype implements Cloneable { 
    public Prototype clone() throws CloneNotSupportedException { return (Prototype) super.clone(); } 
} 
Explain the difference between Proxy and Decorator Patterns. 
Proxy: Controls access to an object. 
Decorator: Adds behavior to an object dynamically. 
Example: 
Proxy: SecurityProxy to check access permissions. 
Decorator: Adding features to a car. 
What is the Flyweight Pattern? 
Reduces memory usage by sharing objects that are similar in nature. 
public class Flyweight { 
    private String intrinsicState; 
    public Flyweight(String state) { this.intrinsicState = state; } 
} 
 

What is the Chain of Responsibility Pattern? 
Passes a request along a chain of handlers. Each handler decides to process or pass the request. 
public interface Handler { void setNext(Handler handler); void handleRequest(String request); } 
 

What is Dependency Injection? Which design pattern does it use? 
Dependency Injection: Injects dependencies into objects, rather than creating them within. 
Follows the Inversion of Control (IoC) principle. 
Often implemented using the Factory or Builder Pattern. 
Explain the MVC Pattern. 
Separates concerns into: 
Model: Represents data/business logic. 
View: Represents UI. 
Controller: Handles user input and updates model/view. 

What is the Composite Pattern? 
Treats individual objects and compositions uniformly. 
Example: File systems where files and folders are treated similarly. 

How is the Command Pattern useful? 
Encapsulates a request as an object, allowing parameterization and queuing of requests. 
Example: Undo/Redo functionality. 

What is the Template Method Pattern? 
Defines the skeleton of an algorithm, letting subclasses fill in specific steps. 
public abstract class Game { 
    abstract void initialize(); 
    abstract void play(); 
    public final void playGame() { 
        initialize(); 
        play(); 
    } 
} 
 

What is the main benefit of the Dependency Inversion Principle? 
Encourages dependency on abstractions, not concretions. It decouples modules and makes the system more modular. 

public interface Observer { void update(); } 
public class Subject { 
    private List<Observer> observers = new Arr
    
Design Pattern
--

Creational pattern - 
Behavioural pattern
Structural pattern
J2EE pattern - 

SOLID Principles
--
	the broad goal of solid principles is to reduce dependencies so that engineers can change one area  in software without affecting others
 	intended to make designs easier to understand, maintain. and extend
  	helps to avoid issues and to build adaptive, effective and agile software
   	lead to better code readability, maintainability,  patterns, testability

    S - sinle responsibility 
    	one class should have one and only one responsibility 
     	change class when we need to change state of one perticular object or instance
    O - open and close principle 
    	means software components should be open for extension, but closed for modification
     	open for extension - means that we can extend and include extra functionalities in our code with out impacting existing implementation
      	close for modifiction - means that after adding extra functionalities we should not modify the existing implementation
       if we need to modify create a new class and extend the class and override some functionalities 
    L - Liskov Substitution
    	the software should not alter the desirable result when we replace a parent type with any of the subtype 
     	Derived type must be completly substitutable for their base type
      	the classes , fellow developers created by extending our class , should be able to fit in application without failure
       	this requires the object of subclass to behave in the same way as the object of supperclass    	
    I - Interface Segregation
    	clients should not be forced to implement unnecessary methods which they will not use
     	we should splite our interface into smaller and more specific ones  
    D - Dependency Inversion 
    	Depend on abstractions, not on concretaions
     	we should design our software in a such away that various modules can be seperated from each other using an abstract layer to bind them together 
      	removes the hardcoded dependencies so that the application becomes loosely coupled and extendable

    

## - DSA
--
LinkList -->
--
//variable size
//non contiguous memory
//insert in O(1)
//Search in O(n)
//structure --> node --> data + next node address
//Types -->Singular  , Double,  Circular

Stack
--
//last in first out
// push(), pop(), peek()  -->O(1)


queue
--
//first in first out
//enque(), dequeue(), peek()/front -->O(1)

tree / binary tree
--
//hirarchical data structure
//preOrder --> root - left - right
//inOrder --> left - root - right

Binary Search Tree
--
//left subtree Nodes < root
//right subtree nodes > root
// left and right subtree are also BST if there is no duplicates
//inorder traverdsal of BST is always sorted 
//skewed tree -- all nodes on either left side or right side


HashSet
--
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


HashMap --> key-value pair
--
	works on the principle of hashing 
	hashing means using fuction or algorithm to map object data to some integer value, hashCode() method return the hashcode. hence it is neccessary to write the hashCode() method properly for better performance
 	
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


Graphs
--
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

Questions 
--
latest inhancement in hashmap 
	 for collision  linked list is used which is O(n)   to increase performance now balanced tree is used log(n) when a perticular threshold is reached the linked list is converted into balaced tree 
optional claas- 
	Every Java Programmer is familiar with NullPointerException. It can crash your code. And it is very hard to avoid it without using too many null checks. So, to overcome this, Java 8 has introduced a new class Optional in 		java.util package. It can help in writing a neat code without using too many null checks. By using Optional, we can specify alternate values to return or alternate code to run. This makes the code more readable because the 		facts which were hidden are now visible to the developer.

 eg - 
 	Optinal<Employee> e = repo.findById(id);
  	if(!e.isEmpty){
   		Optional<String> name = Optional.ofNullable(e.get().getName());
     		if(name.isPresent()){
       			return new ResponseEntiry<>(name.get().toUpperCase(), HttpStatus.OK);
		}else{
  			return new ResponseEntiry<>("Name is null", HttpStatus.Not Found);
		}

  		or 
    		name.ifPresent(n-> system.out.println("name is present : "+ n));

      		or
		name.ifPresentorElse(n-> system.out.println("name is present : "+ n) , system.out.println("name is not present"));
	}
	
import java.util.Optional;

// Driver Class
public class OptionalDemo {
      // Main Method
    public static void main(String[] args)
    {
        String[] words = new String[10];
        
          Optional<String> checkNull = Optional.ofNullable(words[5]);
        
          if (checkNull.isPresent()) {
            String word = words[5].toLowerCase();
            System.out.print(word);
        }
        else
            System.out.println("word is null");
    }
}


		Array 															ArrayList
	static in size 														dynamic in size
 	int arr[] = new int[10];												ArrayList<Integer> arrList = new ArrayList<>();
  	fixed length dataStucture												variable length Collection class
   	can store both primitive type and objects 										can not store primitive type, only stores objects
    	fast as comparfe to arraylist as have fixed size 									add() and get() operations almost same perfomance
     																resize() - increase size by 50% of originl size
	mandatory to provide size of array while initialization 								can create arrayList with out specifing size
 	uses for loop to iterate												uses iterator
  	.length - variable 													.size() - method
   	can be multi-dimensional 												always single-dimentional 
    	elements stored in adjecent memory 											objects are incapable of being contained in contiguous locations
     	generics are not compatible 												allows the use of generics 


		ArrayList 														Vector
	 not synchronized 													synchronized
	 not thread safe													thread safe
	 fast as non synchronized												slow due to synchronization
 	 increase capacity by 50% of current array size										increase capacity by 100%
   	 uses iterator interface												iterator interface or enumeration interface 
	
    
diff between arraylist and linked list
		arrayList -													linked list
	used dynamic array as internal data structure								 	uses the doubly linked list
	manipulation is slow but searching is fast									manipulation is fast but searching is slow 
	can act as only list												can as as list as well as queue
 	faster in storing and accessing data as internally uses array which has random access				slower than arrayList in storing and accessing requires node by node traversal
  	can not traverse in reverse order										can be traverse in reverse direction
   	better for search operation as can access randomly 								for add and delete operation
    
		
  		checked exceptions 												unchecked exceptions
  	checked by java compiler 											not checked by java compiler so called run time
   	occure at compile time 												occure at runtime
    	can be handled at the time of compilation									can not be handle at the time of compilation
     	must be handled in a try-catch block or be thrown by invoking method						exception handling semantics are not required

	
						hashMap						TreeMap						LinkedHashMap

     Order				random						sorted order according to natural(asc) ordering		sorted order according to the insertion order
     time complexity 			O(1)						O(log n)						O(1)
     Null key 				allowed						not allowed 						allowed
     datastrucute support		hash table and linkedList			Red Black Tree						Hashtable abd doubly linked list
     key requirment 			equals() and hashCode() methods			along with equals(), hashcode() the			equals() and hashCode() methods
     					needs to be overridden				comparator is implemented for sorting			needs to be overridden
     usage				normal processing, faster retrieval		for sorting and navigable features 			when insertion order needs to be maintain 

Diff between hashmap and hashtable
hashmap - not synchonize so not thread safe , much fater , one null key and multiple null values
hashtable -shyncronize so thread safe , slow campare to hashmap , does not allow any null key or any null value 

MAP and Flat MAP
	In Java, the Stream interface has a map() and flatmap() methods and both have intermediate stream operation and return another stream as method output. Both of the functions map() and flatMap are used for transformation and 	mapping operations. map() function produces one output for one input value, whereas flatMap() function produces an arbitrary no of values as output (ie zero or more than zero) for each input value.
 	flatMap() --> performs the opertion on list of list 
	                                        map()	                                     	      flatMap()
	The function passed to map() operation returns a single value for a single input.		The function you pass to flatmap() operation returns an arbitrary number of values as the output.
	One-to-one mapping occurs in map().								One-to-many mapping occurs in flatMap().
	Only perform the mapping.									Perform mapping as well as flattening.
	Produce a stream of value.									Produce a stream of stream value.
	map() is used only for transformation.								flatMap() is used both for transformation and mapping.

fail fast and fail safe 
Concurrent Modification: Concurrent Modification in programming means to modify an object concurrently when another task is already running over it. For example, in Java to modify a collection when another thread is iterating over it. Some Iterator implementations (including those of all the general purpose collection implementations provided by the JRE) may choose to throw ConcurrentModificationException if this behavior is detected.

Fail Fast And Fail Safe Iterators in Java
Iterators in java are used to iterate over the Collection objects.Fail-Fast iterators immediately throw ConcurrentModificationException if there is structural modification of the collection. Structural modification means adding, removing any element from collection while a thread is iterating over that collection. Iterator on ArrayList, HashMap classes are some examples of fail-fast Iterator.
Fail-Safe iterators don’t throw any exceptions if a collection is structurally modified while iterating over it. This is because, they operate on the clone of the collection, not on the original collection and that’s why they are called fail-safe iterators. Iterator on CopyOnWriteArrayList, ConcurrentHashMap classes are examples of fail-safe Iterator.

if synchronized map is there why concurrent hash map was introduce - 

	 Java HashMap is a non-synchronized collection class. If we need to perform thread-safe operations on it then we must need to synchronize it explicitly. The synchronizedMap() method of java.util.Collections class is used to 	synchronize it. It returns a synchronized (thread-safe) map backed by the specified map. 
  
	The ConcurrentHashMap and SynchronizedHashMap both are the Collection classes which are thread-safe and can be used in multithreaded and concurrent java application. But there are few differences that exists between them.
 	concurrent hash map came in picture due to performance issue in synchronize hash map it works on principle of lock stripping so any number of threads can read and write where as in synchronized has map others thread has to 	wait for executing treads opertion to end 

	  ConcurrentHashMap is thread-safe therefore multiple threads can operate on a single object without any problem. In ConcurrentHashMap, the Object is divided into a number of segments according to the concurrency level. By 		default, it allows 16 thread to read and write from the Map without any synchronization. In ConcurrentHashMap, at a time any number of threads can perform retrieval operation but for updating in the object, the thread must lock 		the particular segment in which the thread wants to operate. This type of locking mechanism is known as Segment locking or bucket locking. Hence, at a time16 update operations can be performed by threads.


	PermGen											MetaSpace
It is removed from java 8.							It is introduced in Java 8.
PermGen always has a fixed maximum size.					Metaspace by default auto increases its size depending on the underlying OS.
Contiguous Java Heap Memory.							Native Memory(provided by underlying OS).
Inefficient garbage collection.							Efficient garbage collection.

JVM memory stucture - 
	JVM defines various run-time data area which are used during execution of a program. Some of the areas are created by the JVM whereas some are created by the threads that are used in a program. However, the memory area created 	by JVM is destroyed only when the JVM exits. The data areas of thread are created during instantiation and destroyed when the thread exits. JVM Memory Structure is divided into multiple memory area like heap area, stack area, 	method area, PC Registers etc

Young Generation(Nursery):
	All the new objects are allocated in this memory. Whenever this memory gets filled, the garbage collection is performed. This is called as Minor Garbage Collection.
Old Generation:
	All the long lived objects which have survived many rounds of minor garbage collection is stored in this area. Whenever this memory gets filled, the garbage collection is performed. This is called as Major Garbage Collection.
PermGen Memory:
	This is a special space in java heap which is separated from the main memory where all the static content is stored in this section. Apart from that, this memory also stores the application metadata required by the JVM. 		Metadata is a data which is used to describe the data. Here, garbage collection also happens like any other part of the memory. String pool was also part of this memory before Java 7. Method Area is a part of space in the 		PermGen and it is used to store the class structure and the code for methods and constructors. The biggest disadvantage of PermGen is that it contains a limited size which leads to an OutOfMemoryError. The default size of 		PermGen memory is 64 MB on 32-bit JVM and 82 MB on the 64-bit version. Due to this, JVM had to change the size of this memory by frequently performing Garbage collection which is a costly operation. Java also allows to manually 	change the size of the PermGen memory. However, the PermGen space cannot be made to auto increase. So, it is difficult to tune it. And also, the garbage collector is not efficient enough to clean the memory. 
MetaSpace	
	Due to the above problems, PermGen has been completely removed in Java 8. In the place of PermGen, a new feature called Meta Space has been introduced. MetaSpace grows automatically by default. Here, the garbage collection is 	automatically triggered when the class metadata usage reaches its maximum metaspace size. 

How subString work in java or how substring creates memory lick in java
	String is a sequence of charactors, represented by array of charactors 
 	char value [] = array of charactors
  	int count - total charactors
  	int offset - starting point, that is index =0
 	when we create substring out of string new string is created as string is immutable , and the value[] array will be shared between the two strings that is original and substring 
  	even though we make original string null to be garbage collected, it will not free the space in memory as substring is using that memory in value[]

  	to prevent this memory leak - in java 1.6 the intern() method is introduces, it peek up the substring and put it in string pool as string pool only takes the space required 
   		so original string space is freeed after garbage collected 
   	String substr = originalString.subString(0,2).intern()
    	from JDK 7 - subString will create its own array instead of pointing it to original string array

Load factor in hashmap 
	initial capacity - number of buckets cerated initially 
 	load factor - is criteria to decide when we have to increase the size of hashmap when it is about to full 

  Capacity - denotes how many entries HashMap can stored , bucket size
  size - number of key-value pairs ,  real object / nodes

Java Reflection API - 
	at run time we have an object, no if we want to know details of the class then use Reflection.
 	it is a process of analyzing and modifying all the capabilities of a class at runtime, reflection API in java is used to manipulate class and its members which include fields, methods, constructor etc.
  	it can manipulate private member of the class too
   	java.lang.reflection 
    advantage 
    	can use it to manipulate code at runtime
     	easy to introspect class and objects
      	way to access and modify the fields, methods, annotations of class and objects 
      	debugging and testing 
   disadvantage
   	performance overhead 
    	not thread safe -
     	exposure of internals - break the abstraction 

what is object Lock?
	in multithreaded environment two or more threads can access the shared resources simultaneously which can lead to inconsistent behaviour of the system 
 	java uses the concept of lock to restrict concurrent access of shared resources 

   object level lock -can be used when you want non-static method or non static block of the code should be accessed by only one thread
   class level locaks - used when we want to prevent multiple thread to enter the synchronized block in any of all avalible instance on runtime 

object reference be cast to an interface reference
	Animal a = new Dog();

  	if we implement an interface and provide body to its methids from class,
   	we can hold object of that class using the reference variable of interface.

## Design Patterns in java
	
Creational
--
-  creation of objects
	
1.1 Factory Method
Factory Method is a creational design pattern, that provide an interface for creating objects in superclass, but subclasses are responsible to create the instance of the class.

1.2 Abstract Factory Method
Abstract Factory Method is a creational design pattern, it provides an interface for creating families of related or dependent objects without specifying their concrete classes.

1.3 Builder Method
Builder Method is a creational design pattern, it provides an interface for constructing an object and then have concrete builder classes that implement this interface to create specific objects in a stepwise manner.

1.4 Prototype Method
Prototype Method is a creational design pattern, it provide to create new objects with the same structure and initial state as an existing object without explicitly specifying their class or construction details.

1.5 Singleton Method
Singleton Method is a creational design pattern, it provide a class has only one instance, and that instance provides a global point of access to it.

Structure 
--
- if we have two object we want to compose one inside other we use structural
	Structural design patterns are a subset of design patterns in software development that focus on the composition of classes or objects to form larger, more complex structures. They help in organizing and managing relationships between objects to achieve greater flexibility, reusability, and maintainability in a software system.

2.1 Adapter Method
Adapter Method is a structural design pattern, it allows you to make two incompatible interfaces work together by creating a bridge between them.

2.2 Bridge Method
Bridge Method is a structural design pattern,it provide to design separate an object’s abstraction from its implementation so that the two can vary independently.

2.3 Composite Method
Composite Method is structural design pattern, it’s used to compose objects into tree structures to represent part-whole hierarchies. This pattern treats both individual objects and compositions of objects it allow clients to work with complex structures of objects as if they were individual objects.

2.4 Decorator Method
Decorator Method is structural design pattern, it allows to add behavior to individual objects, either statically or dynamically, without affecting the behavior of other objects from the same class.

2.5 Facade Method
Facade Method is a structural design pattern, it provides a simplified, higher-level interface to a set of interfaces in a subsystem, making it easier for clients to interact with that subsystem.

2.6 Proxy Method
Proxy Method is a structural design pattern, it provide to create a substitute for an object, which can act as an intermediary or control access to the real object.

2.7 Flyweight Method
Flyweight Method is a structural design pattern, it is used when we need to create a lot of objects of a class. Since every object consumes memory space that can be crucial for low memory devices, flyweight design pattern can be applied to reduce the load on memory by sharing objects. 

Behavioural
--
- when we dont want to compose object but want to have some communication between them  
Behavioral design patterns are a subset of design patterns in software development that deal with the communication and interaction between objects and classes. They focus on how objects and classes collaborate and communicate to accomplish tasks and responsibilities.

3.1 Command Method
Command Method is a Behavioral Design Pattern, it promotes loose coupling between the sender (client) and the receiver (the object that performs the operation) and provides a way to support undoable operations.

3.2 Iterator Method
Iterator Method is a Behavioral Design Pattern, it provides a way to access elements of an aggregate object (a collection) sequentially without exposing the underlying representation of that collection.

3.3 Mediator Method
Mediator Method is a Behavioral Design Pattern, it promotes loose coupling between objects by centralizing their communication through a mediator object. Instead of objects directly communicating with each other, they communicate through the mediator, which encapsulates the interaction and coordination logic.

3.4 Memento Method
Momento Method is a Behavioral Design Pattern, it provide to save and restore the previous state of an object without revealing the details of its implementation.

3.5 Observer method
Observer Method is a Behavioral Design Pattern, it defines a one-to-many dependency between objects, so that when one object (the subject) changes state, all its dependents (observers) are notified and updated automatically.

3.6 State Method
State Method is a Behavioral Design Pattern, it allows an object to alter its behavior when its internal state changes.

3.7 Strategy Method
Strategy Method is a Behavioral Design Pattern, it defines a family of algorithms, encapsulates each one, and makes them interchangeable and it allows a client to choose an appropriate algorithm from a family of algorithms at runtime.

3.8 Template Method
Template Method is a Behavioral Design Pattern, it defines the skeleton of an algorithm in a method but lets subclasses alter some steps of that algorithm without changing its structure.

3.9 Visitor Method
Visitor Method is a Behavioral Design Pattern, it is used when you have a set of structured, hierarchical objects and you want to perform various operations on these objects without modifying their classes.

3.10 Interpreter Design Pattern
Interpreter pattern is used to defines a grammatical representation for a language and provides an interpreter to deal with this grammar.

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
	indexes are database objects which help in retrieving records quickly and more efficiently
 	query syntax- 
 		create index INdex_name on table_name(col1,col2);
		drop index index_name on table_name;
  
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
--
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


find the third hightesrt salary
select MAX (salary) from empoyee ; --> gives the max salary
select MAX (salary) from empoyee where salary < (select MAX (salary) from empoyee) ; --> will give the 2nd highest salary 
select MAX (salary) from empoyee where salary < (select MAX (salary) from empoyee where salary < select MAX (salary) from empoyee) ; --> will give the 3rd highest salary 

select * from employee order by DESC limit 0(starting index),1(how many rows) ;  --> get the highest  as index is 0 and rows given are only one
select salary from salary order by salary desc limit 2,1;  --> gives 3rd highest

SQL 
data is represented in tables
predifined schema
vertically scalable
support automic operations
support join operations


##
MongoDB
--
is NoSQL (not only query) database that stores large volumes of data in the form of documents .this offers the developers the flexibility to work with evolving data models.
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



