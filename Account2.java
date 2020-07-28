package account2;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Account {
	  private int id = 0;
	   private double balance = 0;
	   private double annualIntrestRate = 0;
	   private Date dateCreated;
	   private String customerName;
	   // why i make it transaction is static ,because to track every record
	   private static List<Transaction> transactionsList = null;

	   public List<Transaction> getTransactionsList() {
	       if (transactionsList == null) {
	           transactionsList = new ArrayList<Transaction>();
	           return transactionsList;
	       }
	       return transactionsList;
	   }

	   public Account(int id, double balance, String customerName) {
	       this.id = id;
	       this.balance = balance;
	       this.customerName = customerName;
	   }

	   @Override
	   public String toString() {
	       return "Account [id=" + id + ", balance=" + balance
	               + ", annualIntrestRate=" + annualIntrestRate
	               + ", customerName=" + customerName + "]";
	   }

	   public Account() {
	       id = 0;
	       balance = 0;
	       annualIntrestRate = 0;
	       dateCreated = null;
	       customerName = null;

	   }

	   public Account(int id, double balance) {
	       this.id = id;
	       this.balance = balance;
	   }

	   public int getId() {
	       return id;
	   }

	   public void setId(int id) {
	       this.id = id;
	   }

	   public double getBalance() {
	       return balance;
	   }

	   public void setBalance(double balance) {
	       this.balance = balance;
	   }

	   public double getAnnualIntrestRate() {
	       return annualIntrestRate;
	   }

	   public void setAnnualIntrestRate(double annualIntrestRate) {
	       this.annualIntrestRate = annualIntrestRate;
	   }

	   public Date getDateCreated() {
	       return dateCreated;
	   }

	   public void setDateCreated(Date dateCreated) {
	       this.dateCreated = dateCreated;
	   }

	   public double getMonthlyInterestRate() {
	       return (this.getAnnualIntrestRate() / 12);
	   }

	   public double getMonthlyInterest() {
	       return (getBalance() * getMonthlyInterestRate() / 100);
	   }

	   public double withDraw(double balance) {
	       double transactionAmount = balance;
	       this.setBalance(this.getBalance() - balance);

	       Date transactiondate = new Date();
	       char transactionType = 'w';
	       double remainingbalance = this.getBalance();
	       String description = "i withdraw the money $" + transactionAmount;
	       Transaction transaction = new Transaction(transactiondate,
	               transactionType, transactionAmount, remainingbalance,
	               description);

	       List<Transaction> list = getTransactionsList();
	       list.add(transaction);
	       return this.getBalance();
	   }

	   public double deposite(double balance) {
	       double transactionAmount = balance;
	       this.setBalance(this.getBalance() + balance);
	       Date transactiondate = new Date();
	       char transactionType = 'd';
	       double remainingbalance = this.getBalance();
	       String description = "i deposited the money with $" + transactionAmount;
	       Transaction transaction = new Transaction(transactiondate,
	               transactionType, transactionAmount, remainingbalance,
	               description);

	       List<Transaction> list = getTransactionsList();
	       list.add(transaction);

	       return this.getBalance();
	   }

	   public double totalBalance() {
	       balance = balance + getMonthlyInterest();
	       return balance;
	   }

	}

package account2;
import java.util.Date;

public class Transaction {

	  protected Date transactionDate;
	   protected char type;
	   protected double amount;
	   protected double balance;
	   protected String description;

	   public Transaction(Date transactionDate, char type, double amount,
	           double balance, String description) {
	       this.transactionDate = transactionDate;
	       this.type = type;
	       this.amount = amount;
	       this.balance = balance;
	       this.description = description;
	   }

	
	   public String toString() {
	       return "Transaction [transactionDate=" + transactionDate + ", type="
	               + type + ", amount=" + amount + ", balance=" + balance
	               + ", description=" + description + "]";
	   }
}


package account2;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;
public class TestAccount {
	
	  public static void main(String[] args) {

	       Scanner sc = new Scanner(System.in);
	       System.out.println("Enter the customer name");
	       String customerName = sc.next();
	       Random random = new Random();
	       int id = random.nextInt(1000);
	       System.out.println("Enter the balance in your account");
	       double balance = sc.nextDouble();
	       System.out.println("Enter the annualinterest rate");
	       double annualIntrestRate = sc.nextDouble();

	       Account account = new Account(id, balance, customerName);
	       account.setAnnualIntrestRate(annualIntrestRate);

	       System.out.println("Enter the money to deposit");
	       double depositedAmount = sc.nextDouble();
	       double amount = account.deposite(depositedAmount);

	       System.out.println("Enter the money withdraw");

	       double withdrawAmount = sc.nextDouble();

	       double amount1 = account.withDraw(withdrawAmount);

	       System.out.println("The account information is");

	       System.out.println(account.toString());

	       System.out.println("All transactions are");

	       for (Transaction transaction : account.getTransactionsList()) {
	           System.out.println(transaction.toString());
	       }

	   }

	}

//enter the customer name
//Jose
//enter the balance in your account
//2000
//enter the annual interest rate
//.04
//Enter the money to deposit
//700
//Enter the money withdraw
//200
//the account information is
//Account [id=98, balance=2500.0, annualIntrestRate=0.04, customerName=Jose]
//All transactions are
//Transaction [transactionDate=Thu Apr 25 23:35:04 PDT 2019, type=d, amount=700.0, balance=2700.0, description=i deposited the money with $700.0]
//Transaction [transactionDate=Thu Apr 25 23:35:07 PDT 2019, type=w, amount=200.0, balance=2500.0, description=i withdraw the money $200.0]
