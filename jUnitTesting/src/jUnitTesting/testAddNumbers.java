package jUnitTesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddNumbers {

	@Test
	public void test() {
		jUnitFunction numAdd = new jUnitFunction();
		int result = numAdd.addNumbers(1, 2);
		assertEquals(3, result);
		
		result = numAdd.addNumbers(1, 5);
		assertEquals(5, result);
	}

}
