package production;

import java.util.ArrayList;

public class Deck {
	
	Card card = new Card();
	ArrayList<String> cards = new ArrayList<String>();

	public ArrayList<String> createSuit(String suit) {
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

	public ArrayList<String> getCards() {
		return cards;
	}

//	public ArrayList<String> createDeck() {
//		ArrayList<String> newDeck = new ArrayList<String>();
//		ArrayList<String> spades = createSuit("Spades");
//		return null;
//	}

}
