package week7;

public class Pi {

	public static void main(String[] args) {
		int i;
		double sum = 0;
		for (i=1; i <= 10000000; i++) {
			sum = sum + Math.pow(-1, i + 1)/ (2* i - 1);
			
			if (i%1000000==0)
			System.out.println("pi is approximately " + 4 * sum);
		}
//		pi is approximately 3.1415916535897743
//		pi is approximately 3.141592153589724
//		pi is approximately 3.1415923202563736
//		pi is approximately 3.141592403589655
//		pi is approximately 3.1415924535897797
//		pi is approximately 3.1415924869231824
//		pi is approximately 3.1415925107326004
//		pi is approximately 3.1415925285896966
//		pi is approximately 3.141592542478652
//		pi is approximately 3.1415925535897915
//

	}

}
