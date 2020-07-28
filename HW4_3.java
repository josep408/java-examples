package week5;
import java.util.*;
public class HW4_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Employee's Name: ");
		String name = sc.nextLine();
		
		System.out.println("Enter the number of hours worked during the week: ");
		double hrs = sc.nextDouble();
		
		System.out.println("Enter Pay Rate: ");
		double rate = sc.nextDouble();
		
		System.out.println("Enter the Federal Tax Witholding percentage:");
		double tax = sc.nextDouble();
		
		System.out.println("Enter the State Tax Witholding percentage: ");
		double state = sc.nextDouble();
		double grossPay = rate * hrs;
		double fedDeduction = grossPay * tax;
		double stDeduction = grossPay * state;
		double totalDeduction = fedDeduction + stDeduction;
		double netPay = grossPay - totalDeduction;
		System.out.println("Employee name: " + name);
		System.out.println("Hours Worked: " + hrs);
		System.out.println("Pay Rate: $ " + rate);
		System.out.println("Gross Pay: $" + grossPay);
		System.out.println("Deductions: ");
		System.out.println("Federal Witholding: " + " %" + tax*100 + " $" + fedDeduction);
		System.out.println("State Witholding: " + " %" + tax*100 + " $" + stDeduction);
		System.out.println("Total Deduction: " + " $" + totalDeduction);
		System.out.println("Your Net Pay is: " + " $" + netPay);
		
		/*Enter the Employee's Name: 
		Jose
		Enter the number of hours worked during the week: 
		10.0
		Enter Pay Rate: 
		25.0
		Enter the Federal Tax Witholding percentage:
		0.20
		Enter the State Tax Witholding percentage: 
		0.09
		Employee name: Jose
		Hours Worked: 10.0
		Pay Rate: $ 25.0
		Gross Pay: $250.0
		Deductions: 
		Federal Witholding:  %20.0 $50.0
		State Witholding:  %20.0 $22.5
		Total Deduction:  $72.5
		Your Net Pay is:  $177.5*/

	}

}
