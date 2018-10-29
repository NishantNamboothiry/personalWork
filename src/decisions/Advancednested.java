package decisions;
import java.util.Scanner;

public class Advancednested {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		int counter=0;
		int factor=1;
		{
			for(counter=1; counter<=4; counter++){
		for (factor=1;factor<=5; factor = factor +1){
		if(factor!=3){
		System.out.print(factor +" ");
		}
		else{
			System.out.print(counter +" ");
		}
		System.out.print();
		}
	}
}
}
}