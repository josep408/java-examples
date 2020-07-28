package week8;
import java.util.Scanner;

public class HW8_2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("How many students? ");
		String[] students = new String[input.nextInt()];
		int[] scores = new int[students.length];

		
		System.out.println("Enter the name and score for student:");
		for (int i = 0; i < students.length; i++) {
			System.out.print("Student " + (i + 1) + ": ");
			students[i] = input.next();
			System.out.print("Score: ");
			scores[i] = input.nextInt();
		}

		
		selectionSort(students, scores);

		for (String e: students) {
			System.out.println(e);
		}
	}

	
	public static void selectionSort(String[] strs, int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			int max = nums[i];
			int maxIndex = i;
			String temp;

			for (int j = i + 1; j < nums.length; j++) {
				if (nums[j] > max) {
					max = nums[j];
					maxIndex = j;
				}
			}
			
			if (maxIndex != i) {
				temp = strs[i];
				strs[i] = strs[maxIndex];
				strs[maxIndex] = temp;

				nums[maxIndex] = nums[i];
				nums[i] = max;
			}
		}
	}

	}


//How many students? 4
//Enter the name and score for student:
//Student 1: jose 90
//Score: Student 2: Tom 66
//Score: Student 3: Joel 88
//Score: Student 4: grace 95
//Score: grace
//jose
//Joel
//Tom
