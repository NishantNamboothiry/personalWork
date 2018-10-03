package inputExamples;

import java.util.Scanner;

public class Vote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean vote = true;
		Scanner input=new Scanner(System.in);
		System.out.println("Did you vote yet?");
		vote = input.nextBoolean();
		if (vote==true);
		System.out.println("Good for you!");
		if (vote==false) {
		System.out.println("Shame on you. Your parents don't love you.");
		}
	}

}
