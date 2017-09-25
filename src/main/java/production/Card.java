package production;

public class Card {

	protected String[] suits = { "Spades", "Clubs", "Hearts", "Diamonds" };
	
	protected int[] values = { 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14 };

	public String convertToString(int number) {
		if(number == 2 || number == 3 || number == 4 || number == 5 || number == 6 || number == 7 || number == 8 || number == 9) {
			return "" + number;
		}	
		if(number == 10) {
			return "T";
		}
		return "error";
		}
	
}
