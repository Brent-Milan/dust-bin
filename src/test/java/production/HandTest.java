package production;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;

import org.junit.Before;
import org.junit.Test;

public class HandTest {
	
	Hand underTest;
	Deck deck = new Deck();
	
	@Before
	public void setUp() throws Exception {
		underTest = new Hand();
	}
	
	@Test
	public void shouldReturnArrayListOf52Keys() {
		int expected  = 52;
		ArrayList<String> testList = underTest.getKeyList();
		assertEquals(expected, testList.size());
	}

	@Test
	public void shouldRemoveFiveKeysFromDeckOf52_AndReturnSizeOf47() {
		underTest.drawCards(underTest.gameDeck); 
		assertEquals(47, underTest.gameDeck.size());
		
	}   
	 

}
