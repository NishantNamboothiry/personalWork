package Greeter;

import java.util.Scanner;

public class CarOOP {
	public CarOOP() {
		
	}
	public void Area() {
		int length = 0;
		int height = 0;
	Scanner input = new Scanner(System.in);	
System.out.println("What is the length of the wall?");
	length = input.nextInt();
	System.out.println("What is the height of the wall?");
	height = input.nextInt();
	
	System.out.println("The area of your wall is "+(length*height));

	}

		
			
	
public void door() {
	int length = 0;
	int height = 0;
Scanner input = new Scanner(System.in);	
System.out.println("What is the length of the door?");
length = input.nextInt();
System.out.println("What is the height of the door?");
height = input.nextInt();

System.out.println("The area of your door is "+(length*height));

}
	
public void Thirsty() {
	System.out.println("Hey dude, how are you? I need some gas, or I'm gonna die. Thx!");
	}
}

