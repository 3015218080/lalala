package testtriangle;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TriangleTest {

//	@Test
//	public void test() {
//		fail("Not yet implemented");
//	}
	
	private Triangle t;
	
	@Before
	public void setUp() throws Exception{
		t = new Triangle();
	}
	
	@Test
	public void testisEquilateral() {
		
		assertFalse(t.isEquilateral(1,2,2));
	}
	
	@Test
	public void testisIsosceles() {
		
		assertTrue(t.isIsosceles(1,2,2));
	}
	
	@Test
	public void testisScalene() {
		
		assertTrue(t.isScalene(5,2,4));
	}
	

}
