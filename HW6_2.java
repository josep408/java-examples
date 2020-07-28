package week6;

public class HW5_2 {

	public static void main(String[] args) {
		int i;
		double sum = 0;
		for (i=1; i <= 100000; i++) {
			sum = sum + Math.pow(-1, i + 1)/ (2* i - 1);
			
			if (i%10000==0)
			System.out.println("pi is approximately " + 4 * sum);
		}
		
		//pi is approximately 3.1414926535900345
		//pi is approximately 3.1415426535898248
		//pi is approximately 3.141559320256462
		//pi is approximately 3.1415676535897985
		//pi is approximately 3.1415726535897814
		//pi is approximately 3.141575986923102
		//pi is approximately 3.141578367875482
		//pi is approximately 3.1415801535897496
		//pi is approximately 3.1415815424786238
		//pi is approximately 3.1415826535897198

	}

}
