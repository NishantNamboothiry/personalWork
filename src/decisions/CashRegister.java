package decisions;
import java.util.Scanner;

public class CashRegister {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		int items=0;
		double cost=0;
		int counter= 0;
		double total= 0;
		double totaltax=0;
		System.out.println("How many items were purchased?");
		items= input.nextInt();
		{
			
		for (counter=1;counter<=items;counter++){
			System.out.println("What is the price for each item? (Enter all individually)");
			cost= input.nextDouble();
			total+= cost;
			totaltax= (total*0.05)+total;

		}
		System.out.println("The total is "+total+" dollars, and with the 5% tax, the absolute total is "+totaltax+ " dollars.");
		
			}
		}
	}