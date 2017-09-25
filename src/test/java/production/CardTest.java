package production;

import static org.junit.Assert.*;

import java.util.Collections;

import org.junit.Before;
import org.junit.Test;

public class CardTest {
	
	Card underTest;

	@Before
	public void setUp() throws Exception {
		underTest = new Card();
	}

	@Test
	public void shouldReturnAFrequencyOfOneForSpades() {
		int count = findElementFrequency(underTest.suits, "Spades");
		
		assertEquals(1, count);
	}
	
	@Test
	public void shouldReturnAFrequencyOfOneForHearts() {
		int count = findElementFrequency(underTest.suits, "Hearts");
		
		assertEquals(1, count);
	}
	
	@Test
	public void shouldReturnAFrequencyOfOneForClubs() {
		int count = findElementFrequency(underTest.suits, "Clubs");
		
		assertEquals(1, count);
	}
	
	@Test
	public void shouldReturnAFrequencyOfOneForDiamonds() {
		int count = findElementFrequency(underTest.suits, "Diamonds");
		
		assertEquals(1, count);
	}

	private int findElementFrequency(String[] array, String message) {
		int count = 0;
		for(String suitName: array) {
			if(suitName == message) {
				count++;
			}
		}
		return count;
	}

}
