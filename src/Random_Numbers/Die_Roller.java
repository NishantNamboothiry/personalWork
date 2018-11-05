package Random_Numbers;

import java.util.Scanner;
import java.util.Random;
public class Die_Roller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		int die = 0;
		int counter = 0;
		int number_rolls = 0;
		int answer = 0;
		System.out.println("How many sides do you want this die to have?");
		die = input.nextInt();
		System.out.println("How many times should it be rolled?");
		number_rolls = input.nextInt();
		for (counter = 1; counter <= number_rolls; counter ++){
			answer = 1 +rand.nextInt(die -1 + 1);
			System.out.println(answer+ " ");
		}
	}

}
