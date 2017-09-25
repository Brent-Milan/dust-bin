package production;

import static org.junit.Assert.*;

import java.util.Arrays;
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
	
	@Test
	public void shouldContainExpectedElements() {
		int[] expected = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14 };
		assertArrayEquals(expected, underTest.values);
	}

	@Test
	public void shouldReturnStringFor2() {
		String expected = "2";
		
		assertEquals(expected, underTest.convertToString(2));
	}
	
	@Test
	public void shouldReturnStringFor3() {
		String expected = "3";
		
		assertEquals(expected, underTest.convertToString(3));
	}
	
	@Test 
	public void shouldReturnStringFor10AsT() {
		String expected = "T";
		assertEquals(expected, underTest.convertToString(10));
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
