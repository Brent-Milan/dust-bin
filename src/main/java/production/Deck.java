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
		HashMap<String, Integer> spadeEntries = createSuitMap("Spades");
		HashMap<String, Integer> heartEntries = createSuitMap("Hearts"); 
		HashMap<String, Integer> clubEntries = createSuitMap("Club"); 
		HashMap<String, Integer> diamondEntries = createSuitMap("Diamond"); 
		
		HashMap<String, Integer> deckMap = new HashMap<String, Integer>(); 
		deckMap.putAll(spadeEntries);
		deckMap.putAll(heartEntries);
		deckMap.putAll(clubEntries);
		deckMap.putAll(diamondEntries);
		return deckMap;
	}
	
	public HashMap<String, Integer> createSuitMap(String suit) {
		HashMap<String, Integer> suitMap = new HashMap<String, Integer>();
		ArrayList<String> keys = createSuitKeys(suit);
		String[] keysAsArray = keys.toArray(new String[keys.size()]);
		int[] values = card.values;
		for(int index = 0; index < keysAsArray.length ; index++) {
			for(int index2 = 0; index < values.length; index++) {
				suitMap.put(keysAsArray[index], values[index2]);
			}
		}
			return suitMap;
	}

}
