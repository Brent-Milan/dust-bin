package production;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

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
		
		
		assertEquals(expected, underTest.createSuitKeys("Spades"));
	}
	
	@Test
	public void shouldReturnListWithSizeOf52() {
		int expected = 52;
		ArrayList<String> result = underTest.createDeckKeys();
		
		assertEquals(expected, result.size());
	}
	
	@Test
	public void shouldContainAnAceOfEachSuit() {
		ArrayList<String> result = underTest.createDeckKeys();
		List<String> aces = new ArrayList<String>();
		aces.add("SA");
		aces.add("CA");
		aces.add("DA");
		aces.add("HA");
		assertTrue(result.containsAll(aces));
	}
	
	@Test
	public void shouldReturnValueOf2() {
		HashMap<String, Integer> test = underTest.createSuitMap("Spades");
		int result = test.get("S2");
		
		assertEquals(2, result);
	}
	
//	@Test
//	public void shouldReturnValueOf2ForHearts() {
//		HashMap<String, Integer> test = underTest.createDeck();
//		int result = test.get("H2");
//		
//		assertEquals(2, result);
//	}


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
