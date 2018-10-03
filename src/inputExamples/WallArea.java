package inputExamples;

import java.util.Scanner;
public class WallArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int width= 0;
		Scanner input =new Scanner (System.in);
		System.out.println("What is the width of your wall?");
		width = input.nextInt();
		
		System.out.println("Your wall is " + (width*8) +" ft.");
	
	}

}