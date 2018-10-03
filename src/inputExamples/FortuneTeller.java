package inputExamples;

import java.util.Scanner;
public class FortuneTeller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int age= 0;
		int weight= 0;
		Scanner input =new Scanner (System.in);
		System.out.println("What is your age?");
		age = input.nextInt();
		
		System.out.println("That's awesome! What is your weight?");
		weight = input.nextInt();
		System.out.println("Awesome!");
		System.out.println ("Your age is: " +age+ " And your weight is:" + weight);
	}

}