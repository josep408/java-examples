package week8;

public class HW8_1 {

	static final int NUMBER_OF_PRIMES = 50;
	public static void main(String[] args) {
		 int[] primeNumbers = new int[NUMBER_OF_PRIMES];
	        int index = 0;

	        for (int i = 2; index < NUMBER_OF_PRIMES; i++) {

	            if (isPrime(i)) {
	                primeNumbers[index++] = i;
	            }
	        }

	       printArray(primeNumbers, 10);

	    }

	    public static boolean isPrime(int number) {

	        for (int i = 2; i <= Math.sqrt(number); i++) {
	            if (number % i == 0) return false;

	        }

	        return true;
	    }

	    public static void printArray(int[] array, int numberPerLine) {

	        for (int i = 0; i < array.length; i++) {

	            System.out.printf("%10d ", array[i]);
	            if ((i + 1) % numberPerLine == 0) System.out.println("");
	        }
	    }

	}

//2          3          5          7         11         13         17         19         23         29 
//31         37         41         43         47         53         59         61         67         71 
//73         79         83         89         97        101        103        107        109        113 
//127        131        137        139        149        151        157        163        167        173 
//179        181        191        193        197        199        211        223        227        229 
