import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class unitTestTest {

	@BeforeEach
	void obj() {
		System.out.println("Run before each method");
	}
	
	@BeforeAll
	static void obj1() {
		System.out.println("Run before all method");
	}
	
	@AfterEach
	void obj2() {
		System.out.println("RUn AFTER each method");
	}
	
	@AfterAll
	static void obj3() {
		System.out.println("Run AFTER each method");
	}
	
	@Test
	@Disabled
	void test() {
		fail("Not yet implemented");
	}
	
	
	@Test
	@DisplayName("Addition")
	void addTest() {
		unitTest addobj = new unitTest();
		int expected = 10;
		int actual = addobj.add(3, 7);
		assertEquals(expected, actual);
	}
	
	
	@Test
	@DisplayName("Multiplication")
	void multTest() {
		unitTest multobj = new unitTest();
		int expected = 8;
		int actual = multobj.mult(2, 2, 2);
		assertEquals(expected, actual);

	}
	
	@Test
	@DisplayName("Division")
	void divTest() {
		unitTest divobj = new unitTest();
        int expected = 2;
		int actual = divobj.div(10, 5);
		assertEquals(expected, actual);		
	}
	
	
	

}
