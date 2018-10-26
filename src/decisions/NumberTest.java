package decisions;
import java.util.Scanner;

public class NumberTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		int counter=0;
		int sum= 0;
		int number= 0;
		{
		for (counter=1;counter<=5;counter++ )
		{
			System.out.println("What is your number?");
			number=input.nextInt();
			sum+=number;
		}
		System.out.println(sum);

}
}
}