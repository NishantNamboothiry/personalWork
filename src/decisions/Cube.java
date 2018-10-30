package decisions;
import java.util.Scanner;
public class Cube {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner (System.in);
		int number= 0;
		int result= 0;
		System.out.println("What is the integer?(-1 to quit)");
		number= input.nextInt();
		while (number!=-1){
		result= number*number*number;
		System.out.println(result);
		System.out.println("Another integer?");
		number= input.nextInt();
	}
}
}
