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
		
		
		
	}

}
