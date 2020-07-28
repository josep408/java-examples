package week5;
import java.util.Scanner;

public class HW4_1 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

		    System.out.print("Enter a decimal number: ");
		    int dec = sc.nextInt();

		    String hex = "";
		    
		    while (dec != 0 && dec<= 15) {
		      int hexoVal = dec % 16; 
		       
		      char hexDigit = (0 <= hexoVal && hexoVal <= 9) ?
		        (char)(hexoVal + '0') : (char)(hexoVal - 10 + 'A');
		      
		      hex = hexDigit + hex;
		      dec = dec / 16;
		    }
		    
		    System.out.println("The hex number is " + hex);
		    
		    if (dec >15)
		    {
		    	System.out.println(dec + " Is an invalid input(Number must be between 0 and 15)");
		    }
		    
		    
		    //Enter a decimal number: 11
		    //The hex number is B
		   
		    
		    //Enter a decimal number: 6
		    //The hex number is 6
		    
		    
		    //Enter a decimal number: 123
		    //The hex number is 
		    //123 Is an invalid input(Number must be between 0 and 15)


	}

}
