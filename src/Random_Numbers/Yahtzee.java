package Random_Numbers;

import java.util.Random;
public class Yahtzee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random ();
		int first_die = 0;
		int second_die = 0;
		int third_die = 0;
		int fourth_die = 0;
		int fifth_die = 0;
		int counter = 0;
		int roll = 0;
		int win = 0;
		for (counter = 0; counter == 0; counter = win){
			first_die = rand.nextInt(6);
			second_die = rand.nextInt(6);
			third_die = rand.nextInt(6);
			fourth_die = rand.nextInt(6);
			fifth_die = rand.nextInt(6);
			System.out.println(first_die + " " + second_die + " " + third_die + " " + fourth_die + " " + fifth_die);
			if (first_die == second_die && second_die == third_die && third_die == fourth_die && fourth_die == fifth_die){
				win = 1;
				System.out.println("You got Yahtzee!");
			}
			else {
				System.out.println("Try Again.");
			}
		}
		

	}

}
