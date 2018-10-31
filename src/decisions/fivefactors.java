package decisions;
import java.util.Scanner;
public class fivefactors {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner (System.in);
		int value=0;
		int i=0;
		System.out.println("What is your value?");
		i=input.nextInt();
		{
		for (value=5;value<=i;value+=5)
		{
			System.out.println(value);
		}

}
}
}
