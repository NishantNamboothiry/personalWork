package decisions;
import java.util.Scanner;
public class LoopTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner input =new Scanner (System.in);
	int number;
	System.out.println("Please enter a number.(9999 to quit)");
	number= input.nextInt();
	while (number !=9999)
	{
		System.out.println("Your number times two is:" +number*2);
		}
	System.out.println("Please enter a number.(9999 to quit)");
	number=input.nextInt();
		}
	}
}