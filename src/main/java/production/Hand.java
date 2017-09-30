package production;

import java.util.Random;

public class Hand {
	
	Random r = new Random();
	int element1 = 1 + r.nextInt(52);
	int element2 = 1 + r.nextInt(52);
	int element3 = 1 + r.nextInt(52);
	int element4 = 1 + r.nextInt(52);
	int element5 = 1 + r.nextInt(52);
	
	Card[] player1 = new Card[5];


}
