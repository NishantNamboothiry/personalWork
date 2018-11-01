package decisions;
import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		int factorial=0;
		int counter= 0;
		System.out.println("Positve whole number that I can find the factors of:");
		factorial= input.nextInt();
		{
			
		for (counter=1;counter<=factorial;counter++){
			if (factorial % counter ==0){
			System.out.println(counter + " ");

		}
			}
		}
	}
}