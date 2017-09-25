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
	public void shouldReturnAFrequencyOfOneSpade() {
		int count = 0;
		for(String suitName: underTest.suits) {
			if(suitName == "Spades") {
				count++;
			}
		}
		
		assertEquals(1, count);
	}

}
