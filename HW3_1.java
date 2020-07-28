package week3;

import java.util.Scanner;
public class HW3_1 {

	public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

            System.out.print("Input a: ");
            double a = input.nextDouble();
            System.out.print("Input b: ");
            double b = input.nextDouble();
            System.out.print("Input c: ");
            double c = input.nextDouble();

            double result = b * b - 4.0 * a * c;

            if (result > 0.0) {
                double root1 = (-b + Math.pow(result, 0.5)) / (2.0 * a);
                double root2 = (-b - Math.pow(result, 0.5)) / (2.0 * a);
                System.out.println("The equation has two roots " + root1 + " and " + root2);
            } else if (result == 0.0) {
                double r1 = -b / (2.0 * a);
                System.out.println("The equation has only one root and it is " + r1);
            } else {
                System.out.println("The equation has no real roots.");
            }
            
            //Input a: 1.0
            //Input b: 3
            //Input c: 1
            //The equation has two roots -0.3819660112501051 and -2.618033988749895
            
            //Input a: 1
            //Input b: 2.0
            //Input c: 1
            //The eqiatiom has only one root and it is -1.0
            
            //Input a: 1
            //Input b: 2
            //Input c: 3
            //The equation has no real roots.


	}

}
