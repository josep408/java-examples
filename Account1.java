package account1;

public class Account {

	int accNumber;
	double balance;
	double annualInterestRate;
	String dateCreated;

	public Account(int accNumber, double balance, double annualInterestRate, String dateCreated) {
	this.accNumber = accNumber;
	this.balance = balance;
	this.annualInterestRate = annualInterestRate;
	this.dateCreated = dateCreated;
	}

	public void deposit(double amount)
	{
	balance = balance + amount;
	}

	public void withdraw(double amount)
	{
	balance = balance - amount;
	}

	public String toString()
	{
	String res = "";
	res += "Account number : " + accNumber + "\n";
	res += "Balance is : " + balance + "\n";
	res += "Annual Interest Rate is : " + annualInterestRate + "\n";
	res += "Date created is : " + dateCreated + "\n";
	return res;
	}
	}

	class CheckingAccount extends Account
	{
	public final double OVERDRAFTLIMIT = 100.00;

	public CheckingAccount(int accNumber, double balance, double annualInterestRate, String dateCreated) {
	super(accNumber, balance, annualInterestRate, dateCreated);
	}

	public void withdraw(double amount)
	{
	if(balance - amount <= OVERDRAFTLIMIT)
	{
	System.out.println("Sorry!!! Your balance cannot goes below " + OVERDRAFTLIMIT);
	}
	else
	{
	super.withdraw(amount);
	}
	}

	public String toString()
	{
	String res = "Checking account Details\n";
	res += super.toString();
	return res;
	}
	}
	class SavingsAccount extends Account
	{
	public SavingsAccount(int accNumber, double balance, double annualInterestRate, String dateCreated) {
	super(accNumber, balance, annualInterestRate, dateCreated);
	}

	public String toString()
	{
	String res = "Savings account Details\n";
	res += super.toString();
	return res;
	}
	}



package account1;

public class TestAccount {

	public static void main(String[] args)
	{
	Account acct = new Account(1001, 500, 3.5, "04/24/2019");
	CheckingAccount cacct = new CheckingAccount(1002, 1000, 4.0, "4/24/2019");
	SavingsAccount sacct = new SavingsAccount(1003, 750, 4.0, "04/24/2019");
	System.out.println(acct.toString());
	System.out.println(cacct.toString());
	System.out.println(sacct.toString());
	}

	}
//Account number : 1001
//Balance is : 500.0
//Annual Interest Rate is : 3.5
//Date created is : 04/24/2019
//
//Checking account Details
//Account number : 1002
//Balance is : 1000.0
//Annual Interest Rate is : 4.0
//Date created is : 4/24/2019
//
//Savings account Details
//Account number : 1003
//Balance is : 750.0
//Annual Interest Rate is : 4.0
//Date created is : 04/24/2019
