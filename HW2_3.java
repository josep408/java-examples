package week2;
import java.util.*;
public class HW2_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	      System.out.print("Input an number between 0 an 1000: ");
	      int digits = sc.nextInt();
		  System.out.println("The sum is " + sumDigits(digits));
	    }

	 public static int sumDigits(long n) {
			int result = 0;
			
			while(n > 0) {
				result += n % 10;
				n /= 10;
			}
			
			return result;
			
			
			///Input an number between 0 an 1000: 878
			//The sum is 23

		}
		

}
