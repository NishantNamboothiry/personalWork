package decisions;

import java.util.Scanner;

public class GradeTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double test = 0;
		double hw = 0;
		boolean teacher = true;
		System.out.println("What is your average test score?");
		test = input.nextDouble();
		System.out.println("What your your average homework score?");
		hw = input.nextDouble();
		System.out.println("Is your teacher nice? (true or false?)");
		teacher = input.nextBoolean();
		if (teacher == true) {
			if (hw > test)
				System.out.println("Your grade is " + hw+"%");
			else {
				System.out.println("Your grade is " + test+"%");
			}
		}
		if (teacher == false) {
			if (hw > test)
				System.out.println("Your grade is " + test+"%");
			else {
				System.out.println("Your grade is " + hw+"%");
			}
		}
	}
}