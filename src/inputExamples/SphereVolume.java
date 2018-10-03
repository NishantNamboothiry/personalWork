package inputExamples;
import java.util.Scanner;

public class SphereVolume {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int radius = 0;
		final double FRACTION= 4.0/3.0;
		final double PI = 3.14;
			Scanner input = new Scanner (System.in);
			System.out.println("What is your Radius?");
			radius = input.nextInt();
			System.out.println("The volume is "+(FRACTION*PI*(radius*radius*radius))+ " units cubed." );
	}

}
