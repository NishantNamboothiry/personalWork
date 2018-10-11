package Greeter;
import java.util.Scanner;

public class Circle {
	private double Radius;
	
	public Circle() {
		Radius=-99.9;
}
public double getRadius(){

	return Radius;
}
public double getCircumfrence() {
	return (2*Radius*Math.PI);
}
public double getArea() {
	return  (Math.PI*Radius*Radius);
}
public double setRadius(double newSomething) {
	return Radius = newSomething;
	
	}
}

