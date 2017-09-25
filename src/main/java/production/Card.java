package production;

public class Card {

	protected String[] suits = { "Spades", "Clubs", "Hearts", "Diamonds" };
	
	protected int[] values = { 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14 };

	public String convertToString(int number) {
		if(number == 2 || number == 3) {
			return "" + number;
		}
		return "error";
	}
	
}
