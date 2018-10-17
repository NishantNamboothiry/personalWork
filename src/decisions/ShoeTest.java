package decisions;

import java.util.Scanner;

public class ShoeTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner input = new Scanner(System.in);
	int shoe= input.nextInt();
	double height= 0;
	int size= 0;
	System.out.println("How tall are you?");
	height= input.nextDouble();
	System.out.println("What is your shoes size?");
	size= input.nextInt();
	System.out.println("Is the height less than 62 inches?");
	System.out.println(height < 26);
	System.out.println(size > 9);
	
	
	}

}
