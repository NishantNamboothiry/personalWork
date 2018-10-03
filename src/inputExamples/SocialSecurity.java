package inputExamples;
import java.util.Scanner;

public class SocialSecurity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 0;
		int socialsec = 0;
			Scanner input = new Scanner (System.in);
			System.out.println("What is your age?");
			age = input.nextInt();
			System.out.println("What is your Social Security number?");
			socialsec = input.nextInt();
			System.out.println("You are " +age +" years old. There are " +(18-age)+" until you can vote. And the last four digits of your Social Security Number, are " +(socialsec%10000) );
			
	}

}
