package week7;
import java.util.*;
public class HW7_3 {

	public static void main(String[] args) {
		
		 Scanner input = new Scanner(System.in);

	        System.out.print("Enter year: ");
	        int year = input.nextInt();

	        System.out.print("Enter month between 1 & 12: ");
	        int month = input.nextInt();

	        System.out.print("Enter the day of the monthbetween 1 & 31 :");
	        int day = input.nextInt();

	        if (month == 1 || month == 2) {
	            month += 12;
	            year--;
	        }

	        int k = year % 7; 
	        int j = (int)(year / 100.0);
	        int q = day;
	        int m = month;
	        int h = (q + (int)((26 * (m + 1)) / 10.0) + k + (int)(k / 4.0) 
	                + (int)(j / 4.0) + (5 * j)) % 7;

	        String result = "Day of the week is ";
	        if (h == 0) 
	            System.out.print(result + "Saturday");
	        else if (h == 1)
	            System.out.print(result + "Sunday");
	        else if (h == 2)
	            System.out.print(result + "Monday");
	        else if (h == 3)
	            System.out.print(result + "Tuesday");
	        else if (h == 4)
	            System.out.print(result + "Wednesday");
	        else if (h == 5)
	            System.out.print(result + "Thursday");
	        else
	            System.out.print(result + "Friday");
	    }
}
//Enter year: 2019
//Enter month between 1 & 12: 8
//Enter the day of the month between 1 & 31 :23
//Day of the week is Saturday
//Enter year: 2017
//Enter month between 1 & 12: 2
//Enter the day of the month between 1 & 31 :25
//Day of the week is Sunday