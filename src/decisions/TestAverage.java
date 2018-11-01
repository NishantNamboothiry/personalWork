package decisions;
import java.util.Scanner;

public class TestAverage {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		int people=0;
		double scores=1;
		int counter= 0;
		double average= 0;
		System.out.println("How many students took the test?");
		people= input.nextInt();
		{
			
		for (counter=1;counter<=people;counter++){
			System.out.println("What is the score? (Enter all individually)");
			scores= input.nextDouble();
			average+= scores/people;

		}
		System.out.println(average);
			}
		}
	}

