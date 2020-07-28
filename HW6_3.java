package week6;
import java.util.*;
public class HW6_3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = input.nextInt();

        System.out.print("First day of the year: ");
        int firstDayYear = input.nextInt();
        for(int month = 1; month <= 12; month++)
        {
            int daysMonth = 0;
            String monthDisplay = "";   

           
            switch(month)
            {
                case 1: monthDisplay = "January"; 
                    daysMonth = 31;
                    break;

                case 2: 
                    monthDisplay = "February";
                    int leapYear = 0;
                    while (leapYear > -1)
                    {   
                        
                        leapYear += 4;
                        if (year == leapYear)
                        {
                            daysMonth = 29;
                            break;
                        }

                        else 
                        {
                            daysMonth = 28;
                        }
                    }
                    break;

                case 3: monthDisplay = "March";
                    daysMonth = 31;
                    break;

                case 4: monthDisplay = "April";
                    daysMonth = 30;
                    break; 

                case 5: monthDisplay = "May";
                    daysMonth = 31;
                    break;

                case 6: monthDisplay = "June";
                    daysMonth = 30;
                    break; 

                case 7: monthDisplay = "July";
                    daysMonth = 31;
                    break;

                case 8: monthDisplay = "August";
                    daysMonth = 31;
                    break;

                case 9: monthDisplay = "September";
                    daysMonth = 30;
                    break;

                case 10: monthDisplay = "October";
                    daysMonth = 31;
                    break;

                case 11: monthDisplay = "November";
                    daysMonth = 30;
                    break;

                case 12: monthDisplay = "December";
                    daysMonth = 31;
                    break; 

                default : System.out.print("Invalid: Your month is not recognized. ");
                    System.exit(0); 

            }
            
            System.out.println("                      "+ monthDisplay + " " + year);

            
            System.out.println("_____________________________________");

            
            System.out.println("Sun     Mon     Tue     Wed     Thu     Fri     Sat");

            
            int firstDayEachMonth = (daysMonth + firstDayYear)%7;
            for (int space = 1; space <= firstDayEachMonth; space++)
                System.out.print("   ");
 
            for (int daysDisplay = 1; daysDisplay <= daysMonth; daysDisplay++)
            {
                if (firstDayYear%7 == 0)
                    System.out.println();

                System.out.printf("%3d     ", daysDisplay);
                firstDayYear += 1;
            }
            System.out.println();
        }

    }

	}
//Enter a year: 2019
//Enter the weekday that the year starts: 2
//                      January 2019
//_____________________________________
//Sun     Mon     Tue     Wed     Thu     Fri     Sat
//                 1       2       3       4       5     
//  6       7       8       9      10      11      12     
// 13      14      15      16      17      18      19     
// 20      21      22      23      24      25      26     
// 27      28      29      30      31     
//                      February 2019
//_____________________________________
//Sun     Mon     Tue     Wed     Thu     Fri     Sat
//                 1       2     
//  3       4       5       6       7       8       9     
// 10      11      12      13      14      15      16     
// 17      18      19      20      21      22      23     
// 24      25      26      27      28     
//                      March 2019
//_____________________________________
//Sun     Mon     Tue     Wed     Thu     Fri     Sat
//     1       2     
//  3       4       5       6       7       8       9     
// 10      11      12      13      14      15      16     
// 17      18      19      20      21      22      23     
// 24      25      26      27      28      29      30     
// 31     
//                      April 2019
//_____________________________________
//Sun     Mon     Tue     Wed     Thu     Fri     Sat
//           1       2       3       4       5       6     
//  7       8       9      10      11      12      13     
// 14      15      16      17      18      19      20     
// 21      22      23      24      25      26      27     
// 28      29      30     
//                      May 2019
//_____________________________________
//Sun     Mon     Tue     Wed     Thu     Fri     Sat
//                    1       2       3       4     
//  5       6       7       8       9      10      11     
// 12      13      14      15      16      17      18     
// 19      20      21      22      23      24      25     
// 26      27      28      29      30      31     
//                      June 2019
//_____________________________________
//Sun     Mon     Tue     Wed     Thu     Fri     Sat
//     1     
//  2       3       4       5       6       7       8     
//  9      10      11      12      13      14      15     
// 16      17      18      19      20      21      22     
// 23      24      25      26      27      28      29     
// 30     
//                      July 2019
//_____________________________________
//Sun     Mon     Tue     Wed     Thu     Fri     Sat
//              1       2       3       4       5       6     
//  7       8       9      10      11      12      13     
// 14      15      16      17      18      19      20     
// 21      22      23      24      25      26      27     
// 28      29      30      31     
//                      August 2019
//_____________________________________
//Sun     Mon     Tue     Wed     Thu     Fri     Sat
//  1       2       3     
//  4       5       6       7       8       9      10     
// 11      12      13      14      15      16      17     
// 18      19      20      21      22      23      24     
// 25      26      27      28      29      30      31     
//                      September 2019
//_____________________________________
//Sun     Mon     Tue     Wed     Thu     Fri     Sat
//      
//  1       2       3       4       5       6       7     
//  8       9      10      11      12      13      14     
// 15      16      17      18      19      20      21     
// 22      23      24      25      26      27      28     
// 29      30     
//                      October 2019
//_____________________________________
//Sun     Mon     Tue     Wed     Thu     Fri     Sat
//                 1       2       3       4       5     
//  6       7       8       9      10      11      12     
// 13      14      15      16      17      18      19     
// 20      21      22      23      24      25      26     
// 27      28      29      30      31     
//                      November 2019
//_____________________________________
//Sun     Mon     Tue     Wed     Thu     Fri     Sat
//  1       2     
//  3       4       5       6       7       8       9     
// 10      11      12      13      14      15      16     
// 17      18      19      20      21      22      23     
// 24      25      26      27      28      29      30     
//                      December 2019
//_____________________________________
//Sun     Mon     Tue     Wed     Thu     Fri     Sat
//         
//  1       2       3       4       5       6       7     
//  8       9      10      11      12      13      14     
// 15      16      17      18      19      20      21     
// 22      23      24      25      26      27      28     
// 29      30      31     

