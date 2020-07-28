package week15;
import java.util.Scanner;
public class GCD {
	public static int gcd(int x, int y) {
		if (y!=0)
			return gcd(y, x%y);
			else 
				return x;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x, y;
		
		System.out.println("Enter the value for a: ");
		x = sc.nextInt();
		
		System.out.println("Enter the value for b: ");
		y = sc.nextInt();
		
		System.out.println("Greatest Common Divisor = "+ gcd(x,y));

	}

}
//Enter the value for a: 
//10
//Enter the value for b: 
//3
//Greates Common Divisor = 1


//Enter the value for a: 
//123
//Enter the value for b: 
//34
//Greates Common Divisor = 1


//Enter the value for a: 
//1234
//Enter the value for b: 
//3
//Greatest Common Divisor = 1

