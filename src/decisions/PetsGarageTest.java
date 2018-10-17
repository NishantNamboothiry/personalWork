package decisions;

import java.util.Scanner;

public class PetsGarageTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner input = new Scanner(System.in);
	int PetsGarage = input.nextInt();
	int pets= 0;
	int cars= 0;
	System.out.println("How many pets do you have?");
	pets= input.nextInt();
	System.out.println("How many cars can fit in your Garage?");
	cars= input.nextInt();
	System.out.println("Can the user fit at least 3 cars?");
	System.out.println(cars > 3);
	System.out.println("Does the user have at least 5 cars?");
	System.out.println(pets > 5);
	
	
	}

}

