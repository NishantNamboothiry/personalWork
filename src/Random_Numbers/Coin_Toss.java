package Random_Numbers;

import java.util.Random;

public class Coin_Toss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		int heads = 0;
		int tails = 0;
		int counter = 0;
		int random_number = 0;
		for (counter = 1; counter <= 100000; counter++) {
			random_number = 0 + rand.nextInt();
			if (random_number == 1) {
				heads++;
			} else {
				tails++;
			}
		}
		System.out.println("Heads:" + heads);
		System.out.println("Tails" + tails);
	}

}
