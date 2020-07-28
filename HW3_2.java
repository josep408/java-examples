package week3;
import java.util.Scanner;

public class HW3_2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		
		System.out.print("Enter the weight of the package: ");
		double weight = input.nextDouble();

		
		if (weight > 50)
			System.out.println("The package cannot be shipped.");
		else
		{
			double cost; 
			if (weight > 0 && weight <= 1)
				cost = 3.5;
			else if (weight <= 3)
				cost = 5.5;
			else if (weight <= 10)
				cost = 8.5;
			else //if (weight <= 20)
				cost = 10.5;
			System.out.println("Shipping cost of package is $" +
				cost * weight);
		}
		
		//Enter the weight of the package: 0.5
		//Shipping cost of package is $1.75
		
		//Enter the weight of the package: 2
		//Shipping cost of package is $11.0

		//Enter the weight of the package: 7
		//Shipping cost of package is $59.5

		//Enter the weight of the package: 18
		//Shipping cost of package is $189.0
		
		//Enter the weight of the package: 55
		//The package cannot be shipped.

		
	}

}
