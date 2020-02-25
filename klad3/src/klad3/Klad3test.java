package klad3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Klad3test {

	@Test
	
	void test() {
		/**
		 * Test cases to test class DoubleVector.
		 */
		DoubleVector myVector =  new DoubleVector(2,1);
		
		assert myVector.getX() == 2;
		assert myVector.getY() == 1;
		
		myVector = myVector.scale(2);
		assert myVector.getX()==4;
		assert myVector.getY()==2;
		
		DoubleVector otherVector= new DoubleVector(4,4);
		myVector = myVector.plus(otherVector);
		assert myVector.getX()==8;
		assert myVector.getY()==6;
		
		assert myVector.getSize() == 2;
		
		assert myVector.dotProduct(otherVector) == 56;
		
		assert myVector.crossProduct(otherVector)==8;
		
		assert myVector.asAngle()==15;
		
		/**
		 * Test cases to test class DoublePoint
		 */
		
		DoublePoint myPoint = new DoublePoint(2,4);
		
		assert myPoint.getX() == 2;
		assert myPoint.getY() == 4;
		
		DoubleVector resultvector = new DoubleVector(0,0);
		DoublePoint otherpoint = new DoublePoint(1,3);
		
		resultvector = myPoint.minus(otherpoint);
		assert resultvector.getX()==1;
		assert resultvector.getY()==1;
		
		DoublePoint resultpointdouble = new DoublePoint(0,0);
		
		resultpointdouble = myPoint.plus(otherVector);
		assert resultpointdouble.getX() == 6;
		assert resultpointdouble.getY()== 8;
		
		IntPoint resultpointint = new IntPoint(0,0);
		
		resultpointint = myPoint.round();
		assert resultpointint.getX()==3;
		assert resultpointint.getY()==4;
		
		
	}

}
