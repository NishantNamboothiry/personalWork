package inputExamples;
import java.util.Scanner;

public class LongDivision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dividen = 0;
		int divisor = 0;
			Scanner input = new Scanner (System.in);
			System.out.println("What is your dividen?");
			dividen = input.nextInt();
			System.out.println("What is your divisor?");
			divisor = input.nextInt();
			System.out.println("The answer is "+ (dividen/divisor)+"r"+(dividen%divisor));
	}

}
