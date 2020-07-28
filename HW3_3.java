package week3;
import java.util.Scanner;

public class HW3_3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number = (int) (Math.random() * 52);
		int remainder = number % 13;
		int quotient = number / 13;
		String suit = "";
		
		switch (quotient) {
		case 0:
			suit = "Spade";
			break;
		case 1:
			suit = "Heart";
			break;
		case 2:
			suit = "Club";
			break;
		case 3:
			suit = "Diamond";
			break;
		}
		String rank = "";
		switch (remainder) {
		case 0:
			rank = "King";
		break;
		case 1:
			rank = "Ace";
		case 11:
			rank = "Jack";
			default:
				rank = "" + remainder;
		}
		System.out.println("The Card that was generated is: " + rank + " of " +suit);
	}
	//The Card that was generated is: King of Heart
	//The Card that was generated is: 8 of Heart
	//The Card that was generated is: 10 of Diamond


}
