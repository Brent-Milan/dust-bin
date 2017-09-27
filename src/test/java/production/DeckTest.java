package production;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class DeckTest {
	
	Deck underTest;
	Card card = new Card();

	@Before
	public void setUp() throws Exception {
		underTest = new Deck();
	}
	
	@Test
	public void shouldReturnSuitOfSpades() {
		ArrayList<String> expected = createSpades();
		underTest.createSuit("Spades");
		
		assertEquals(expected, underTest.getCards());
	}

	private ArrayList<String> createSpades() {
		ArrayList<String> spades = new ArrayList<String>();
		spades.add("S2");
		spades.add("S3");
		spades.add("S4");
		spades.add("S5");
		spades.add("S6");
		spades.add("S7");
		spades.add("S8");
		spades.add("S9");
		spades.add("ST");
		spades.add("SJ");
		spades.add("SQ");
		spades.add("SK");
		spades.add("SA");
		return spades;
	}
	
	

//	@Test
//	public void shouldContainAllHeartCards() {
//		String[] expected = { "H2", "H3", "H4", "H5", "H7", "H8", "H9", "HT", "HJ", "HQ", "HK", "HA" };
//	}

}
