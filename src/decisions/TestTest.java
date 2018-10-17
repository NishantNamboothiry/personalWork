package decisions;

import java.util.Scanner;

public class TestTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner input = new Scanner(System.in);
	double good= 0;
	double bad= 0;
	System.out.println("What is the first test score?");
	good= input.nextDouble();
	System.out.println("What is the second test score?");
	bad= input.nextDouble();
	if (good>bad);{
		System.out.println("Good job! The difference between the two scores were:"+(good-bad)+" .");
	}
	System.out.println("Have a nice day!");
	}

}

