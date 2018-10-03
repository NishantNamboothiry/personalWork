package inputExamples;

import java.util.Scanner;
public class AgesSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int age= 0;
		int otherage= 0;
		int thirdage= 0;
		Scanner input =new Scanner (System.in);
		System.out.println("What is your age?");
		age = input.nextInt();
		
		System.out.println("What is your friends age?");
		otherage = input.nextInt();
		
		System.out.println("What is your third friends age?");
		thirdage = input.nextInt();
		
		System.out.println ("The sum of your guys age is: " +(age+otherage+thirdage)+" years old.");
	}

}