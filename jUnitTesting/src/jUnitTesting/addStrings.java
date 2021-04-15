package jUnitTesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class addStrings {

	@Test
	public void test() {
		jUnitFunction addString = new jUnitFunction();
		String result = addString.addStrings("He", "llo");
		assertEquals("Hello", result);
		
		result = addString.addStrings("a", "b");
		assertEquals("Hello", result);
	}

}
