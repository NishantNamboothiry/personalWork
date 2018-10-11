package Greeter;

public class Worker {
	private int hours;
	private double rate;
	private double payCheck;
	
	public Worker() {
		hours=2;
		rate=10.7;
	}
	public double payCheck() {
		return(hours*rate);
	}
	public double getraise() {
		return(payCheck +3);
	}
}
