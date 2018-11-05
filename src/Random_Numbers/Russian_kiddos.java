package Random_Numbers;

import java.util.Random;
public class Russian_kiddos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random ();
		int height = 0;
		int counter = 0;
		int number = 0;
		for (counter = 1; counter <= 248; counter ++){
			number = rand.nextInt();
			if (number > 36){
				height++;
			}
			}
		System.out.println("The first graders taller than three feet are: " +height);
		}

	}

