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
		ArrayList<String> expected = createTestSuitSpades();
		
		
		assertEquals(expected, underTest.createSuit("Spades"));
	}
	
	@Test
	public void shouldReturnListWithSizeOf52() {
		int expected = 52;
		ArrayList<String> result = underTest.createDeck();
		
		assertEquals(expected, result.size());
	}


	private ArrayList<String> createTestSuitSpades() {
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
	
	

}
