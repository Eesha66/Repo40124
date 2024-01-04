import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class unitTestTest {

	@Test
	void test() {
		fail("Not yet implemented");
	}
	
	@Test
	void addTest() {
		unitTest addobj = new unitTest();
		int expected = 10;
		int actual = addobj.add(3, 7);
		assertEquals(expected, actual);
	}
	
	@Test
	void multTest() {
		unitTest multobj = new unitTest();
		int expected = 8;
		int actual = multobj.mult(2, 2, 2);
		assertEquals(expected, actual);

	}
	
	@Test
	void divTest() {
		unitTest divobj = new unitTest();
        int expected = 2;
		int actual = divobj.div(10, 5);
		assertEquals(expected, actual);

	}

}
