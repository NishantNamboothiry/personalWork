package decisions;

import java.util.Scanner;

public class LargestTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int first = 0;
		int second = 0;
		int third = 0;
		System.out.println("What is the first number?");
		first = input.nextInt();
		System.out.println("What is the second number?");
		second = input.nextInt();
		System.out.println("What is the third number?");
		third = input.nextInt();
		if (first < third && second < third) {
			System.out.println("The largest number is " + third);
		}
		if (first < second && third < second) {
			System.out.println("The largest number is " + second);
		}
		if (second < first && third < first) {
			System.out.println("The largest number is " + first);
		}
	}

}
