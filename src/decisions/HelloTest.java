package decisions;
import java.util.Scanner;

public class HelloTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		int counter=0;
		double number=0;
		System.out.println("What is your favorite number?");
		number= input.nextInt();
		{
		for (counter=1;counter<=10;counter+= 1)
		{
			System.out.println(number +" Hello "+counter);
		}

}
}
}
