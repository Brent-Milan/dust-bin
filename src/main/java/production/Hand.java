package production;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Hand {
	
	Deck deck = new Deck();
	protected ArrayList<String> keyList = deck.createDeckKeys();
	protected HashMap<String, Integer> gameDeck = deck.createDeck();
	
	Random r = new Random();

	public void drawCards(HashMap<String, Integer> deck) {
		int numberOfCardsDrawn = 5;
		for(int index = 0; index < numberOfCardsDrawn; index++) {
			int randomElement = 1 + r.nextInt(keyList.size());
			String randomKey = keyList.get(randomElement);
			deck.remove(randomKey);
			keyList.remove(randomElement);
			System.out.println(keyList.size());
			System.out.println(deck.size());
		}  
	} 
	
	protected ArrayList<String> getKeyList() {
		return keyList;
	}


}
