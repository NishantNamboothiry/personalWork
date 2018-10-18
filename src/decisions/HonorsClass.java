package decisions;

import java.util.Scanner;

public class HonorsClass {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int grade = 0;
		double gpa = 0;
		System.out.println("What grade are you in currently?");
		grade = input.nextInt();
		System.out.println("What is your current GPA?");
		gpa = input.nextDouble();
		if (grade >= 12 && GPA >= 3.5)
		{
			System.out.println("Congratulations! You can graduate as an honors student!");
		}
		else {
			System.out.println("Double check that you are a Senior and have an above 3.5 GPA, then come back.");
		}
	}

}
