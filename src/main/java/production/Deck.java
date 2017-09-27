package production;

import java.util.ArrayList;

public class Deck {
	
	Card card = new Card();
	ArrayList<String> cards = new ArrayList<String>();

	public ArrayList<String> getCards() {
		return cards;
	}
	
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


	public ArrayList<String> createKeyDeck() {
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

}
