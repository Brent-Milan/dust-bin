package production;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class HandTest {
	
	Hand underTest;

	@Before
	public void setUp() throws Exception {
		underTest = new Hand();
	}

	@Test
	public void shouldReturnAnArrayWithASizeOf5ForPlayer1() {
		int expected = 5;
		assertEquals(expected, underTest.player1.length);
	}  
	 
	
//	@Test
//	public void shouldReturnAnArrayWithASizeOf5ForPlayer2() {
//		int expected = 5;
//		assertEquals(expected, underTest.player2.length);
//	} 

}
