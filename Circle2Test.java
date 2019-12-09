
/***
* Example JUnit testing class for Circle1 (and Circle)
*
* - must have your classpath set to include the JUnit jarfiles
* - to run the test do:
*     java org.junit.runner.JUnitCore Circle1Test
* - note that the commented out main is another way to run tests
* - note that normally you would not have print statements in
*   a JUnit testing class; they are here just so you see what is
*   happening. You should not have them in your test cases.
***/

import org.junit.*;

public class Circle2Test
{
   // Data you need for each test case
   private Circle2 circle1;

// 
// Stuff you want to do before each test case
//
@Before
public void setup()
{
   System.out.println("\nTest starting...");
   circle1 = new Circle2(1,2,3);
}

//
// Stuff you want to do after each test case
//
@After
public void teardown()
{
   System.out.println("\nTest finished.");
}

//
// Test a simple positive move
//
@Test
public void simpleMove()
{
   Point p;
   System.out.println("Running test simpleMove.");
   p = circle1.moveBy(1,1);
   Assert.assertTrue(p.x == 2 && p.y == 3);
}

// 
// Test a simple negative move
//
@Test
public void simpleMoveNeg()
{
   Point p;
   System.out.println("Running test simpleMoveNeg.");
   p = circle1.moveBy(-1,-1);
   Assert.assertTrue(p.x == 0 && p.y == 1);
}

//
// My tests
//

//Testing circle constructor.
@Test
public void circleTest(){
	Circle2 test0 = new Circle2(5, 6, 10);
	Assert.assertEquals("X-coord equals 5",(int)test0.center.x, 5);
	Assert.assertEquals("Y-coord equals 6",(int)test0.center.y, 6);
	Assert.assertEquals("Radius equals 6",(int)test0.radius, 10);
}

//Testing whether or not negative numbers work, with a proven case.
@Test
public void intersectsCircle(){
	Circle2 test1 = new Circle2(1,2,3);	
	Circle2 test2 = new Circle2(-1,-2,3);
	Assert.assertTrue("Testing intersection", test1.intersects(test2));
}

//Scale a circle. Expected output 100.
@Test
public void scaleCircle(){
	Circle2 test3 = new Circle2(2,2,10);
	Assert.assertEquals("The radius must equal 100",(int)100,(int)test3.scale(10));
}

//Testing moveBy with simple varying parameters, since negatives have already been tested.
@Test
public void moveByTest(){
	Circle2 test4 = new Circle2(2,2,2);	
	Assert.assertEquals("The point is at (2,2)",(int)test4.center.x, 2);
	Assert.assertEquals("The point is at (2,2)",(int)test4.center.y, 2);
	test4.moveBy(1,2);
	Assert.assertEquals("The point should be at (3,3)",(int)test4.center.x, 3);
	Assert.assertEquals("The point should be at (3,3)",(int)test4.center.y, 4);

}


/*** NOT USED
public static void main(String args[])
{
   try {
      org.junit.runner.JUnitCore.runClasses(
               java.lang.Class.forName("Circle1Test"));
   } catch (Exception e) {
      System.out.println("Exception: " + e);
   }
}
***/

}

