package week7;

import java.util.*;

public class HW7_1 {
	public static boolean isPalindrome(int number) {
		  int palindrome = number; // copied number into variable
	        int reverse = 0;

	        while (palindrome != 0) {
	            int remainder = palindrome % 10;
	            reverse = reverse * 10 + remainder;
	            palindrome = palindrome / 10;
	        }

	        if (number == reverse) {
	            return true;
	        }
	        return false;
	    }
	public static void main(String[] args) {
	        
	        System.out.println("Please Enter a number:  ");
	        int palindrome = new Scanner(System.in).nextInt();
	        
	        if(isPalindrome(palindrome)){
	            System.out.println("Number : " + palindrome + " is a palindrome");
	        }
	        else{
	            System.out.println("Number : " + palindrome + " is not a palindrome");
	  }

	}

}
//Please Enter a number:  
//245
//Number : 245 is not a palindrome
//Please Enter a number:  
//121
//Number : 121 is a palindrome



