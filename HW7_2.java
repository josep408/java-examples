package week7;
public class HW7_2 {

	public static void main(String[] args) {
		int dice1 = (int)(Math.random()* 6) + 1;
		int dice2 = (int)(Math.random()* 6) + 1;
		int roll = dice1 + dice2;
		System.out.println();
		System.out.print("You rolled "+roll+". ");
		if(roll == 2 || roll == 3 || roll == 12){
			System.out.println("You Lose !");
		}else if(roll == 7 || roll == 11){
			System.out.println("You Win!");
		}else{
			System.out.println("Point is "+roll+"\n");
			dice1 = (int)(Math.random()* 6) + 1;
			dice2 = (int)(Math.random()* 6) + 1;
			int roll2 = dice1 + dice2;
			System.out.print("You rolled "+roll2+". ");
			while(roll2 != 7){
				if(roll == roll2){
					System.out.println("You Win !");
					break;
				}else{
					System.out.println("Point is "+roll+"\n");
				}
				dice1 = (int)(Math.random()* 6) + 1;
				dice2 = (int)(Math.random()* 6) + 1;
				roll2 = dice1 + dice2;
				System.out.print("You rolled "+roll2+". ");
			}
			if(roll2 == 7){
				System.out.println("You Lose !");
			}			
		}
	}
}

//You rolled 10. Point is 10
//
//You rolled 5. Point is 10
//
//You rolled 8. Point is 10
//
//You rolled 7. You Lose !



//You rolled 6. Point is 6
//
//You rolled 8. Point is 6
//
//You rolled 5. Point is 6
//
//You rolled 6. You Win !

