package production;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DeckTest {
	
	Deck underTest;

	@Before
	public void setUp() throws Exception {
		underTest = new Deck();
	}
	
	@Test
	public void shouldReturnStringS2() {
		String expected = "S2";
		
		assertEquals(expected, underTest.createCard());
	}

//	@Test
//	public void shouldContainAllHeartCards() {
//		String[] expected = { "H2", "H3", "H4", "H5", "H7", "H8", "H9", "HT", "HJ", "HQ", "HK", "HA" };
//	}

}
