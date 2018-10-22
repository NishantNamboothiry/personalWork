package decisions;

import java.util.Scanner;

public class TestScoresTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner input = new Scanner(System.in);
	double test1=0.0;
	double test2= 0.0;
	double test3= 0.0;
	double average= (test1+test2+test3)/2;
	System.out.println("What is your first test score?");
	test1= input.nextDouble();
	System.out.println("What is your second test score?");
	test2= input.nextDouble();
	System.out.println("What is your third test score?");
	test3= input.nextDouble();
	if (average>=92.5){
		System.out.println("You have an A.");
	}else{
		if (average>=84.5){
			System.out.println("You have a B.");
		}else
		if (average>=77.5){
			System.out.println("You have a C.");
		}else
		if (average>=69.5){
			System.out.println("You have a D.");
		}
		else{
		System.out.println("You have an F.");
			}
		
	}
		
	}
}
