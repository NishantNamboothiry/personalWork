package Random_Numbers;

import java.util.Random;
public class thirteen_sided_die {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int counter = 0;
		int multiple_3 = 0;
		int number = 0;
		Random rand = new Random ();
		for (counter = 1; counter <= 87; counter ++){
			number = 0 + rand.nextInt(1 + 1);
			if (number%3 == 0){
				multiple_3++;
			}
			}
		System.out.println("Multiples of three roled: "+ multiple_3);
		}

	}

