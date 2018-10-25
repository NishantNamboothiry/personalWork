package decisions;

import java.util.Scanner;

public class IntegerTest {
	
	public static void main(String[]args){
	Scanner input= new Scanner(System.in);
	int number= 0;
	System.out.println("What is your integer?");
	number =input.nextInt();
	
	do
	{ 
		System.out.println("Magic product is:" +number+17);
		System.out.println("Please enter a number.(9999 to quit):");
		number=input.nextInt();
	} while (number!=9999);
	}
}
