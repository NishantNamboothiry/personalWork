package decisions;

import java.util.Scanner;

public class SalaryTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int money = 0;
		System.out.println("How much money do you make in a year?");
		money = input.nextInt();
		if (money <= 20000) {
			System.out.println("You are a worker");
		} else {
			if (money > 20000 && money <= 40000) {
				System.out.println("You are a manager.");
			} else {
				if (money > 40000 && money <= 100000) {
					System.out.println("You are a CEO.");
				}
				else{
					System.out.println("You are a Owner.");
				}
			}
		}
	}
}
