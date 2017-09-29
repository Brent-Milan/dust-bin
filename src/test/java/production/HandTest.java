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
	public void shouldReturnAnArrayWithALengthOf5() {
		int expected = 5;
		assertEquals(expected, underTest.player1.length);
	}

}
