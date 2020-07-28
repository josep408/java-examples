package week5;
import java.util.*;
public class HW4_2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the SSN to be checked: ");
		String ssn = input.nextLine();
		
		boolean isValid = 
				(ssn.length() == 11) && 
				(Character.isDigit(ssn.charAt(0))) &&
				(Character.isDigit(ssn.charAt(1))) &&
				(Character.isDigit(ssn.charAt(2))) &&
				(ssn.charAt(3) == '-') &&
				(Character.isDigit(ssn.charAt(4))) &&
				(Character.isDigit(ssn.charAt(5))) &&
				(Character.isDigit(ssn.charAt(7))) &&
				(ssn.charAt(6) == '-') &&
				(Character.isDigit(ssn.charAt(8))) &&
				(Character.isDigit(ssn.charAt(9))) &&
				(Character.isDigit(ssn.charAt(10)));
		
		System.out.println(ssn + "is " + ((isValid) ? "a valid " : "an invalid " + "Social  Security Number" ));

		
		//Enter the SSN to be checked: 
		//232-23-5435
		//232-23-5435is a valid 
		
		
		//Enter the SSN to be checked: 
		//23-234-3333
		//23-234-3333is an invalid Social  Security Number


	}

}
