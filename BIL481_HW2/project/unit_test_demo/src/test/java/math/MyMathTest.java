

import org.junit.Test;

import demo.junit_class_demo.math.MyMath;

import org.junit.Assert;

/**
 * An class that provides test cases for the 
 * "simple" math operations of the MyMath 
 * class, for demonstrating Unit Testing.
 * @author agkortzis (antonis.gkortzis@gmail.com)
 */
public class MyMathTest {
	MyMath mm = new MyMath();
	
	/*
	 * A unit test that checks a valid positive input
	 */
    @Test
    public void testGetSignShouldReturnPositive() {
    	assertEquals("5 is positive", "positive", mm.checkSign(5));
    	assertEquals("4 is positive", "positive", mm.checkSign(4));
    	assertEquals("3 is positive", "positive", mm.checkSign(3));
    	assertEquals("8 is positive", "positive", mm.checkSign(8));
    }
    
    /*
	 * A unit test that checks a valid negative input
	 */
    @Test
    public void testGetSignShouldReturnNegative() {
    	assertEquals("-5 is negative", "negative", mm.checkSign(-5));
    	assertEquals("-4 is negative", "negative", mm.checkSign(-4));
    	assertEquals("-3 is negative", "negative", mm.checkSign(-3));
    	assertEquals("-8 is negative", "negative", mm.checkSign(-8));
    }
    
    
}



