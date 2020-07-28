package week11;

import java.util.*;
public class Midterm2_Prob2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input the stock symbol: ");
		String Symbol = sc.nextLine();
		
		System.out.println("Please input the stock name: ");
		String nombre = sc.nextLine();
		
		Stock stock = new Stock(Symbol, nombre);
		
		System.out.println("Please set the previous price: ");
		stock.setPreviousPrice(sc.nextDouble());
		
		System.out.println("PLease set the current price: ");
		stock.setCurrentPrice(sc.nextDouble());
		
		System.out.println("Price Change percentage of stock is: " + stock.getChangePercent() +"% ");
		
		

	}

}

//Please input the stock symbol: 
//ORCL
//Please input the stock name: 
//Oracle Corporation
//Please set the previous price: 
//34.67
//PLease set the current price: 
//33.5
//Price Change percentage of stock is: -3.492537313432841% 


package week11;

public class Stock {
			private String Symbol;
			private String nombre;
			private double previousClosingPrice;
			private double currentPrice;
			
			
			Stock(String Symbol, String name) {
				this.Symbol = Symbol;
				this.nombre = nombre;
				
				
			}
			
			public void setSymbol() {
				Symbol = Symbol;
			}
			
			public String getName() {
				
				return nombre;
			}
			
			public void setName(String name) {
				this.nombre = nombre; 
			}
			
			public double getChangePercent() {
				return ((currentPrice - previousClosingPrice)* 100)/ currentPrice; 
			}
			public void setPreviousPrice(double previous) {
				previousClosingPrice = previous;
				
			}
			public void setCurrentPrice(double current) {
				currentPrice = current;
			}
			 public String toString() {
			       
			       return "Stock Symbol : "+Symbol+"\nStock Name : "+ nombre;
			   }

}

