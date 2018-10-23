package decisions;
import java.util.Scanner;
public class IntTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner input =new Scanner (System.in);
	int count=0;
	int enumber=0;
	int sum=0;
	System.out.println("What is the end number?");
	enumber= input.nextInt();
	while (count<=enumber)
	{
		count +=2;
		sum +=count;
		}
	System.out.println("The sum is "+sum);
	}
}
