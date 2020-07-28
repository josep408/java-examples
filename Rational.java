package week14;

import java.math.BigInteger;
import java.util.Scanner;

public class RationalNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the first rational number: \n");
		String n1 = sc.nextLine();
		String n11 = sc.nextLine();
		
		Rational r1 = new Rational(new BigInteger(n1), new BigInteger(n11));

		System.out.print("Enter second rational number: \n ");

		String n2 = sc.nextLine(); 

		String n22 = sc.nextLine(); 


		Rational r2 = new Rational(new BigInteger(n2), new BigInteger(n22));


		System.out.println("Addition: "+r1 + " + " + r2 + " = " + r1.addition(r2));

		System.out.println("Subtraction: "+r1 + " - " + r2 + " = " + r1.subtraction(r2));

		System.out.println("Multiplication: "+r1 + " * " + r2 + " = " + r1.multiplication(r2));

		System.out.println("Division: "+r1 + " / " + r2 + " = " + r1.division(r2));

		System.out.println(r2 + " is " + r2.doubleValue());

		}

		}


//Enter the first rational number: 
//3
//454
//Enter second rational number: 
// 7
//2389
//Addition: 3/454 + 7/2389 = 10345/1084606
//Subtraction: 3/454 - 7/2389 = 3989/1084606
//Multiplication: 3/454 * 7/2389 = 21/1084606
//Division: 3/454 / 7/2389 = 7167/3178
//7/2389 is 0.0029300962745918793



package week14;

import java.math.*;
public class Rational extends Number implements Comparable

{


private BigInteger[] rat = new BigInteger[2];

public Rational()

{

this(new BigInteger("0"), new BigInteger("1"));

}

public Rational(BigInteger num, BigInteger den)

{

BigInteger gcd = gcd(num, den);

rat[0] = (den.compareTo(BigInteger.ZERO) > 0? BigInteger.ONE : new BigInteger("-1")).multiply(num.divide(gcd));

rat[1] = den.divide(gcd);

}


private static BigInteger gcd(BigInteger nn, BigInteger dd)

{

BigInteger n1 = nn;

BigInteger n2 = dd;

BigInteger gcd = BigInteger.ONE;

for (BigInteger kk = BigInteger.ONE; kk.compareTo(n1) <= 0 && kk.compareTo(n2) <= 0; kk = kk.add(BigInteger.ONE))

{

if (n1.remainder(kk).compareTo(BigInteger.ZERO) == 0 && n2.remainder(kk).compareTo(BigInteger.ZERO) == 0)

gcd = kk;

}

return gcd;

}



public BigInteger getNum()

{

return rat[0];

}


public BigInteger getDen()

{

return rat[1];

}


public Rational addition(Rational secondRat)

{

BigInteger nn = (rat[0].multiply(secondRat.getDen())).add(rat[1].multiply(secondRat.getNum()));

BigInteger dd = rat[1].multiply(secondRat.getDen());

return new Rational(nn, dd);

}


public Rational subtraction(Rational secondRat)

{

BigInteger nn = (rat[0].multiply(secondRat.getDen())).subtract(rat[1].multiply(secondRat.getNum()));

BigInteger dd = rat[1].multiply(secondRat.getDen());

return new Rational(nn, dd);

}


public Rational multiplication(Rational secondRat)

{

BigInteger nn = rat[0].multiply(secondRat.getNum());

BigInteger dd = rat[1].multiply(secondRat.getDen());

return new Rational(nn, dd);

}


public Rational division(Rational secondRat)

{

BigInteger nn = rat[0].multiply(secondRat.getDen());

BigInteger dd = rat[1].multiply(secondRat.getNum());

return new Rational(nn, dd);

}



public String toString()

{

if (rat[1].compareTo(BigInteger.ONE) == 0)

return rat[0] + "";

else

return rat[0] + "/" + rat[1];

}



public boolean equals(Object other)

{

if (((this.subtraction((Rational)(other))).getNum()).compareTo(BigInteger.ZERO) == 0)

return true;

else

return false;

}


public int intValue()

{

return (int)doubleValue();

}



public float floatValue()

{

return (float)doubleValue();

}


public double doubleValue()

{

return this.getNum().doubleValue() / this.getDen().doubleValue();

}

public long longValue()

{

return (long)doubleValue();

}



public int compareTo(Object o)

{

BigInteger zero = BigInteger.ZERO;

BigInteger nn = this.subtraction((Rational)o).getNum();

if (nn.compareTo(zero) > 0)

return 1;

else if (nn.compareTo(zero) < 0)

return -1;

else

return 0;

}

}

