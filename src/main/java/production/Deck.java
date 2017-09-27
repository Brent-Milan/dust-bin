package production;

import java.util.ArrayList;
import java.util.HashMap;

public class Deck {
	
	Card card = new Card();
	
	
	public ArrayList<String> createSuitKeys(String suit) {
		ArrayList<String> suitCards = new ArrayList<String>();
		String suitLetter = card.convertToString(suit);
		int[] values = card.values;
		for(int index = 0; index < values.length; index++) {
			String value = card.convertToString(values[index]);
			String card = suitLetter + value;
			suitCards.add(card);
		}
		return suitCards;
	}


	public ArrayList<String> createDeckKeys() {
		ArrayList<String> newDeck = new ArrayList<String>();
		ArrayList<String> spades = createSuitKeys("Spades");
		ArrayList<String> hearts = createSuitKeys("Hearts");
		ArrayList<String> clubs = createSuitKeys("Clubs");
		ArrayList<String> diamonds = createSuitKeys("Diamonds");
		newDeck.addAll(spades);
		newDeck.addAll(hearts);
		newDeck.addAll(clubs);
		newDeck.addAll(diamonds);
		return newDeck;
	}


	public HashMap<String, Integer> createDeck() {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		ArrayList<String> keys = createDeckKeys();
		String[] keysAsArray = keys.toArray(new String[keys.size()]);
		int[] values = card.values;
		for(int index = 0; index < keysAsArray.length ; index++) {
			for(int index2 = 0; index < values.length; index++) {
				map.put(keysAsArray[index], values[index2]);
			}
		}
		return map;
	}

}
