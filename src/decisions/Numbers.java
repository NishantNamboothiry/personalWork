package decisions;

import java.util.Scanner;

public class Numbers {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	Scanner input= new Scanner(System.in);
	int one=0;
	int two=0;
	int sum=0;
	System.out.println("What is the year?");
	int year=input.nextInt();
	System.out.println("Enter a number:");
	one= input.nextInt();
	
	
	do{
		sum= one+sum;
		two++;
		System.out.println("Enter a number:");
		one= input.nextInt();
		
		}
		while (sum<year);
	System.out.println("You entered "+ (two+1)+" Numbers!");
	}
}


