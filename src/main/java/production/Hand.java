package production;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Hand {
	
	Deck deck = new Deck();
	protected ArrayList<String> keyList = deck.createDeckKeys();
	
	Random r = new Random();

	public void drawCards(HashMap<String, Integer> deck) {
		int numberOfCardsDrawn = 5;
		for(int index = 1; index < numberOfCardsDrawn; index++) {
			int randomElement = r.nextInt(deck.size());
			String randomKey = keyList.get(randomElement);
			deck.remove(randomKey);
		}  
	} 
	
	protected ArrayList<String> getKeyList() {
		return keyList;
	}


}
