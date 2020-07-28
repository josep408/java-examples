package week9;

import java.util.*;
public class HW9_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] myArr = new int [4][4];
		String nums;
		System.out.println("Enter a 4 by 4 matwix row by row: ");
		
		for(int i = 0; i < 4; i++)
		{
			for (int j = 0; j < 4; j++)
			{
				nums = sc.next();
				myArr[i][j] =Integer.parseInt(nums);
			}
		}
		System.out.println("Sum of the elements in the major diagonal is " +sumMajorDiagonal(myArr));
	}
	
	public static double sumMajorDiagonal(int[][] m) {
		double total = 0;
		for(int i = 0; i < 4; i++)
		{
			for (int j = 0; j< 4; j++) {
				
				if(i == j)
					total += m[i][j];
			}
		}
		return total;
	}
	
}

//Enter a 4 by 4 matwix row by row: 
//2 3 4 5
//4 4 4 4
//4 7 9 0
//7 8 9 6
//Sum of the elements in the major diagonal is 21.0
