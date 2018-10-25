package decisions;

import java.util.Scanner;
public static void main(String[] args) {
	// TODO Auto-generated method stub

public class RangeTest {
	
	Scanner input= new Scanner(System.in);
	int number= 0;
	int largest=0;
	int smallest=0;
	int range= largest-smallest;
	System.out.println("What is your integer?");
	number= input.nextInt();
	}
	
	do{
		if (number>largest){
			number=largest;
		}
		if (number<smallest){
			number=smallest;
		}
		System.out.println("Please enter a number.(9999 to quit):");
		number=input.nextInt();
	} while (number!=9999);
	System.out.println("The range is "+range+ ".");
	}
}

