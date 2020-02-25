package klad3;

public class IntPoint {
	int x_value;
	int y_value;

	public IntPoint(int x, int y) {
		x_value = x;
		y_value = y;
	}

	public int getX() {
		return x_value;
	}

	public int getY() {
		return y_value;
	}
	
	public boolean equals(IntPoint other) {
		boolean result = true;
		int x = other.x_value;
		int y = other.y_value;
		
		if (x_value !=x || y_value != y) {
			result = false;
		}
		
		return result;
	}

	public IntVector minus(IntPoint other) {
		
		int x = this.getX() - other.getX();
		int y = this.getY() - other.getY();
		IntVector result = new IntVector(x,y);
		return result;
	}
	
	public boolean isOnLineSegment​(IntPoint b, IntPoint c) {
		boolean result = false;
		IntPoint a = new IntPoint(x_value, y_value);
		
		
		return result;
	}

}
