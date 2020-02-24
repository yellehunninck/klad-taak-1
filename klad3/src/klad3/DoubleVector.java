package klad3;

public class DoubleVector {
	double x_value;
	double y_value;
	
	DoubleVector(double x, double y){
		x_value =x;
		y_value=y;
	}
	
	
	public double getX() {
		return x_value;
	}


	public double getY() {
		return y_value;
	}


	public DoubleVector scale(double d) {
		
		DoubleVector temp = new DoubleVector( d*x_value, d*y_value);
		return temp;
	}


	public DoubleVector plus(DoubleVector other) {
		
		double new_x = x_value + other.x_value;
		double new_y= y_value +other.y_value;
		DoubleVector temp = new DoubleVector(new_x,new_y);
		return temp;
	}


	public double getSize() {
		return 2;
	}


	public double dotProduct(DoubleVector other) {
		
		return x_value * other.x_value + y_value *other.y_value;
	}


	public double crossProduct(DoubleVector other) {

		return x_value*other.y_value - y_value *other.x_value;
	}


	public double asAngle() {
		return 15;
	}


	
		
}
