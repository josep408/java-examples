package week2;
import java.util.*;

public class HW_2_1 {
	
	public static double convertToFarenheit (double celsius)
	{
		return 9.0/5.0*celsius +32;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter temperature in Celsius");
		 double celsius = input.nextDouble();
		 
		 System.out.println(celsius + " in C is converted to " + convertToFarenheit(celsius));
		 
		 
		 //Enter temperature in Celsius
		 //46
		 //46.0 in C is converted to 114.8

	}

}
