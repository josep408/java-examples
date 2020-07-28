package week13;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class WrtieRandomNumbers {

	public static void main(String[] args) {
		try {

			File file = new File("Exercise12.15.txt");

			if (!file.exists()) {
				file.createNewFile();
			}

			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);

			Random rand = new Random();
			int max = 100;
			int min = 1;

			System.out.println("Generating Random numbers");
			for (int i = 1; i <= 100; i++) {

				int randomNum = rand.nextInt((max - min) + 1) + min;
				bw.write(randomNum + " ");

			}
			System.out.println("Writing Random numbers to Exercise12.15.txt is completed");

			bw.close();

			System.out.println("Reading data back from file:");
			String sCurrentLine;

			BufferedReader br = new BufferedReader(new FileReader("Exercise12.15.txt"));

			int data[] = new int[100];
			int j = 0;
			while ((sCurrentLine = br.readLine()) != null) {
				String lineData[] = sCurrentLine.split(" ");
				for (int i = 0; i < lineData.length; i++) {
					data[j] = Integer.parseInt(lineData[i]);
					j++;
				}

			}
			br.close();

			for (int i = 0; i < j - 1; i++) {
				for (int k = i + 1; k < j; k++) {
					if (data[i] > data[k]) {
						int temp = data[i];
						data[i] = data[k];
						data[k] = temp;
					}
				}
			}

			System.out.println("File data in increasing order");
			for (int i = 0; i < j; i++) {

				System.out.print(data[i] + " ");
				if ((i + 1) % 5 == 0) {
					System.out.print("\n");
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}




//Generating Random numbers
//Writing Random numbers to Exercise12.15.txt is completed
//Reading data back from file:
//File data in increasing order
//1 1 2 2 2 
//3 4 7 8 9 
//9 11 11 12 12 
//14 15 16 17 18 
//18 18 19 19 20 
//22 22 22 23 24 
//25 25 28 30 31 
//32 37 37 39 41 
//42 45 45 46 47 
//49 49 49 49 52 
//52 53 53 53 54 
//55 56 58 59 59 
//59 60 62 66 66 
//67 68 69 70 71 
//75 75 76 77 79 
//80 81 81 81 81 
//82 83 84 85 85 
//85 86 86 90 91 
//91 91 94 95 96 
//97 98 98 100 100 
