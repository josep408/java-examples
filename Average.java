package week11;

import java.util.*;
public class Midterm_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int M = sc.nextInt();
		System.out.println("Enter the number of columns");
		int N = sc.nextInt();
		double [][] myArr = new double [N][M];
		double nums;
		System.out.println ("Enter the number in the arrays");
		
		for(int i = 0; i < myArr.length; i++)
		{
			for (int j = 0; j < myArr.length; j++)
			{
				nums = sc.nextDouble();
				myArr[i][j] = nums;
			}
		}
		System.out.println("The Average of all the elements is= " + average(myArr));
	}
	
	public static double average(double[][] m) {
		double total = 0.0;
		for(double i = 0.0; i < m.length; i++)
		{
			for (double j = 0.0; j< m.length; j++) {
				
				if(i == j)
					total += m[(int) i][(int) j];
			}
		}
		return total;
	}

}

//Enter the number of rows
//3
//Enter the number of columns
//3
//Enter the number in the arrays
//2.5
//3.0
//2.9
//3.2
//2.1
//2.3
//2.2
//2.5
//2.4
//The Average of all the elements is= 7.0

