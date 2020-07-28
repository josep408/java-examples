package week2;
import java.util.*;
public class HW2_2 {
	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double x1;
		double x2;
		double y1;
		double y2;
		double dis;
		
		System.out.println("Enter value for x1 and y1");
		 x1 = input.nextDouble();
		 y1 = input.nextDouble();
		
		System.out.println("Enter value for x1 and y1");
		 x2 = input.nextDouble();
		 y2 = input.nextDouble();
		dis = Math.sqrt((y2 - y1)*(y2-y1) + (x2 - x1)*(x2 - x1));
		System.out.println("The distance between two points is: " + dis);
		
		//Enter value for x1 and y1
		//1.5
		//-3.4
		//Enter value for x1 and y1
		//4
		//5
		//The distance between two points is: 8.764131445842194

		
		
		
		
	}

}
