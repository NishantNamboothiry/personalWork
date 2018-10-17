package decisions;

import java.util.Scanner;

public class AAgeTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner input = new Scanner(System.in);
	int age=0;
	System.out.println("What is your age?");
	age= input.nextInt();
	if (age<17){
		System.out.println("You are getting an A in this class.");
	}
System.out.println("I hope you are having a great day!");
	}

}
