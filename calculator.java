package week13;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String option;
		do{

		System.out.println("-------Welcome to calculator--------");
		System.out.print("Enter first number:  ");
		int first = sc.nextInt();
		System.out.print("Enter the operator('+','-','*' or '/'): ");
		String operator = sc.next();
		System.out.print("Enter second number:  ");
		int second = sc.nextInt();
		double result = 0;
		if(operator.equals("+")){
		result = first+second;
		}
		else if(operator.equals("-")){
		result = first-second;
		}
		else if(operator.equals("*")){
		result = first*second;
		}
		else if(operator.equals("/")){
		result = first/second;
		}

		String resultFormatted = String.format("%.2f",result);
		System.out.println("Result for "+first+operator+second+" = "+result);

		System.out.println("Do you want to continue?(Y/N)");
		option = sc.next();
		}
		while(option.equalsIgnoreCase("Y"));

		sc.close();

		}

	}


//-------Welcome to calculator--------
//Enter first number:  1
//Enter the operator('+','-','*' or '/'): *
//Enter second number:  576
//Result for 1*576 = 576.0
//Do you want to continue?(Y/N)
//y
//****Welcome to calculator*******
//Enter first number:  67
//Enter the operator('+','-','*' or '/'): -66
//Enter second number:  66
//Result for 67-6666 = 0.0
//Do you want to continue?(Y/N)
//y
//****Welcome to calculator*******
//Enter first number:  6
//Enter the operator('+','-','*' or '/'): +
//Enter second number:  5
//Result for 6+5 = 11.0
//Do you want to continue?(Y/N)
//y
//****Welcome to calculator*******
//Enter first number:  456
//Enter the operator('+','-','*' or '/'): /
//Enter second number:  675
//Result for 456/675 = 0.0
//Do you want to continue?(Y/N)
//n
