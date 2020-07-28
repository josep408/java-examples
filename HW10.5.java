package primefactors;
import java.io.*;
import java.util.Scanner;

public class PrimeFactors {

	public static void main(String[] args) throws IOException {

	       Scanner sc = new Scanner(System.in);
	       int n;
	       int i;
	       System.out.print("Enter a Number : ");
	       n = sc.nextInt();
	      
	      
	       StackOfIntegers stackOfIntegers = new StackOfIntegers(50);
	      
	      
	       
	       i=2;
	      
	       while (n > 1) {
	          
	           if (n % i == 0) {
	               
	               stackOfIntegers.push(i);
	               n = n / i;
	           } else {
	               i++;
	           }
	       }
	      
	       System.out.println("Prime Factors are: ");
	       stackOfIntegers.print();
	      
	   }
	}
//Enter a Number : 120
//Prime Factors are: 
//2 2 2 3 5 

package primefactors;

public class StackOfIntegers {
		private int[] elements;
	   private int size;
	   public static final int MAX_SIZE = 16;

	   public StackOfIntegers() {
	       this(MAX_SIZE);
	   }

	   public StackOfIntegers(int capacity) {
	       elements = new int[capacity];
	   }

	   public int push(int value) {
	       if (size >= elements.length) {
	           int[] temp = new int[elements.length * 2];
	           System.arraycopy(elements, 0, temp, 0, elements.length);
	           elements = temp;
	       }

	       return elements[size++] = value;
	   }

	   public int pop() {
	       return elements[--size];
	   }

	   
	   public int peek() {
	       return elements[size - 1];
	   }

	   public boolean empty() {
	       return size == 0;
	   }

	   public int getSize() {
	       return size;
	   }
	 
	   public void print() {
	       for(int i=0;i<size;i++) {
	           System.out.print(elements[i]+" ");
	       }
	}
}