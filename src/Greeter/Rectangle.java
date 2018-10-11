package Greeter;
import java.util.Scanner;

public class Rectangle {
	private double length;
	private double width;
	
	public Rectangle() {
		length=10;
		width=10;
}
	public double getlength() {
		return length;
}
	public double getwidth() {
		return width;	
}
	public double getperimeter() {
		return (length+width+length+width);
}
	public double getarea() {
		return (length*width);
}
	public double setlength(double newLength) {
		return length= newLength;		
}
	public double setwidth(double newWidth) {
		return width= newWidth;
	}

}
