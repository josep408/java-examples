package rowColumn;
import java.util.Random;

public class LargestRowColumn {

	public static void main(String[] args) {
		 int arr[][] = new int[4][4];
	       int maxRow = 0, rowNumber = 0, maxCol = 0, colNumber = 0;
	       Random r = new Random();
	       System.out.println("The random 4x4 matrix:");
	       for(int i = 0; i < 4; i++){
	           for(int j = 0; j < 4; j++){
	               arr[i][j] = r.nextInt(2);
	               System.out.print(arr[i][j] + " ");
	           }
	           System.out.println();
	       }
	       for(int i = 0; i < 4; i++){
	           int tempRow = 0;
	           for(int j = 0; j < 4; j++){
	               if(arr[i][j] == 1) tempRow++;
	           }
	           if(maxRow < tempRow){
	               maxRow = tempRow;
	               rowNumber = i;
	           }
	       }
	       for(int i = 0; i < 4; i++){
	           int tempCol = 0;
	           for(int j = 0; j < 4; j++){
	               if(arr[j][i] == 1) tempCol++;
	           }
	           if(maxCol < tempCol){
	               maxCol = tempCol;
	               colNumber = i;
	           }
	       }
	       System.out.println("The largest row index: " + rowNumber);
	       System.out.println("The largest column index: " + colNumber);

	}

}


//The random 4x4 matrix:
//1 0 0 0 
//1 1 0 1 
//0 1 0 0 
//1 0 1 1 
//The largest row index: 1
//The largest column index: 0
