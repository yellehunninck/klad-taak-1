package klad3;

public class Doublevector {
	double x_value;
	double y_value;
	
	Doublevector(double x, double y){
		x_value =x;
		y_value=y;
	}
	
	
	public double getX() {
		return x_value;
	}


	public double getY() {
		return y_value;
	}


	public Doublevector scale(double d) {
		
		Doublevector temp = new Doublevector( d*x_value, d*y_value);
		return temp;
	}


	public Doublevector plus(Doublevector other) {
		
		double new_x = x_value + other.x_value;
		double new_y= y_value +other.y_value;
		Doublevector temp = new Doublevector(new_x,new_y);
		return temp;
	}


	
		
}
