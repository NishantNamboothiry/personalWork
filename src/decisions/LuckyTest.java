package decisions;

import java.util.Scanner;

public class LuckyTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double height = 0;
		double weight = 0;
		int age= 0;
		System.out.println("What is your current age?");
		age = input.nextInt();
		if (age >= 18)
		{
			System.out.println("What is your height?");
			height = input.nextDouble();
			System.out.println("Your lucky number is " +(height*5));
		}
		else {
			System.out.println("What is your weight?");
			weight = input.nextDouble();
			System.out.println("Your lucky number is "+(weight/2));
		}
	}

}
