package production;

import java.util.ArrayList;

public class Deck {
	
	Card card = new Card();
	ArrayList<String> cards = new ArrayList<String>();

	public void createSuit(String suit) {
		String suitLetter = card.convertToString(suit);
		int[] values = card.values;
		for(int index = 0; index < values.length; index++) {
			String value = card.convertToString(values[index]);
			String card = suitLetter + value;
			cards.add(card);
		}
		
	}

	public ArrayList<String> getCards() {
		return cards;
	}

}
