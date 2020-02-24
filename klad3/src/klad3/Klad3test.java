package klad3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Klad3test {

	@Test
	
	void test() {
		/**
		 * Test cases to test class Doublevector.
		 */
		Doublevector myVector =  new Doublevector(2,1);
		
		assert myVector.getX() == 2;
		assert myVector.getY() == 1;
		
		myVector = myVector.scale(2);
		assert myVector.getX()==4;
		assert myVector.getY()==2;
		
		Doublevector otherVector= new Doublevector(4,4);
		myVector = myVector.plus(otherVector);
		assert myVector.getX()==8;
		assert myVector.getY()==6;
		
		assert myVector.size() == 2;
		
		assert myVector.dotProduct
		
		
		
		
	}

}
