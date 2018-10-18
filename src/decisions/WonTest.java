package decisions;

import java.util.Scanner;

public class WonTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double money = 0;
		System.out.println("How much money have you recieved?");
		money = input.nextDouble();
		if (Math.abs(money == Math.sqrt(84.3)))
		{
			System.out.println("Congratulations! You have won a billion dollars!");
		}
		else {
			System.out.println("You won Rocky. The Rock. Try again.");
		}
	}

}
