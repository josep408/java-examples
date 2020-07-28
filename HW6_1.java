package week6;
import java.util.*;
public class HW5_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 int number;
		 System.out.println("Enter the integer to factor");
		 number = sc.nextInt();
	        System.out.print("Factors of " + number + " are: ");
	        for(int i = 1; i <= number; ++i) {
	            if (number % i == 0) {
	                System.out.println(i + " ");
	            }
	        }
	}

}
//Enter the integer to factor
//12
//Factors of 12 are: 1 
//2 
//3 
//4 
//6 
//12 
