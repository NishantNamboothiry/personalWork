package decisions;

import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	Scanner input= new Scanner(System.in);
	int one=0;
	int two=0;
	int sum=0;
	System.out.println("What is the first number?(999 to quit)");
	one= input.nextInt();
	System.out.println("What is the second number?");
	two= input.nextInt();
	
	do{
		sum= one+two;
		System.out.println("The sum is " +sum+ " .");
		System.out.println("What is the first number?(999 to quit)");
		one= input.nextInt();
		if (one!=999){
			System.out.println("What is the second number?");
			two= input.nextInt();
		}
		
		}
		
	 while (one!=999);
	}
}


