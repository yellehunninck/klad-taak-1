package klad3;

public class DoublePoint {
	double x_value;
	double y_value;
	
	DoublePoint(double x, double y){
		x_value =x;
		y_value=y;
	}
	
	public double getX() {
		return x_value;
	}


	public double getY() {
		return y_value;
	}

	public DoubleVector minus(DoublePoint other) {
		DoubleVector temp = new DoubleVector( x_value - other.x_value, y_value-other.y_value);
		return temp;
	}

	public DoublePoint plus(DoubleVector other) {
		DoublePoint temp = new DoublePoint(x_value + other.x_value, y_value + other.y_value );
		return temp;
	}

	public IntPoint round() {
		int x = (int) Math.round(x_value);
		int y = (int) Math.round(y_value);
		IntPoint intpoint = new IntPoint(x,y);
		return intpoint;
	}

	
	
	

}
