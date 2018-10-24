package decisions;
import java.util.Scanner;
public class Loop2Test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner input =new Scanner (System.in);
	double number= 0.0;
	double number2= 0.0;
	double largest= 0.0;
	System.out.println("Please enter a number.(9999 to quit)");
	number= input.nextInt();
	while (number !=9999)
	{
		if (number2>number)
		System.out.println("Your number times two is:" +number*2);
		number=input.nextDouble();
		}
	else{
		largest=number;
		System.out.println("Please enter a number.(9999 to quit)");
		number=input.nextDouble();
		}
	}
	System.out.println("The largest number is " + largest);
	
	}
}