package decisions;

import java.util.Scanner;

public class TemperatureTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner input = new Scanner(System.in);
	double temp=0;
	System.out.println("What is the temperature outside?");
	temp= input.nextDouble();
	if (temp>83){
		System.out.println("Go swimming.");
	}else{
		if (temp>74 && temp<=83){
			System.out.println("Go play some tennis.");
		}else
		if (temp>35 && temp<=74){
			System.out.println("Go play some golf");
		}else
		if (temp>-10 && temp<=35){
			System.out.println("Go Snow Shoeing.");
		}
		else{
		System.out.println("Sit at home, and do absolutely nothing.");
			}
		
	}
		
	}
}