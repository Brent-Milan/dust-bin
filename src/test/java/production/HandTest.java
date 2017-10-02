package production;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;

import org.junit.Before;
import org.junit.Test;

public class HandTest {
	
	Hand underTest;
	Deck deck;
	
	@Before
	public void setUp() throws Exception {
		underTest = new Hand();
		deck = new Deck();
	}
	
	@Test
	public void shouldReturnArrayListOf52Keys() {
		int expected  = 52;
		assertEquals(expected, underTest.getKeyList());
	}

	@Test
	public void shouldRemoveFiveKeysFromDeckOf52_AndReturnSizeOf47() {
		HashMap<String, Integer> testMap = deck.createDeck();
		underTest.drawCards(testMap); 
		assertEquals(47, testMap.size());
	}  
	 

}
