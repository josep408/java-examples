package stopwatch;
import java.util.Random;
public class Main {

	public static void main(String[] args) {
		int[] list = new int[100000];

		Random random = new Random();

		

		for(int i = 0; i < list.length; i++) {

		list[i] = random.nextInt(100);

		}

		TestStartWatch stopwatch = new TestStartWatch();

		stopwatch.start();

		System.out.println("Start Time: " + stopwatch.getStartTime());

		selectionSort(list);

		stopwatch.stop();

		System.out.println("End Time: " + stopwatch.getEndTime());

		System.out.println("The Elapsed Time is "+ stopwatch.getElapsedTime() +" milliseconds"); 

		System.out.println("The Elapsed Time is "+ stopwatch.getElapsedTime()/1000 +" seconds"); 

		}

		public static void selectionSort(int[] x) {

		for(int i = 0; i < x.length; i++) {

		int minIndex = i;

		for(int j = i + 1; j < x.length; j++) {

		if(x[minIndex] > x[j]) {

		minIndex = j;

		}

		}

		if(minIndex != i) {

		int temp = x[i];

		x[i] = x[minIndex];

		x[minIndex] = temp;

		}

		}

		}

		}

//Start Time: 1555659573998
//End Time: 1555659576218
//The Elapsed Time is 2220 milliseconds
//The Elapsed Time is 2 seconds



package stopwatch;

public class TestStartWatch {
	private long startTime;

	private long endTime;

	TestStartWatch() {

	startTime = System.currentTimeMillis();

	}

	void start() {

	startTime = System.currentTimeMillis();

	}

	

	void stop() {

	endTime = System.currentTimeMillis();

	}


	long getElapsedTime() {

	return endTime - startTime;

	}


	public long getStartTime() {

	return startTime;

	}


	public long getEndTime() {

	return endTime;

	}

	}

