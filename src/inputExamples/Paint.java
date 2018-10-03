package inputExamples;
import java.util.Scanner;

public class Paint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double length = 0;
		double width = 0;
			Scanner input = new Scanner (System.in);
			System.out.println("What is the length of the wall in feet?");
			length = input.nextInt();
			System.out.println("What is the width of the wall in feet?");
			width = input.nextInt();
			System.out.println("You will need " +(Math.pow(length*width,2)*4/150)+" Gallons of paint.");
	}

}
